import java.io.*;
import java.util.*;


class UltraBall{
	private float chance;
    
    public UltraBall(float chance){
        this.chance = 1.0f;
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
