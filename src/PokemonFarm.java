import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Helioptile("Helioptile", 5.50, 2.5));
        pokemons.add(new Charmander("Charmander",10.5, 4.2));
        pokemons.add(new Pichu("Pichu", 2.5, 2.2));
        pokemons.add(new Heliolisk("Heliolisk", 50.25, 25));
        pokemons.add(new Charmeleon("Charmeleon",70.5, 42));
        pokemons.add(new Pikachu("Pikachu", 30.5, 22));

	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public Pokemon getPokemon(String pokemonName){
        for(Pokemon pokemon: pokemons){
            if(pokemon.getName().equalsIgnoreCase(pokemonName))
                return pokemon;
        }
        return null;
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
