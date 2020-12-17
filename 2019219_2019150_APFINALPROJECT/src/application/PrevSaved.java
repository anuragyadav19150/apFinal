package application;

import java.io.FileNotFoundException;
import java.io.IOException;
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

public class PrevSaved {

	
	PrevSaved(){
		
	}
	
	int scnt=0;
	int star=0;
	int leave=0;
	ArrayList<SavedGame> gh;
	
	

	Scene s1;
	
	 public void start11( Stage stage,Scene s2,ArrayList<SavedGame> savedlist,gameplay m1, Saver_Loader sl,Scene s4,Scene s3) throws FileNotFoundException 
	    {
	    	stage.setTitle("creating canvas"); 
	        Canvas canvas = new Canvas(); 
	        gameMode g=new gameMode(); // object of game mode
	        canvas.setHeight(800); 
	        canvas.setWidth(800); 
	        StackPane sp11 = new StackPane();
	        Label box = new Label();
	    	sp11.getChildren().add(box);
	    	
	    
	   // 	int size1=savedlist.size();
	    	
	    	gh=new ArrayList<>();
        	try {
				gh=sl.read();
			} catch (ClassNotFoundException | IOException e1) {
				System.out.println("Unable to read");
			}
        	System.out.println(gh.size()+" "+gh.get(0).Stars);
	    	
	    	
	        
	  
	       
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
	        gc.fillText( "WANT TO COMPLETE THE GAME :)", 10, 150 );
	        gc.strokeText( "WANT TO COMPLETE THE GAME :)!", 10, 150 );

	        
	        gc1.setFill( Color.CYAN );
	        gc1.setStroke( Color.CYAN );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.SEMI_BOLD, 25 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "CHOOSE ONE", 110, 200 );
	        gc1.strokeText( "CHOOSE ONE", 110, 200 );
	        
	       
	    
	        Button b = new Button(". FIRST ."); 
	        Button bt = new Button("SECOND"); 
	        Button b1 = new Button(". THIRD ."); 
	        Button bt1 = new Button("FOURTH"); 
	        Button btt = new Button("GAMEMODES"); 
	      
	        Pane r = new Pane(); 
	  
	        b.setScaleY(1.5);
	        b.setScaleX(2);
	        b.setLayoutX(80);  
	        b.setLayoutY(250);
	        
	        bt.setScaleY(1.5);
	        bt.setScaleX(2);
	        bt.setLayoutX(260);  
	        bt.setLayoutY(250);
	        
	        b1.setScaleY(1.5);
	        b1.setScaleX(2);
	        b1.setLayoutX(80);  
	        b1.setLayoutY(300);
	        
	        bt1.setScaleY(1.5);
	        bt1.setScaleX(2);
	        bt1.setLayoutX(260);  
	        bt1.setLayoutY(300);
	        
	        btt.setScaleY(1.5);
	        btt.setScaleX(2);
	        btt.setLayoutX(150);  
	        btt.setLayoutY(375);
	        

	  
	   
	        r.getChildren().add(b); 
	        r.getChildren().add(bt); 
	        r.getChildren().add(b1); 
	        r.getChildren().add(bt1);
	        r.getChildren().add(btt);
	             
	        Group group = new Group(sp,canvas,r,sp1); 
	       // group.getChildren().addAll(cir);
	        Scene s1 = new Scene(group, 400, 600); 
	        
	       // Group f=new Group();
	        int len=gh.size();
	        b.setOnAction(e -> {
	        	box.setText(" ");
	        	if(len>=1) {
	        		
	        		star=gh.get(gh.size()-1).Stars;
	        		scnt=gh.get(gh.size()-1).scnt;
	        		leave=gh.get(gh.size()-1).leaves;
	        		int y=scnt%6;
	        		int x=0;
	        		if(y==1)
	        			x=625;
	        		if(y==2)
	        			x=1225;
	        		if(y==3)
	        			x=1825;
	        		if(y==4)
	        			x=2400;
	        		if(y==5)
	        			x=3050;
	        		if(y==0)
	        			x=0;
	        		
	        		m1.startu(stage, s4, s3, savedlist, sl,x,star,leave);
	        	
	        		
	        		
	        		
	        		
	        		
	        		
	        		
	        	}
	        		//stage.setScene(savedlist.get(savedlist.size()-1));
	        	else {
	        		box.setText(String.valueOf("NO GAME IS HERE CHOOSE ANOTHER"));
	       		//  sp11 = new StackPane(box);
	        	
	       		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
	       	      box.setFont(font);
	       	      //Filling color to the label
	       	      box.setTextFill(Color.WHITE);
	       		 
	       		 sp11.setLayoutX(35);
	       		 sp11.setLayoutY(425);
	       		 sp11.getEffect();
	        		
	        	}
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt.setOnAction(e -> {
	        	box.setText(" ");
	        	if(len>=2) {
	        		
	        		star=gh.get(gh.size()-2).Stars;
	        		scnt=gh.get(gh.size()-2).scnt;
	        		leave=gh.get(gh.size()-2).leaves;
	        		int y=scnt%6;
	        		int x=0;
	        		if(y==1)
	        			x=625;
	        		if(y==2)
	        			x=1225;
	        		if(y==3)
	        			x=1825;
	        		if(y==4)
	        			x=2400;
	        		if(y==5)
	        			x=3050;
	        		if(y==0)
	        			x=0;
	        		
	        		m1.startu(stage, s4, s3, savedlist, sl,x,star,leave);
	        		
	        	}
	        		//stage.setScene(savedlist.get(savedlist.size()-2));
	        	else {
	        		box.setText(String.valueOf("NO GAME IS HERE CHOOSE ANOTHER"));
		       		//  sp11 = new StackPane(box);
		        //		sp11.getChildren().add(box);
		       		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
		       	      box.setFont(font);
		       	      //Filling color to the label
		       	      box.setTextFill(Color.WHITE);
		       		 
		       		 sp11.setLayoutX(35);
		       		 sp11.setLayoutY(425);
		       		 sp11.getEffect();
	        		
	        	}
	        });
	        b1.setOnAction(e -> {
	        	box.setText(" ");
	        	
	        	if(len>=3) {
	        		
	        		star=gh.get(gh.size()-3).Stars;
	        		scnt=gh.get(gh.size()-3).scnt;
	        		leave=gh.get(gh.size()-3).leaves;
	        		int y=scnt%6;
	        		int x=0;
	        		if(y==1)
	        			x=625;
	        		if(y==2)
	        			x=1225;
	        		if(y==3)
	        			x=1825;
	        		if(y==4)
	        			x=2400;
	        		if(y==5)
	        			x=3050;
	        		if(y==0)
	        			x=0;
	        		
	        		m1.startu(stage, s4, s3, savedlist, sl,x,star,leave);
	        		
	        	}
	        		//stage.setScene(savedlist.get(savedlist.size()-3));
	        	else {
	        		box.setText(String.valueOf("NO GAME IS HERE CHOOSE ANOTHER"));
		       		//  sp11 = new StackPane(box);
		        //		sp11.getChildren().add(box);
		       		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
		       	      box.setFont(font);
		       	      //Filling color to the label
		       	      box.setTextFill(Color.WHITE);
		       		 
		       		 sp11.setLayoutX(35);
		       		 sp11.setLayoutY(425);
		       		 sp11.getEffect();
	        		
	        	}
	        });
	      
	       // s1=new Scene(f,800,800);
	        
	        bt1.setOnAction(e -> {
	        //	box.setText(" ");
	        	if(len>=4) {
	        		star=gh.get(gh.size()-4).Stars;
	        		scnt=gh.get(gh.size()-4).scnt;
	        		leave=gh.get(gh.size()-4).leaves;
	        		int y=scnt%6;
	        		int x=0;
	        		if(y==1)
	        			x=625;
	        		if(y==2)
	        			x=1225;
	        		if(y==3)
	        			x=1825;
	        		if(y==4)
	        			x=2400;
	        		if(y==5)
	        			x=3050;
	        		if(y==0)
	        			x=0;
	        		
	        		m1.startu(stage, s4, s3, savedlist, sl,x,star,leave);
	        		
	        	}
	        		//stage.setScene(savedlist.get(savedlist.size()-4));
	        	else {
	        		box.setText(String.valueOf("NO GAME IS HERE CHOOSE ANOTHER"));
		       		//  sp11 = new StackPane(box);
		        //		sp11.getChildren().add(box);
		       		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
		       	      box.setFont(font);
		       	      //Filling color to the label
		       	      box.setTextFill(Color.WHITE);
		       		 
		       		 sp11.setLayoutX(35);
		       		 sp11.setLayoutY(425);
		       		 sp11.getEffect();
	        		
	        	}
	        });
	        
	        
	        btt.setOnAction(e -> {
	        	box.setText(" ");
	        	
	        		stage.setScene(s2);
	        	
	        });
	      group.getChildren().add(sp11);
	   
	  
	        stage.setScene(s1); 
	  
	        stage.show(); 
	    } 
}
