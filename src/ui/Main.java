package ui;

import model.Flag;
import threads.FlagThread;

public class Main {

    private final static String ESC = "\u001b[";

    public static void main(String[] args) throws InterruptedException {
        Flag flag1 = new Flag(43, " ");
        Flag flag2 = new Flag(44, " ");
        Flag flag3 = new Flag(41, " ");
        FlagThread thread1 = new FlagThread(flag1, 5, 0, 3);
        FlagThread thread2 = new FlagThread(flag2, 2, 5, 10);
        FlagThread thread3 = new FlagThread(flag3, 2, 7, 12);

        System.out.print(ESC+"2J");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
