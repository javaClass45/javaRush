package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {

            //create person
            case "-c":

                for (int round = 1; round < args.length; round += 3) {
                    Date date = null;
                    try {
                        date = dateFormat.parse(args[round + 2]);
                    } catch (ParseException e) {
                        e.getMessage();
                    }

                    //VALIDATOR: При запуске программы с параметром -с программа должна добавлять человека с заданными
                    // параметрами в конец списка allPeople, и выводить id (index) на экран.
                    Person person;
                    if (args[round + 1].startsWith("м"))
                        person = Person.createMale(args[round], date);
                    else
                        person = Person.createFemale(args[round], date);

                    synchronized (allPeople) {
                        allPeople.add(person);
                    }

                    System.out.println(allPeople.indexOf(person));
                }
                break;

            //update person
            case "-u": {
                synchronized (allPeople) {
                    for (int round = 1; round < args.length; round += 4) {
                        int index = Integer.parseInt(args[round]);
                        Person person = allPeople.get(index);

                        //update name
                        person.setName(args[round + 1]);

                        //udate date
                        Date date = null;
                        try {
                            date = dateFormat.parse(args[round + 3]);
                        } catch (ParseException e) {
                            e.getMessage();
                        }
                        person.setBirthDate(date);

                        //update sex
                        if (args[round + 2].startsWith("м"))
                            person.setSex(Sex.MALE);
                        else
                            person.setSex(Sex.FEMALE);
                    }
                }
                break;
            }
            //remove person
            case "-d": {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);

                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                } //synchronized
                break;
            }
            //print person

            case "-i": {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        StringBuilder s = new StringBuilder();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                        s.append(" ");
                        s.append(dateFormatPrt.format(person.getBirthDate()));
                        System.out.println(s);
                    }
                }
            }
            break;
        }
    }
}