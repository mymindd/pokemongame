class PokemonGame{
	public static void main(String[] args){
		PokemonFarm pokemonFarm = new PokemonFarm();
//		CommandParser commandParser = new CommandParser(pokemonFarm);

        PokemonGUI pokemonGUI = new PokemonGUI(pokemonFarm);

        
		//commandParser.run();
	}

}
