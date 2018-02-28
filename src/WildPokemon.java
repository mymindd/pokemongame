import java.io.*;
import java.util.*;

class WildPokemon{
    private PokeBall pokeBall;
    private GreatBall greatBall;
    private UltraBall ultraBall;
    private String type;
    private float weight;
    private float stepLenght;
    private String name;
    public WildPokemon(String name, String type, float weight, float stepLenght){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.stepLenght = stepLenght;
    }

    public void catchIt (String pokeball){
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
