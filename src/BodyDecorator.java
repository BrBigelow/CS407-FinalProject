package finalProject;

public abstract class BodyDecorator implements BodyComponent 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	protected BodyComponent bodyComp;
	public BodyDecorator(BodyComponent bodyComp){
		this.bodyComp = bodyComp;
	}
	public int getTotalDefense(){
		return bodyComp.getTotalDefense();
	}
	public int getTotalOffense(){
		return bodyComp.getTotalOffense();
	}
	public int getTotalSpeed(){
		return bodyComp.getTotalSpeed();
	}
	
}
