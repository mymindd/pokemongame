import java.util.*;

class Forest{
	private Random rand;
	private Pokemon wildPokemon;
	private int randPokemon;

	public Forest(){
		rand = new Random();
	}

	public void foundPokemon(){
		randPokemon = 0;
		randPokemon = rand.nextInt(3);

		if(randPokemon == 0){
			System.out.println("You found wild Pichu!!!");
			wildPokemon = new Pichu("wild pichu", rand.nextInt(10) + 1, 1f);
		}

		else if(randPokemon == 1){
			System.out.println("You found wild Snorlax!!!");
			wildPokemon = new Snorlax("wild snorlax", rand.nextInt(10) + 1, 1f);
		}

		else if(randPokemon == 2){
			System.out.println("You found wild Eevee!!!");
			wildPokemon = new Eevee("wild eevee", rand.nextInt(10) + 1, 1f);
		}
	}

	public Pokemon getWildPokemon(){
		return wildPokemon;
	}
	
}
