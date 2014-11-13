package edu.ccsu.cs407.finalproject;

public class ShellBodyDecorator extends BodyDecorator {
	
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public ShellBodyDecorator(BodyComponent bodyComp){
		super(bodyComp);
	}
	
	//because of a shelled body they get +10 to defense and -5 to speed.
	@Override
	public int getTotalDefense(){
		return bodyComp.getTotalDefense() + 10;
	}
	public int getTotalSpeed(){
		return bodyComp.getTotalSpeed() - 5;
	}
}
