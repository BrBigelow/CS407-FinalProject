package finalProject;

import java.util.Scanner;

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
	 
	CreatureFactoryInterface cFactory = CreatureFactory.getInstance();
	PlantFactoryInterface pFactory = PlantFactory.getInstance();
	Creature c1 = cFactory.create("G", "R");
	Creature c2 = cFactory.create("B", "F");
	Plant p1 = pFactory.create("R");
	Plant p2 = pFactory.create("B");
	
	Vertex vc1 = new Vertex(c1, 1);
	Vertex vc2 = new Vertex(c2, 1);
	Vertex vp1 = new Vertex(p1,1);
	Vertex vp2 = new Vertex(p2,1);
	Graph graph = new Graph();
	
	 
	 @Override
	 public void start(Stage primaryStage) {
		 primaryStage.setTitle("CS407 Final Project");
	     Group root = new Group();
	     Scene scene = new Scene(root, 2000, 2000, Color.WHITE);
	     
	     Rectangle[] squares = new Rectangle[2500];
	     int gameCount=0;
	     Scanner scan=new Scanner(System.in);
	     String input = "";
	     primaryStage.setScene(scene);
	     //game loop
	     while(gameCount<100){
	     //Filled rectangle
		     for(int i=0;i<50;i++){
		    	 for(int j=0;j<50;j++){
			    	 squares[i] = new Rectangle(i%50*40,j%50*40, 40, 40);
			    	 if(gameCount%2==1){
				    	 if(j%2==1){
				    		 squares[i].setFill(Color.LIGHTGREY);
				    	 }else{
				    		 squares[i].setFill(Color.WHITE);
				    	 }
			    	 } else {
				    	 if(j%2==1){
				    		 squares[i].setFill(Color.WHITE);
				    	 }else{
				    		 squares[i].setFill(Color.LIGHTGREY);
				    	 }
			    	 }
			    	 
			    	 
			    	 root.getChildren().add(squares[i]);
		    	 }
		     }
	     
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
		   
		     
		     primaryStage.show();
		     
		     input = scan.nextLine();
		     gameCount++;
		    
	     }
	 }
}
