package finalProject;
/**
 * SquareBuilderDirector 
 * All methods in this class build different types of squares on the board that are distinct by their terrain
 * Each method uses an instance of the SquareBuilder class that is passed to them.
 * The Square Builder class has all the actual methods for building the object.
 * @see Square
 * @see SquareBuilder
 */
public class SquareBuilderDirector {
	/**
	 * Builds a square on the board that is made of sand 
	 * @param	builder   an object from the SquareBuilder class
	 * @param	elevation the height of the square
	 */
	public static void buildSandSquare(Square.SquareBuilder builder, int elevation){
		builder.makeSand();
		builder.addElevation(elevation);	
	}
	/**
	 * Builds a square on the board that is made of rock 
	 * @param	builder   an object from the SquareBuilder class
	 * @param	elevation the height of the square
	 */
	public static void buildRockSquare(Square.SquareBuilder builder, int elevation){
		builder.makeRock();
		builder.addElevation(elevation);
	}
	/**
	 * Builds a square on the board that is made of grass 
	 * @param	builder   an object from the SquareBuilder class
	 * @param	elevation the height of the square
	 */
	public static void buildGrassSquare(Square.SquareBuilder builder, int elevation){
		builder.makeGrass();
		builder.addElevation(elevation);
	}
	/**
	 * Builds a square on the board that represents water in a sea
	 * @param	builder   an object from the SquareBuilder class
	 * @param	deepWater the depth of the square
	 */
	public static void buildSeaSquare(Square.SquareBuilder builder, int deepWater){
		builder.makeSea();
		builder.addDeepWater(deepWater);
	}
	/**
	 * Builds a square on the board that represents water in a lake
	 * @param	builder   an object from the SquareBuilder class
	 * @param	deepWater the depth of the square
	 */
	public static void buildLakeSquare(Square.SquareBuilder builder, int deepWater){
		builder.makeLake();
		builder.addDeepWater(deepWater);
	}
	/**
	 * Builds a square on the board that represents water by the shore that surfers like
	 * @param	builder   an object from the SquareBuilder class
	 * @param	deepWater the depth of the square
	 */
	public static void buildShoreLineSquare(Square.SquareBuilder builder, int deepWater){
		builder.makeSea();
		builder.addDeepWater(deepWater);
		builder.addWaves(3);
	}
	/**
	 * Builds a square on the board that is a snowy mountain top
	 * @param	builder   an object from the SquareBuilder class
	 * @param	deepWater the depth of the square
	 */
	public static void buildMountainTopSquare(Square.SquareBuilder builder, int elevation){
		builder.makeRock();
		builder.addElevation(elevation);
		builder.addSnow();
	}
}