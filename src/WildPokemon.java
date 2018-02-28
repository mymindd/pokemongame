import java.io.*;
import java.util.*;

class WildPokemon{
    private String[] types;
    private float weight;
    private float stepLenght;
    private String name;
    public WildPokemon(String name, String[] type, float weight, float stepLenght){
        this.name = name;
        this.type = new String[] {"normal"};
        this.weight = weight;
        this.stepLenght = stepLenght;
    }

    public boolean catchIt (String pokeball){
        if(pokeball.equals("pokeball")){
            this.pokeBall.catchIt();
        }
        else if(pokeball.equals("greatball")){
            this.greatBall.catchIt();
        }
        else if(pokeball.equals("ultraball")){
            this.ultraBall.catchIt();
        }

    }
}
