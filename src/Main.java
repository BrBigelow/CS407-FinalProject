package finalProject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;

/**
 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
 */
public class Main extends Application {
	 
	 /**
	  * @param args the command line arguments
	  */
	 //public static void Main(String[] args) {
	     //launch(args);
	CreatureFactoryInterface cFactory = CreatureFactory.getInstance();
	PlantFactoryInterface pFactory = PlantFactory.getInstance();
	Creature c1 = cFactory.create("G", "R");
	Creature c2 = cFactory.create("B", "F");
	Plant p1 = pFactory.create("R");
	Plant p2 = pFactory.create("B");
	
	SquareBuilder squareBuilder = new SquareBuilder();
	SquareBuilderDirector director = new SquareBuilderDirector();
	director.buildLand();
	director.buildSea();
	
	
	
	Vertex vc1 = new Vertex(c1, 1);
	Vertex vc2 = new Vertex(c2, 1);
	Vertex vp1 = new Vertex(p1,1);
	Vertex vp2 = new Vertex(p2,1);
	Graph graph = new Graph();

		
	// }
	 
	 @Override
	 public void start(Stage primaryStage) {
	     primaryStage.setTitle("CS407 Final Project");
	     Group root = new Group();
	     Scene scene = new Scene(root, 2000, 2000, Color.WHITE);
	     
	     
		graph.addVertex(vc1);
		graph.addVertex(vc2);
		graph.addVertex(vp1);
		graph.addVertex(vp2);
		String graphText = graph.get(0).toString();
		graphText += " " + graph.get(1).toString();
		graphText += " " + graph.get(2).toString();
		graphText += " " + graph.get(3).toString();
	     
	    Text t = new Text(10, 20, graphText );

	    root.getChildren().add(t);
	     
	     
	     
	    Rectangle[] squares = new Rectangle[2500];
	   
	   //Filled rectangle
	    int count = 0;
	     for(int i=0;i<50;i++){
	    	 for(int j=0;j<50;j++){
		    	 squares[i] = new Rectangle(i%50*20,j%50*20, 20, 20);
		    	 	
		    	 if(i%2==1){
		    		 if(j%2==1){
		    			 //squares[i].setFill(Color.rgb(i+150, j, i+j));
		    			 squares[i].setFill(Color.LIGHTGREY);
		    		 } else {
		    			 squares[i].setFill(Color.WHITE);
		    		 }
		    	 } else {
		    		 if(j%2==1){
		    			 squares[i].setFill(Color.WHITE);
		    		 }else {
		    			 squares[i].setFill(Color.LIGHTGREY);
		    		 }
		    	 }
		    	 count ++;
		    
		    	 root.getChildren().add(squares[i]);
	    	 }
	     }
	     
	   
	     primaryStage.setScene(scene);
	     primaryStage.show();
	 }
}