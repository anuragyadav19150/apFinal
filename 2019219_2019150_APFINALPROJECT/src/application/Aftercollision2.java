package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Aftercollision2 {
Aftercollision2(){
		
	}
	

	Scene s1;
	
	 public void start11( Stage stage,Scene s2,int points) throws FileNotFoundException 
	    {
	    	stage.setTitle("creating canvas"); 
	    //	System.out.println(points);
	        Canvas canvas = new Canvas(); 
	        gameMode g=new gameMode(); // object of game mode
	        canvas.setHeight(800); 
	        canvas.setWidth(800); 
	        StackPane sp11 = new StackPane();
	        Label box = new Label();
	        box = new Label(String.valueOf(points));
			  sp11 = new StackPane(box);
			 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 55);
		      box.setFont(font);
		      //Filling color to the label
		      box.setTextFill(Color.WHITE);
			 
			 sp11.setLayoutX(185);
			 sp11.setLayoutY(100);
	    	
	    	
	        
	  
	       
	        GraphicsContext graphics_context =  canvas.getGraphicsContext2D(); 

	        StackPane sp = new StackPane();
	        Image img = new Image("b12.png");
	        ImageView imgView = new ImageView(img);
	        imgView.setX(50); 
	        imgView.setY(25); 
	        
	       
	        imgView.setFitHeight(800); 
	        imgView.setFitWidth(800);
	        sp.getChildren().add(imgView);  
	        
	        StackPane sp1 = new StackPane();
	        Image img1 = new Image("logo.png");
	        ImageView imgView1 = new ImageView(img1);
	        imgView1.setX(0); 
	        imgView1.setY(0); 
	        
	        imgView1.setFitHeight(120); 
	        imgView1.setFitWidth(240);
	        
	      
	        sp1.getChildren().add(imgView1); 
	        sp1.setLayoutX(75);
	        sp1.setLayoutY(450);
	  
	      
	        graphics_context.setFill(Color.YELLOW); 
	        graphics_context.fillRect(30, 30, 70, 70); 
	  
	       
	        graphics_context.setFill(Color.RED); 
	        graphics_context.fillRect(20, 20, 70, 70);
	        
	   
	        graphics_context.setFill(Color.PINK); 
	        graphics_context.fillRect(10, 10, 70,70); 
	  
	        
	        
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	        GraphicsContext gc1 = canvas.getGraphicsContext2D();
	         
	        gc.setFill( Color.LAWNGREEN );
	        gc.setStroke( Color.LAWNGREEN );
	        gc.setLineWidth(1.5);
	        Font theFont = Font.font( "Times New Roman", FontWeight.LIGHT, 23 );
	        gc.setFont( theFont );
	        gc.fillText( "GAME OVER", 150, 50 );
	        gc.strokeText( "GAME OVER", 150, 50 );
	        
	        StackPane heart1 = new StackPane();
		    Image image1 = new Image("col1.png");
	        ImageView imagev1 = new ImageView(image1);
	        imagev1.setX(35); 
		    imagev1.setY(100); 
		    imagev1.setFitHeight(150); 
	        imagev1.setFitWidth(150);
		    heart1.getChildren().add(imagev1);
		    heart1.setLayoutX(140);
		    heart1.setLayoutY(170);

	       
	        
	       
	    
	        Button b = new Button("Continue"); 
	     
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(170);  
	        b.setLayoutY(350);
	   
	        

	  
	   
	        r.getChildren().add(b); 
	       
	             
	        Group group = new Group(sp,canvas,r,sp1,heart1); 
	       // group.getChildren().addAll(cir);
	        group.getChildren().add(sp11);
	        Scene s1 = new Scene(group, 400, 600); 
	        
	       // Group f=new Group();
	       // int len=savedlist.size();
	        b.setOnAction(e -> {
	        	stage.setScene(s2);
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	    
	   
	   
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 


}