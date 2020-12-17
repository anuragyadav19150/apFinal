package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.animation.FillTransition;  
import javafx.util.Duration;
import javafx.animation.StrokeTransition;  
import javafx.scene.shape.Circle;   
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  

public class HomeScreen extends Application {
	ArrayList<Scene> savedlist=new ArrayList();
	Scene s1;
    @Override
    public void start( Stage stage) throws FileNotFoundException 
    {
    	stage.setTitle("creating canvas"); 
        Canvas canvas = new Canvas(); 
        gameMode g=new gameMode(); // object of game mode
        canvas.setHeight(800); 
        canvas.setWidth(800); 
        
  
       
        GraphicsContext graphics_context =  canvas.getGraphicsContext2D(); 

        StackPane sp = new StackPane();
        Image img = new Image("b8.jpg");
        ImageView imgView = new ImageView(img);
        imgView.setX(50); 
        imgView.setY(25); 
        
       
        imgView.setFitHeight(800); 
        imgView.setFitWidth(800);
        sp.getChildren().add(imgView);  
        
        
  
      
        graphics_context.setFill(Color.YELLOW); 
        graphics_context.fillRect(30, 30, 70, 70); 
  
       
        graphics_context.setFill(Color.RED); 
        graphics_context.fillRect(20, 20, 70, 70);
        
   
        graphics_context.setFill(Color.PINK); 
        graphics_context.fillRect(10, 10, 70,70); 
  
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        GraphicsContext gc1 = canvas.getGraphicsContext2D();
         
        gc.setFill( Color.YELLOW );
        gc.setStroke( Color.YELLOW );
        gc.setLineWidth(2);
        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
        gc.setFont( theFont );
        gc.fillText( "WELCOME TO HOMESCREEN!", 60, 150 );
        gc.strokeText( "WELCOME TO HOMESCREEN!", 60, 150 );

        
        gc1.setFill( Color.CYAN );
        gc1.setStroke( Color.CYAN );
        gc1.setLineWidth(1.5);
        Font theFont1 = Font.font( "Times New Roman", FontWeight.BOLD, 65 );
        gc1.setFont( theFont1 );
        gc1.fillText( "COLOR SWITCH", 150, 250 );
        gc1.strokeText( "COLOR SWITCH", 150, 250 );
        
        FillTransition fill = new FillTransition();  
        Circle cir = new Circle(400,450,100); 
       
        fill.setAutoReverse(true);          
        fill.setCycleCount(50);     
        fill.setDuration(Duration.millis(2000));  
        fill.setFromValue(Color.RED);  
        fill.setToValue(Color.PURPLE); 
        fill.setShape(cir);
        
        fill.play(); 
        
        
        cir.setStrokeWidth(10); 
        StrokeTransition stroke = new StrokeTransition(); 
        stroke.setAutoReverse(true);
        stroke.setCycleCount(500);
        stroke.setDuration(Duration.millis(2000));
        stroke.setFromValue(Color.BLUE);
        stroke.setToValue(Color.YELLOW);
        stroke.setShape(cir);
        stroke.play();
    
        Button b = new Button("START GAME"); 
        Button bt = new Button("     EXIT     "); 
      
        Pane r = new Pane(); 
  
        b.setScaleY(3);
        b.setScaleX(4);
        b.setLayoutX(200);  
        b.setLayoutY(650);
        
        bt.setScaleY(3);
        bt.setScaleX(4);
        bt.setLayoutX(570);  
        bt.setLayoutY(650);
        

  
   
        r.getChildren().add(b); 
        r.getChildren().add(bt); 
             
        Group group = new Group(sp,canvas,r); 
        group.getChildren().addAll(cir);
        Scene scene = new Scene(group, 800, 800); 
        
        Group f=new Group();
        b.setOnAction(e -> {
        	stage.setScene(s1);
        	f.getChildren().add(g.doit(stage,scene,s1,savedlist));
        }); 
      
        s1=new Scene(f,800,800);
        
        bt.setOnAction(e -> {
        	stage.close();
        });
   
  
        stage.setScene(scene); 
  
        stage.show(); 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
       
        launch(args); 
    }
}
