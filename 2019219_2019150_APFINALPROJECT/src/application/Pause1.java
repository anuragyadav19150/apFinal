package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.FillTransition;
import javafx.animation.StrokeTransition;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pause1 {
	
	void Pause1() {
		
	}
	Scene s1;
	
	 public void start11( Stage stage,Scene s2,Scene s3,float down1,ArrayList<SavedGame> savedlist,gameplay game,Saver_Loader sl) throws FileNotFoundException 
	    {
	    	stage.setTitle("creating canvas"); 
	        Canvas canvas = new Canvas(); 
	        gameMode g=new gameMode(); // object of game mode
	        canvas.setHeight(800); 
	        canvas.setWidth(800); 
	        
	        
	       
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
	        gc.fillText( "WHAT TO DO NOW!!!!!!", 80, 150 );
	        gc.strokeText( "WHAT TO DO NOW!!!!!!", 80, 150 );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.SEMI_BOLD, 25 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "PAUSE SCREEN", 110, 225 );
	        gc1.strokeText( "PAUSE SCREEN", 110, 225 );
	        
	       
	    
	        Button b = new Button("Continue"); 
	        Button bt = new Button("Exit & Save"); 
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(80);  
	        b.setLayoutY(350);
	        
	        bt.setScaleY(1.5);
	        bt.setScaleX(2);
	        bt.setLayoutX(260);  
	        bt.setLayoutY(350);
	        

	  
	   
	        r.getChildren().add(b); 
	        r.getChildren().add(bt); 
	             
	        Group group = new Group(sp,canvas,r,sp1); 
	       // group.getChildren().addAll(cir);
	        Scene s1 = new Scene(group, 400, 600); 
	        
	       // Group f=new Group();
	        b.setOnAction(e -> {
	        	//down1=2.2f;
	        	stage.setScene(s2);
	        	//f.getChildren().add(g.doit(stage,scene,s1));
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt.setOnAction(e -> {
	        	SavedGame sv=new SavedGame(game.Stars_collected,game.leaf_collected,game.scnt);
	        	savedlist.add(sv);
	        	try {
					sl.write(savedlist);
				} catch (IOException e1) {
					System.out.println("Unable to Save");
				}
	        	System.out.println("Game saved");
	        	

	        	stage.setScene(s3);
	        });
	   
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 

}
