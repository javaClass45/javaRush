package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

//  d:/j1/arc.zip
//  d:/j1/text.txt

public class Archiver {
    public static void main(String[] args) throws Exception {
//        Scanner console = new Scanner(System.in);
//        System.out.println("ввести полный путь архива:");
//        String line = console.nextLine();
//        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(line));
//
//         console = new Scanner(System.in);
//        System.out.println("вввести путь к файлу, который будем архивировать:");
//        String newArc = console.nextLine();
//        zipFileManager.createZip(Paths.get(newArc));
//
//        ExitCommand exitCommand = new ExitCommand();
//        exitCommand.execute();
        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }

        } while (operation != Operation.EXIT);
    }
    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage(String.format("\t %d - упаковать файлы в архив", Operation.CREATE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - добавить файл в архив", Operation.ADD.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - удалить файл из архива", Operation.REMOVE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - распаковать архив", Operation.EXTRACT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - просмотреть содержимое архива", Operation.CONTENT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - выход", Operation.EXIT.ordinal()));

        return Operation.values()[ConsoleHelper.readInt()];
    }

}
