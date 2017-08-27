

import java.util.ArrayList;

class Athlete extends Participant{
	public Athlete(String ID,int Age,String Name,String State){
		super(ID,Age,Name,State);
	}
	static ArrayList<Athlete> athlete=new ArrayList<Athlete>();
	public static void addAthlete(){
		athlete.add(new Swimmer("S01",24,"Aaron","VIC"));
		athlete.add(new Swimmer("S02",28,"Eric","NSW"));
		athlete.add(new Swimmer("S03",30,"Kelly","VIC"));
		athlete.add(new Swimmer("S04",21,"Barret","VIC"));
		athlete.add(new Sprinter("R01",19,"Brian","NSW"));
		athlete.add(new Sprinter("R02",22,"Ivan","NSW"));
		athlete.add(new Sprinter("R03",25,"Edward","VIC"));
		athlete.add(new Sprinter("R04",26,"Steven","NSW"));
		athlete.add(new Cyclist("C01",21,"Berg","VIC"));
		athlete.add(new Cyclist("C02",26,"Logan","NSW"));
		athlete.add(new Cyclist("C03",32,"Alexander","VIC"));
		athlete.add(new Cyclist("C04",23,"Jason","VIC"));
		athlete.add(new SuperAthlete("SU01",34,"Cokay","VIC"));
		athlete.add(new SuperAthlete("SU02",23,"William","NSW"));
		athlete.add(new SuperAthlete("SU03",16,"Abbott","VIC"));
		athlete.add(new SuperAthlete("SU04",28,"Owen","NSW"));
		athlete.add(new SuperAthlete("SU05",33,"Nelson","VIC"));
		athlete.add(new SuperAthlete("SU06",22,"Jack","NSW"));
		athlete.add(new SuperAthlete("SU07",25,"Zack","VIC"));
		athlete.add(new SuperAthlete("SU08",28,"Taylor","NSW"));
		athlete.add(new SuperAthlete("SU09",21,"Cobe","VIC"));
		athlete.add(new SuperAthlete("SU10",30,"Parker","NSW"));
		athlete.add(new SuperAthlete("SU11",29,"Able","VIC"));
	}
	public static int compete(Game game){
		if(game instanceof GameSwimming){
			return 100+(int)(Math.random()*101);
		}else if(game instanceof GameCycling){
			return 500+(int)(Math.random()*301);
		}else {
			return 10+(int)(Math.random()*11);
		}
	}
}