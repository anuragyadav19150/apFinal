package application;

import java.util.ArrayList;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.net.*;
import java.util.ArrayList;

import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.input.KeyCode;
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.animation.FillTransition;
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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Flappyball {
	
	

	
	Scene s1;
	Flappyball(){
		
	}
	
	 public void start11( Stage stage,Scene s2) throws FileNotFoundException 
	    {
//	    	game.down=0f;
//	    	c.ball.setCenterY(c.ball.getCenterY()+30);
		 	stage.setTitle("creating canvas"); 
	        Canvas canvas = new Canvas(); 
	       // gameMode g=new gameMode(); // object of game mode
	        canvas.setHeight(800); 
	        canvas.setWidth(800); 
	        
	     //   gameplay2 gg=new gameplay2();
	        
	        gameplay2 g2=new gameplay2();
	  
	       
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
	        sp1.setLayoutY(420);
	  
	      
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
	        gc.fillText( "FLAPPY BIRD GAME MODE", 70, 150 );
	        gc.strokeText( "FLAPPY BIRD GAME MODE", 70, 150 );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.SEMI_BOLD, 25 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "LET'S PLAY!!!!", 110, 225 );
	        gc1.strokeText( "LET'S PLAY!!!!", 110, 225 );
	        
	       
	    
	        Button b = new Button("START"); 
	        Button bt = new Button("EXIT"); 
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(80);  
	        b.setLayoutY(350);
	        
	        bt.setScaleY(1.5);
	        bt.setScaleX(2);
	        bt.setLayoutX(260);  
	        bt.setLayoutY(350);
	        Group group = new Group(sp,canvas,r,sp1); 
	      
	        

	  
	   
	        r.getChildren().add(b); 
	        r.getChildren().add(bt); 
	             
	     
	       // group.getChildren().addAll(cir);
	        
	        s1 = new Scene(group, 400, 600);
	       // Group f=new Group();
	        b.setOnAction(e -> {
	        	try {
					g2.start1111(stage, s2);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        
	        		
	        		
	        	
	        	
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt.setOnAction(e -> {
	        	//savedlist.add(s2);
	        	stage.setScene(s2);
	        });
	        
	      
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 

}