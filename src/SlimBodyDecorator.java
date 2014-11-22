package finalProject;

public class SlimBodyDecorator extends BodyDecorator {
	
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public SlimBodyDecorator(BodyComponent bodyComp){
		super(bodyComp);
	}
	
	//because of a slim body they get -10 to defense and +15 to speed.
	@Override
	public int getTotalDefense(){
		return bodyComp.getTotalDefense() - 10;
	}
	public int getTotalSpeed(){
		return bodyComp.getTotalSpeed() + 15;
	}
}
