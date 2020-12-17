package application;


import javafx.application.Application;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;
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
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
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



public class gameMode {
	 static Scene s2;
	
	gameMode(){
		
	}
	
	
	public static Group doit(Stage s,Scene s3,Scene s1,ArrayList<Scene> savedlist) {
	
		 Canvas canvas = new Canvas();
		 canvas.setHeight(800); 
	     canvas.setWidth(800); 
	     PrevSaved pp=new PrevSaved();
	     leaderBoard lb=new leaderBoard();
	        
	     classic c=new classic();
	     Flappyball fb=new Flappyball();
	  
	       
	     GraphicsContext graphics_context =  canvas.getGraphicsContext2D(); 

	        graphics_context.setFill(Color.YELLOW); 
	        graphics_context.fillRect(30, 30, 70, 70); 
	  
	        graphics_context.setFill(Color.RED); 
	        graphics_context.fillRect(20, 20, 70, 70);
	      
	        graphics_context.setFill(Color.BLUE); 
	        graphics_context.fillRect(10, 10, 70,70); 
	  
       
	        StackPane sp = new StackPane();
	        Image img = new Image("b8.jpg");
	        ImageView imgView = new ImageView(img);
	        imgView.setX(50); 
	        imgView.setY(25); 
	        
	      
	        imgView.setFitHeight(800); 
	        imgView.setFitWidth(800);
	        sp.getChildren().add(imgView); 
	        
	        GraphicsContext gc = canvas.getGraphicsContext2D();
	        GraphicsContext gc1 = canvas.getGraphicsContext2D();
	         
	        gc.setFill( Color.HOTPINK );
	        gc.setStroke( Color.HOTPINK );
	        gc.setLineWidth(2);
	        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
	        gc.setFont( theFont );
	        gc.fillText( "CHOOSE GAME_MODE!", 150, 250  );
	        gc.strokeText( "CHOOSE GAME_MODE!", 150, 250  );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.BOLD, 50 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "COLOR SWITCH", 200, 150);
	        gc1.strokeText( "COLOR SWITCH", 200, 150 );
	      
	        
	        Button b = new Button("CLASSIC MODE START"); 
	        Button bt = new Button("PREVIOUS MATCH SCORE"); 
	        Button btt = new Button(".     EXIT     ."); 
	        Button btt1 = new Button("FLAPPY BALL"); 
	        
	       
	        Pane r = new Pane(); 
	  
	       
	        b.setScaleY(2);
	        b.setScaleX(2);
	        b.setLayoutX(200);  
	        b.setLayoutY(450);
	        
	        bt.setScaleY(2);
	        bt.setScaleX(2);
	        bt.setLayoutX(500);  
	        bt.setLayoutY(450);
	        r.getChildren().add(b); 
	      
	        
	        btt.setScaleY(2);
	        btt.setScaleX(2);
	        btt.setLayoutX(500);  
	        btt.setLayoutY(550);
	        
	        
	        btt1.setScaleY(2);
	        btt1.setScaleX(2);
	        btt1.setLayoutX(200);  
	        btt1.setLayoutY(550);
	   	  
	        
	         r.getChildren().add(bt);
	         r.getChildren().add(btt1);
	         r.getChildren().add(btt);
	         
	         
	       
	         Group f1=new Group();
	         
	         b.setOnAction(e -> {
	         	s.setScene(s2);
	         	//g.doit(s1);
	         	
	         	f1.getChildren().add(c.doit(s,s1,s2,s3,savedlist));
	                  	
	     		
	         });
	         s2=new Scene(f1,800,800);
	         
	         
	         
	         
	         btt.setOnAction(e -> {
	         	s.setScene(s3);
	                  	
	     		
	         });
	         
	         bt.setOnAction(e -> {
	        	 try {
					lb.start11(s, s1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	 			

	 		});
	         
	         btt1.setOnAction(e -> {
		 			try {
						fb.start11(s, s1);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

		 		});
	         
	         
	         
	         Rectangle rectangle = new Rectangle();  
	         rectangle.setX(0); 
	         rectangle.setY(650); 
	         rectangle.setWidth(800); 
	         rectangle.setHeight(10); FillTransition fill = new FillTransition();
	         fill.setAutoReverse(true);
	         fill.setCycleCount(50);
	         fill.setDuration(Duration.millis(2000));
	         fill.setFromValue(Color.RED);
	         fill.setToValue(Color.CYAN); 
	         fill.setShape(rectangle);
	         fill.play(); 
	         
	         
	         Rectangle r1 = new Rectangle();  
	         r1.setX(0); 
	         r1.setY(700); 
	         r1.setWidth(800); 
	         r1.setHeight(10); 
	         FillTransition fill1 = new FillTransition();  
	         fill1.setAutoReverse(true);
	         fill1.setCycleCount(50);  
	         fill1.setDuration(Duration.millis(2000));  
	         fill1.setFromValue(Color.RED);  
	         fill1.setToValue(Color.CYAN); 
	         fill1.setShape(r1);
	         fill1.play(); 
	         
	         
	         Rectangle r2 = new Rectangle();
	         r2.setX(0); 
	         r2.setY(750); 
	         r2.setWidth(800); 
	         r2.setHeight(10); 
	         FillTransition fill2 = new FillTransition();  
	         fill2.setAutoReverse(true);  
	         fill2.setCycleCount(50);  
	         fill2.setDuration(Duration.millis(2000));  
	         fill2.setFromValue(Color.RED);  
	         fill2.setToValue(Color.CYAN); 
	         fill2.setShape(r2);
	         fill2.play(); 
	  
	        
	        Group g2=new Group(sp,canvas,r,rectangle,r1,r2);
	        return g2;
		
	}

}