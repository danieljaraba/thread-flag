package threads;

import model.Flag;

public class FlagThread extends Thread{

    private Flag flag;
    private int size;
    private int y;
    private int x;
    private int time;
    private final static String ESC = "\u001b[";

    public FlagThread(Flag flag, int size, int y, int time){
        this.flag = flag;
        this.size = size;
        this.time = time;
        this.y = y;
        this.x = 0;
    }

    public void advance(){
        for(int i = 0; i<size; i++){
            System.out.print(ESC+x+"G"+ESC+(y+i)+"d"+flag.advance());
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while(x<125){
            advance();
            x++;
        }
        System.out.println(ESC+0+"m");
    }
}
