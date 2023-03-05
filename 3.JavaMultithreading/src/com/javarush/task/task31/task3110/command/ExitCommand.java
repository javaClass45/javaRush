package com.javarush.task.task31.task3110.command;


import static com.javarush.task.task31.task3110.ConsoleHelper.writeMessage;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        writeMessage("До встречи!");
    }
}
