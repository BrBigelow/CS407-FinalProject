package finalProject;

import finalProject.ListUtil;
import java.util.List;
import java.util.ArrayList;

/**
 * Square representing a tile on the board
 * 
 */
public class Square {
	
	private final String squareID;
	// must be one and only one of these
	private  Dirt dirt;
	private  Grass grass;
	private  Rock rock;
	private  Sand sand;
	private  Sea sea;
	private  Lake lake;
	// optional
	private  Snow snow;
	private final List<Wave> waves;
	private final List<Elevation> elevation;
	private final List<DeepWater> deepWater;
	private final List<Cloud> clouds;
	
	private Square(String squareID, SquareBuilder builder){
		this.squareID = squareID;
		dirt = builder.dirt;
		grass = builder.grass;
		rock = builder.rock;
		sand = builder.sand;
		sea = builder.sea;
		lake = builder.lake;
		snow = builder.snow;
		waves = builder.buildWaves();
		elevation = builder.buildElevation();
		deepWater = builder.buildDeepWater();
		clouds = builder.buildClouds();
	}
	
	public String toString(){
		String returnString = "["+squareID+" ";
		returnString += "[waves "+ListUtil.listToString(waves)+"] ";
		returnString += "[elevation "+ListUtil.listToString(elevation)+"] ";
		returnString += "[deepWater "+ListUtil.listToString(deepWater)+"] ";
		returnString += "[clouds "+ListUtil.listToString(clouds)+"] ";
		if(dirt!=null){returnString += dirt.toString()+" ";}
		if(grass!=null){returnString += grass.toString() + " ";}
		if(rock!=null){returnString += rock.toString()+" ";}
		if(sand!=null){returnString += sand.toString() + " ";}
		if(sea!=null){returnString += sea.toString()+" ";}
		if(lake!=null){returnString += lake.toString() + " ";}
		if(snow!=null){returnString += snow.toString()+" ";}
		return returnString + "]";
	}
	
	/**
	 * Builds a Square object out of the basic elements needed to build any type of square
	 * The methods in this class are called by a SquareBuilderDirector object
	 * After the SquareBuilderDirector has finished executing, the class that called SquareBuilderDirector
	 * should call SquareBuilder.build() which returns an instance of the square.
	 * Used by the SquareBuilderDirector
	 * @see SquareBuilderDirector 
	 * @see Square
	 */
	
	public static class SquareBuilder {
		
		private  Dirt dirt = null;
		private  Grass grass = null;
		private  Rock rock = null;
		private  Sand sand = null;
		private  Sea sea = null;
		private  Lake lake = null;

		private  Snow snow = null;
		private int numWaves;
		private int numElevation;
		private int numDeepWater;
		private int numClouds;
		
		public Square build(String squareID){
			return new Square(squareID, this);
		}
		
		// internal builder functionality
		
	    private Dirt buildDirt() {
	    	Dirt dirt = new Dirt();
	    	return dirt;
	    }
	    
	    private Grass buildGrass() {
	    	Grass grass = new Grass();
	    	return grass;
	    }
	    
	    private Rock buildRock() {
		    Rock rock = new Rock();   
	    	return rock;
	    }
	    
	    private Sand buildSand() {
		    Sand sand = new Sand();
	    	return sand;
	    }
	    
	    private Snow buildSnow() {
		    Snow snow = new Snow();
	    	return snow;
	    }
	    
	    private Sea buildSea() {
	    	Sea sea = new Sea();
	    	return sea;
	    }
	    
	    private Lake buildLake() {
	    	Lake lake = new Lake();
	    	return lake;
	    }
	    
	    private List<Elevation> buildElevation(){
	    	List<Elevation> elevation = new ArrayList<Elevation>();
	        for (int i = 0; i < numElevation; i++) {
	        	elevation.add(new Elevation());
	        }
	        
	        return elevation;
	    }
	    
	    private List<Wave> buildWaves(){
	    	List<Wave> waves = new ArrayList<Wave>();
	        for (int i = 0; i < numWaves; i++) {
	        	waves.add(new Wave());
	        }
	    	return waves;
	    }
	    
	    private List<DeepWater> buildDeepWater(){
	    	List<DeepWater> deepWater = new ArrayList<DeepWater>();
	        for (int i = 0; i < numDeepWater; i++) {
	        	deepWater.add(new DeepWater());
	        }
	        
	        return deepWater;
	    }
	    
	    private List<Cloud> buildClouds(){
	    	List<Cloud> clouds = new ArrayList<Cloud>();
	        for (int i = 0; i < numClouds; i++) {
	        	clouds.add(new Cloud());
	        }
	        
	        return clouds;
	    }
	    	    
	    //external builder functionality
	    public SquareBuilder makeDirt() {
	       this.dirt=buildDirt();
	        return this;
	    }
	    
	    public SquareBuilder makeGrass() {
	        this.grass=buildGrass();
	        return this;
	    }
	    
	    public SquareBuilder makeRock() {
	        this.rock=buildRock();
	        return this;
	    }
	    
	    public SquareBuilder makeSand() {
	        this.sand=buildSand();
	        return this;
	    }
	    
	    public SquareBuilder addSnow() {
	        this.snow=buildSnow();
	        return this;
	    }
	    
	    public SquareBuilder makeSea() {
	        this.sea=buildSea();
	        return this;
	    }
	    
	    public SquareBuilder makeLake() {
	       	this.lake=buildLake();
	        return this;
	    }
	    
	    public SquareBuilder addWaves(int waves){
	    	this.numWaves = waves;
	    	return this;
	    }
	    
	    public SquareBuilder addClouds(int clouds){
	    	this.numClouds = clouds;
	    	return this;
	    }
	    
	    public SquareBuilder addElevation(int elevation){
	    	this.numElevation = elevation;
	    	return this;
	    }
	    
	    public SquareBuilder addDeepWater(int deepWater){
	    	this.numDeepWater = deepWater;
	    	return this;
	    }

	}
	
}