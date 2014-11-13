package edu.ccsu.cs407.finalproject;

public class StrongBodyDecorator extends BodyDecorator {
	
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public StrongBodyDecorator(BodyComponent bodyComp){
		super(bodyComp);
	}
	
	//because of a strong body they benefits to everything.
	@Override
	public int getTotalDefense(){
		return bodyComp.getTotalDefense() + 5;
	}
	public int getTotalSpeed(){
		return bodyComp.getTotalSpeed() + 5;
	}
	public int getTotalOffense(){
		return bodyComp.getTotalOffense() + 5;
	}
}
