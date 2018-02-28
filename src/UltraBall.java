import java.io.*;
import java.util.*;


class UltraBall{
	private float chance;
    
    public UltraBall(float chance){
        this.chance = .9f;
    }

    public boolean catchIt(){
        Random rand = new Random();
        double ch = Math.random() * 100 + 1;
        ch = ch*chance;
        if (ch >= 50){
            return true;
        }
        else return false;
    }


}
