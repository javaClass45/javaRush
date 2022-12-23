package com.javarush.task.task25.task2506;

import static java.lang.Thread.State.TERMINATED;

public class LoggingStateThread extends Thread {
   public Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        super.run();
        State state = null;
        while (true) {
            State st = target.getState();
            if (st != state) {
                System.out.println(st);
                state = st;
            } else if (st==TERMINATED) {
                this.interrupt();
                break;
            } else {
                continue;
            }
        }
    }
}
