package pkgCalculator;
import java.util.Scanner;

public class Calculator {
	Scanner input = new Scanner(System.in);
	private String playerName; 
	private double atBats;
	private double hits;
	private double doubles;
	private double triples;
	private double homeRuns;
	private double runs;
	private double walks;
	private double hitByPitch;
	private double sacrificeFly;
	private double singles;
	private double battingAverage;
	private double totalBases;
	private double onBasePercent;
	private double sluggingPercent;
	private double onBaseSlugging;
	

	public void singlesCalculator () {
		singles = (hits - (doubles + triples + homeRuns));
	}
	
	public void battingAverageCalculator () {
		battingAverage = ( hits / atBats);
	}
	
	public void totalBasesCalculator () {
		totalBases = (singles + (doubles*2) + (triples*3) + (homeRuns*4));
	}
	
	public void onBasePercentCalculator (){
		onBasePercent = ((hits + walks + hitByPitch)/( atBats + walks + hitByPitch + sacrificeFly));
	}
	
	public void sluggingPercentCalculator () {
		sluggingPercent = (totalBases / atBats);
	}
	public void onBaseSluggingCalculator () {
		onBaseSlugging = onBasePercent + sluggingPercent; 
	}
	
	public Calculator () {
		//Asks user for input
		System.out.print("Enter Player's Name:");
		String playerName = this.input.nextLine();
		System.out.print("Enter Player's At Bats(AB):");
		atBats = this.input.nextDouble();
		System.out.print("Enter Player's Hits(H):");
		hits = this.input.nextDouble();
		System.out.print("Enter Player's Doubles(2B):");
		doubles = this.input.nextDouble();
		System.out.print("Enter Player's Triples(3B):");
		triples = this.input.nextDouble();
		System.out.print("Enter Player's Home Runs(HR):");
		homeRuns = this.input.nextDouble();
		System.out.print("Enter Player's Runs(R):");
		runs = this.input.nextDouble();
		System.out.print("Enter Player's Walks(BB):");
		walks = this.input.nextDouble();
		System.out.print("Enter Player's Hit-By-Pitch(HBP):");
		hitByPitch = this.input.nextDouble();
		System.out.print("Enter Player's Sacrifice Fly(SF):");
		sacrificeFly = this.input.nextDouble();
		
		//Calculates stats based on input values
		singlesCalculator();
		battingAverageCalculator();
		totalBasesCalculator();
		onBasePercentCalculator();
		sluggingPercentCalculator();
		onBaseSluggingCalculator();
		
		//Prints stats
		System.out.printf("The player %s's stats are as follows: \nBatting Average(BA): %f \nTotal Bases(TB): %f \nOn Base Percent(OBP): %f \nSlugging Percent(SLG): %f \nOn Base + Slugging(OBS): %f \n", playerName, battingAverage, totalBases, onBasePercent, sluggingPercent, onBaseSlugging);
	}
}
