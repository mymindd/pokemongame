import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
    private Pokemon wildPokemon;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("===============================================================");
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
			else if(command.equals("walk"))
				this.walkPokemons();	
			else if(command.equals("remove"))
				this.delPokemons();
	        else if(command.equals("wild"))
                this.goWild();
        }

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
		String pokemonType = "Eevee";
		String name = "name";
		float weight = 10f;
		float stepLength = 5f;
		

		System.out.print("Enter Pokemon: ");
		pokemonType = commandScanner.nextLine();
		

		if(pokemonType.equals("Eevee")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();
			
			Eevee eevee = new Eevee(name, weight, stepLength);
			pokemonFarm.addPokemon(eevee);
		}	

		else if(pokemonType.equals("Snorlax")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();

			Snorlax snorlax = new Snorlax(name ,weight ,stepLength);
			pokemonFarm.addPokemon(snorlax);
		}
		else if(pokemonType.equals("Pichu")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();

			Pichu pichu = new Pichu(name ,weight ,stepLength);
			pokemonFarm.addPokemon(pichu);
		}
		else{
			System.out.println("Sorry, Don't know this type");
		}
		

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
		else {
			this.pokemonFarm.feed(name);
		}
	}

	private void walkPokemons(){
		System.out.print("Which pokemon do you want to walk?: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.walk("all");
		}
		else{
			this.pokemonFarm.walk(name);
		}
	}
	private void delPokemons(){
		
		System.out.print("Which pokemon do you want to remove?: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.remove("all");
		}
		else{
			this.pokemonFarm.remove(name);
		}
	}
    private void goWild(){
		Forest forest = new Forest();
		Bag bag = new Bag();
		forest.foundPokemon();
		
		System.out.print("Catch or Back: ");
		String comWild = commandScanner.nextLine();

		if(comWild.equalsIgnoreCase("catch")){
			System.out.print("Choose your ball: ");
			String ball = commandScanner.nextLine();
			bag.useBall(ball, forest.getWildPokemon());
			bag.listItem();
		}

		else if(comWild.equalsIgnoreCase("back")){
			System.out.println("Back to farm ...");
		}
		
		
    }
}
