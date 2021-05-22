package model;

public class Flag {

    private int color;
    private String letter;
    private final static String ESC = "\u001b[";

    public Flag(int color, String letter){
        this.color = color;
        this.letter = letter;
    }

    public String advance(){
        String ret = ESC+color+"m"+letter;
        return ret;
    }

}
