import java.io.*;
import java.util.*;

class WildPokemon{
    private Pichu pichu;
    private Snorlax snorlax;
    private Eevee eevee;
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
    public void find(){
    int poke =(int)Math.random() * 3 + 1;
    if (poke == 1){
        pichu = new Pichu(
                "PichuWild",(float)(Math.random() * 20 + 5),(float)(Math.random() * 2 + 1)
                );
        System.out.println("You found Pichu");}
    else if(poke == 2){
        snorlax = new Snorlax (
                "SnorlaxWild",(float)(Math.random() * 20 + 5),(float)(Math.random() * 2 + 1)
                );
    
        System.out.println("You found Snorlax");}
    else if(poke == 3 ){
        eevee = new Eevee(
                "EeveeWild",(float)(Math.random() * 20 + 5),(float)(Math.random() * 2 + 1)
                );
   
        System.out.println("You found Eevee");}
    }
}
