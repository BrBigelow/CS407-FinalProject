package finalProject;

import java.util.List;
import java.util.ArrayList;

public class Square {
	
	private final String squareID;

	private final Dirt dirt;
	private final Grass grass;
	private final Rock rock;
	private final Sand sand;
	private final Snow snow;
	private final Sea sea;
	private final Lake lake;
	private final List<Wave> waves;
	private final List<Elevation> elevation;
	private final List<DeepWater> deepWater;
	private final List<Cloud> clouds;
	
	private Square(String squareID, SquareBuilder builder){
		this.squareID = squareID;
		dirt = builder.buildDirt();
		grass = builder.buildGrass();
		rock = builder.buildRock();
		sand = builder.buildSand();
		snow = builder.buildSnow();
		waves = builder.buildWaves();
		sea = builder.buildSea();
		lake = builder.buildLake();
		elevation = builder.buildElevation();
		deepWater = builder.buildDeepWater();
		clouds = builder.buildClouds();
	}
	
	public static class SquareBuilder {
		private boolean dirtBool = false;
		private boolean grassBool = false;
		private boolean rockBool = false;
		private boolean sandBool = false;
		private boolean snowBool = false;
		private boolean seaBool = false;
		private boolean lakeBool = false;
		private int numWaves;
		private int numElevation;
		private int numDeepWater;
		private int numClouds;
		
		public Square build(String squareID){
			return new Square(squareID, this);
		}
		
		// internal builder functionality
		
	    private Dirt buildDirt() {
	    	
	    	if (dirtBool == true){
	    		Dirt dirt = new Dirt();
	    		return dirt;
	    	}
	    }
	    
	    private Grass buildGrass() {
	    	if(grassBool == true){
	    		Grass grass = new Grass();
	    		return grass;
	    	}
	    }
	    
	    private Rock buildRock() {
	    	if(rockBool == true){
		    	Rock rock = new Rock();
		        return rock;
	    	}
	    }
	    
	    private Sand buildSand() {
	    	if(sandBool == true){
		    	Sand sand = new Sand();
		    	return sand;
	    	}
	    }
	    
	    private Snow buildSnow() {
	    	if(snowBool == true){
		    	Snow snow = new Snow();
		    	return snow;
		    }
	    }
	    
	    private Sea buildSea() {
	    	if(seaBool == true){
	    		Sea sea = new Sea();
	    		return sea;
	    	}
	    }
	    
	    private Lake buildLake() {
	    	if(lakeBool == true){
	    		Lake lake = new Lake();
	    		return lake;
	    	}
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
	        this.dirtBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeGrass() {
	        this.grassBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeRock() {
	        this.rockBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeSand() {
	        this.sandBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeSnow() {
	        this.snowBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeSea() {
	        this.seaBool = true;
	        return this;
	    }
	    
	    public SquareBuilder makeLake() {
	        this.lakeBool = true;
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