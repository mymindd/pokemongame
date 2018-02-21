import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void feed(){
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
		else{
			for(Pokemon pokemon: pokemons){
				if(pokemonName.equals(pokemon.getName())){
					pokemon.eat();
					System.out.println("Ok !");
				}
				else{
					System.out.println("Sorry, No pokemon this name");
			}
		}
	}}

	public void walk(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.walk();
			}
		}
		else{
			for(Pokemon pokemon:pokemons){
				if(pokemonName.equals(pokemon.getName())){
					pokemon.walk();
					System.out.println("OK !");
				}
				else{
					System.out.println("Sorry, No pokemon this name");
				}
			}

		}

	}
	public void remove(String pokemonName){
		if(pokemonName.equals("all")){
			pokemons.clear();	
			System.out.println("OK !");
		}
		else {
			for(Pokemon pokemon : pokemons){
				if(pokemonName.equals(pokemon.getName())){
					pokemons.remove(pokemon);
					System.out.println("OK !");
					break;
			}
			else{
				System.out.println("Sorry,No pokemon this name");
			}
		}
	}
}
}
