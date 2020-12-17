package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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

public class leaderBoard {
	 leaderBoard() {
		
	}
	Scene s1;
	
	public int[] read2() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("Database1.txt"));
		return (int[])o1.readObject();
		
		
	}
	
	 public void start11( Stage stage,Scene s2) throws  IOException 
	    {
	    	stage.setTitle("creating canvas"); 
	        Canvas canvas = new Canvas(); 
	        gameMode g=new gameMode(); // object of game mode
	        canvas.setHeight(800); 
	        canvas.setWidth(800); 
	       
	        int m[]=null;
	        try {
				m=read2();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				//System.out.println("jj");
			}
	        
	        
	       
	        
	        
	        Label box1 = new Label(Integer.toString(m[2]));
			StackPane sp12 = new StackPane(box1);
			Font font2 = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 75);
			box1.setFont(font2);
			// Filling color to the label
			box1.setTextFill(Color.WHITE);
			sp12.setLayoutX(160);
			sp12.setLayoutY(200);
			sp12.getEffect();
			
		
	       
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
	        Font theFont = Font.font( "Times New Roman", FontWeight.LIGHT, 35 );
	        gc.setFont( theFont );
	        gc.fillText( "Previous match score", 70, 150 );
	        gc.strokeText( "Previous match score", 70, 150 );

	        
	      
	        
	       
	    
	        Button b = new Button("Continue"); 
	  //      Button bt = new Button("Exit & Save"); 
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(160);  
	        b.setLayoutY(350);
	        
	      
	   
	        r.getChildren().add(b); 
	      
	             
	        Group group = new Group(sp,canvas,r,sp1,sp12); 
	       // group.getChildren().addAll(cir);
	        Scene s1 = new Scene(group, 400, 600); 
	        
	       // Group f=new Group();
	        b.setOnAction(e -> {
	        	//down1=2.2f;
	        	stage.setScene(s2);
	        	//f.getChildren().add(g.doit(stage,scene,s1));
	        });
	      
	      
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 

}


