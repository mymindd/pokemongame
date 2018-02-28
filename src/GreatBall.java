import java.io.*;
import java.util.*;


class GreatBall{
	private float chance;
    
    public GreatBall(float chance){
        this.chance = .9f;
    }

    public boolean cath(){
        Random rand = new Random();
        int ch = rand.nextInt(100);
        ch = ch * chance;
        if (ch >= 50){
            return true;
        }
        else return false;
    }


}
