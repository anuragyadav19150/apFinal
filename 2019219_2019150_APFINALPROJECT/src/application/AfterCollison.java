package application;


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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class AfterCollison {
	
	AfterCollison(){
		
	}
	
	
	Scene s1;
	Saver_Loader s=new Saver_Loader();
	
	 public void start11( Stage stage,Scene s2,Scene s3,gameplay game,Ball c) throws FileNotFoundException 
	    {
	    	game.down=0f;
	    	c.ball.setCenterY(c.ball.getCenterY()+125);
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
	        gc.fillText( "HEY DON'T WORRY !!!!!", 80, 150 );
	        gc.strokeText( "HEY DON'T WORRY !!!!!", 80, 150 );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.SEMI_BOLD, 25 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "YOU COLLIDE  :(", 110, 225 );
	        gc1.strokeText( "YOU COLLIDE  :(", 110, 225 );
	        
	       
	    
	        Button b = new Button("Use Stars 50%"); 
	        Button bt = new Button(".    Exit    ."); 
	        Button btt = new Button("USE SPECIAL  LEAF");
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(80);  
	        b.setLayoutY(300);
	        
	        bt.setScaleY(1.5);
	        bt.setScaleX(2);
	        bt.setLayoutX(260);  
	        bt.setLayoutY(300);
	        
	        btt.setScaleY(1.5);
	        btt.setScaleX(2);
	        btt.setLayoutX(140);  
	        btt.setLayoutY(350);
	        Group group = new Group(sp,canvas,r,sp1); 
	        Label boxy=new Label("YOUR SCORE MUST BE GREATER THAN 1");
    		StackPane sp11 = new StackPane();
    		sp11.getChildren().add(boxy);
    		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
       	      boxy.setFont(font);
       	      //Filling color to the label
       	      boxy.setTextFill(Color.WHITE);
       		 
       		 sp11.setLayoutX(25);
       		 sp11.setLayoutY(250);
       		 group.getChildren().add(sp11);
	        

	  
	   
	        r.getChildren().add(b); 
	        r.getChildren().add(bt); 
	        r.getChildren().add(btt);
	             
	     
	       // group.getChildren().addAll(cir);
	        
	        
	       // Group f=new Group();
	        b.setOnAction(e -> {
	        	//yash bc ihar kaam kriyooo
	        	
	        //	System.out.println(sc);
	        	
	        	
	        //	System.out.println(game.Stars_collected);
	        	if(game.Stars_collected>=2) {
	        		game.Stars_collected-=Math.floor(0.5*(game.Stars_collected));
	        		//System.out.println(game.Stars_collected);
	        		stage.setScene(s2);
	        	}
	        	else {
	        		Arrays.sort(game.max);
	        		if(game.Stars_collected>game.max[0])
		        		game.max[0]=game.Stars_collected;
		        	Arrays.sort(game.max);
		        	Saver_Loader s=new Saver_Loader();
		        	try {
						s.write2(game.max);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        	
		        	
	        		stage.setScene(s3);
	        		
	        		
	        	}
	        	
	        });
	        
	        
	        btt.setOnAction(e -> {
	        	//yash bc ihar kaam kriyooo
	        	
	        //	System.out.println(sc);
	        	
	        	
	        	//System.out.println(game.Stars_collected);
	        	if(game.leaf_collected>=1) {
	        		game.leaf_collected--;
	        		//System.out.println(game.Stars_collected);
	        		stage.setScene(s2);
	        	}
	        	else {
	        		Arrays.sort(game.max);
	        		if(game.Stars_collected>game.max[0])
		        		game.max[0]=game.Stars_collected;
		        	Arrays.sort(game.max);
		        	Saver_Loader s=new Saver_Loader();
		        	try {
						s.write2(game.max);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        	
		        	
		        	
	        		stage.setScene(s3);
	        		
	        		
	        	}
	        	
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt.setOnAction(e -> {
	        	Arrays.sort(game.max);
	        	//savedlist.add(s2);
	        	if(game.Stars_collected>game.max[0])
	        		game.max[0]=game.Stars_collected;
	        	Arrays.sort(game.max);
	        	Saver_Loader s=new Saver_Loader();
	        	try {
					s.write2(game.max);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        	
	        	
	        	stage.setScene(s3);
	        });
	        
	        Scene s1 = new Scene(group, 400, 600);
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 
	 
	 public void start111( Stage stage,Scene s2,Scene s3,gameplay game,Ball c) throws FileNotFoundException 
	    {
	    	game.down=0f;
	    	
	    	c.ball.setCenterY(c.ball.getCenterY()-40);
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
	        gc.fillText( "HEY DON'T WORRY !!!!!", 80, 150 );
	        gc.strokeText( "HEY DON'T WORRY !!!!!", 80, 150 );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.SEMI_BOLD, 25 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "YOU COLLIDE  :(", 110, 225 );
	        gc1.strokeText( "YOU COLLIDE  :(", 110, 225 );
	        
	       
	    
	        Button b = new Button("Use Stars 50%"); 
	        Button bt = new Button(".    Exit    .");
	        Button btt = new Button("USE SPECIAL  LEAF"); 
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(80);  
	        b.setLayoutY(300);
	        
	        bt.setScaleY(1.5);
	        bt.setScaleX(2);
	        bt.setLayoutX(260);  
	        bt.setLayoutY(300);
	        btt.setScaleY(1.5);
	        btt.setScaleX(2);
	        btt.setLayoutX(140);  
	        btt.setLayoutY(350);
	        Group group = new Group(sp,canvas,r,sp1); 
	        Label boxy=new Label("YOUR SCORE MUST BE GREATER THAN 1");
 		StackPane sp11 = new StackPane();
 		sp11.getChildren().add(boxy);
 		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
    	      boxy.setFont(font);
    	      //Filling color to the label
    	      boxy.setTextFill(Color.WHITE);
    		 
    		 sp11.setLayoutX(25);
    		 sp11.setLayoutY(250);
    		 group.getChildren().add(sp11);
	        

	  
	   
	        r.getChildren().add(b); 
	        r.getChildren().add(bt); 
	        r.getChildren().add(btt); 
	             
	     
	       
	        b.setOnAction(e -> {
	        	
	        	
	        	
	        	if(game.Stars_collected>=2) {
	        		game.Stars_collected-=Math.floor(0.5*(game.Stars_collected));
	        	//	System.out.println(game.Stars_collected);
	        		stage.setScene(s2);
	        	}
	        	else {
	        		Arrays.sort(game.max);
	        		if(game.Stars_collected>game.max[0])
		        		game.max[0]=game.Stars_collected;
		        	Arrays.sort(game.max);
		        	Saver_Loader s=new Saver_Loader();
		        	try {
						s.write2(game.max);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        		stage.setScene(s3);
	        		
	        		
	        	}
	        	
	        });
	        btt.setOnAction(e -> {
	        	
	        	
	        //	System.out.println(sc);
	        	
	        	
	        	//System.out.println(game.Stars_collected);
	        	if(game.leaf_collected>=1) {
	        		game.leaf_collected--;
	        		//System.out.println(game.Stars_collected);
	        		stage.setScene(s2);
	        	}
	        	else {
	        		Arrays.sort(game.max);
	        		if(game.Stars_collected>game.max[0])
		        		game.max[0]=game.Stars_collected;
		        	Arrays.sort(game.max);
		        	Saver_Loader s=new Saver_Loader();
		        	try {
						s.write2(game.max);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        		stage.setScene(s3);
	        		
	        		
	        	}
	        	
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt.setOnAction(e -> {
	        	Arrays.sort(game.max);
	        	if(game.Stars_collected>game.max[0])
	        		game.max[0]=game.Stars_collected;
	        	Arrays.sort(game.max);
	        	
	        	try {
					s.write2(game.max);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	int m[] = null;
	        	try {
					 m=s.read2();
				} catch (ClassNotFoundException | IOException e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}
	        	System.out.println(m[2]+" "+m[1]+" "+m[0]);
	        	
	        	
	        	stage.setScene(s3);
	        	
	        });
	        
	        
	        Scene s1 = new Scene(group, 400, 600);
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 
	 

}