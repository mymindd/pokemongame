import java.io.*;
import java.util.*;


class PokeBall{
	private float chance;
    
    public PokeBall(float chance){
        this.chance = 0.8;
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
