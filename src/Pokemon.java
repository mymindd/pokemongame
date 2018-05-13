import java.util.*;

class Pokemon{
	private String name;
	private double weight;
    private double fristWeight;
	private double damage;
    private double fristDamage;
	private int step;
	private double gainingWeightStep;
	private String[] types;
	private float mood;
    private int level;
    private double exp;
    private double hp;
	public Pokemon(String name,
		       double weight,
		       double damage,
		       double gainingWeightStep,
		       String[] types){
		this.name = name;
		this.weight = weight;
        this.fristWeight = weight;
		this.damage = damage;
		this.gainingWeightStep = gainingWeightStep;
		step = 0;
        level = 1;
        exp = 0;
        hp = 100;

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;

		Random rand = new Random();
		mood = rand.nextInt(5);

	}
    public void goFight(){
       // double dam = Math.random()*100;
		Random rand = new Random();
        int dam = rand.nextInt(100);
        if(this.hp-dam > 0){
            this.hp -= dam;
    }
    }
    public void tain(){
        if (this.weight > this.fristWeight && this.exp < 100){
            this.exp += 10.0;
            this.weight -= (gainingWeightStep/2);
        }
        
    }
    public void levelUp(){
        if(this.exp == 100){
            this.damage += this.level*0.5;
            this.level +=1;
            this.hp = 100;
            this.exp =0;
        }
    }
	public void walk(){
		step += 1;
		weight -= gainingWeightStep;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
	}

	public String getName(){
		return this.name;
	}
    public String getHP(){
        return (""+this.hp);
    }
    public String getDMG(){
        return (""+this.damage);
    }

    public String getWeight(){
        return (""+this.weight);
    }

    public String getLV(){
        return (""+this.level);
    }

    public String getEXP(){
        return (""+this.exp);
    }

    public String getType(){
        String Tot = "";
        for (String type:this.types)
            Tot = Tot+", "+type;
        return Tot;
    }
	public void setName(String name){
		this.name = name;
	}

	public float getMood(){	
		return this.mood;
	}

}
