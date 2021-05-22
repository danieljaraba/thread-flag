package ui;

import model.Flag;
import threads.FlagThread;

public class Main {

    private final static String ESC = "\u001b[";
    private static Flag flag1;
    private static Flag flag2;
    private static Flag flag3;
    private static FlagThread thread1;
    private static FlagThread thread2;
    private static FlagThread thread3;

    public static void main(String[] args) throws InterruptedException {
        flag1 = new Flag(43, " ");
        flag2 = new Flag(44, " ");
        flag3 = new Flag(41, " ");
        thread1 = new FlagThread(flag1, 4, 1, 3);
        thread2 = new FlagThread(flag2, 2, 5, 10);
        thread3 = new FlagThread(flag3, 2, 7, 12);

        System.out.print(ESC+"2J");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
