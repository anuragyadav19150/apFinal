package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class gameplay2 {
	
	int flag=0;
	double flag1=2;
	float down=2.2f;
	Stage window;
	AnimationTimer timer3;
	
	int points=0; 
	int t1=0,t2=0,t3=0,t4=0;
	Aftercollision2 af=new Aftercollision2();
	
	Label box2;
	
	public gameplay2() {
		
	}
	
	public void Add_Score(ArrayList<Group> arr,Ball b)
	{
		if(b.getX_coord()>arr.get(0).getBoundsInParent().getMaxX() && t1==0)
		{
			this.points++;
			t1=1;
			 box2.setText((String.valueOf(this.points)));
			//System.out.println(this.points);
		}
		if(b.getX_coord()>arr.get(1).getBoundsInParent().getMaxX() && t2==0)
		{
			this.points++;
			t2=1;
			box2.setText((String.valueOf(this.points)));
			//System.out.println(this.points);
		}
		if(b.getX_coord()>arr.get(2).getBoundsInParent().getMaxX() && t3==0)
		{
			this.points++;
			t3=1;
			box2.setText((String.valueOf(this.points)));
			//System.out.println(this.points);
		}
		if(b.getX_coord()>arr.get(3).getBoundsInParent().getMaxX() && t4==0)
		{
			this.points++;
			t4=1;
			box2.setText((String.valueOf(this.points)));
			//System.out.println(this.points);
		}
	}
	
	ArrayList<Group> arr=new ArrayList<>();
	
	
	
	public void start1111(Stage stage,Scene s1) throws Exception {
		window=stage;
		Pane canvas2 = new Pane();
		Scene scene1;
		
		gameplay2 g=new gameplay2();
		
		Ball b2=new Ball(100,400,Color.rgb(255, 0, 0).toString());
	
		Image i1=new Image("tube_top.png");
		Image i2=new Image("tube_bottom.png");
		Image i3=new Image("Background.png");
		Image i4=new Image("Background2.png");
		Image i5=new Image("magic_ball.png");
		
		
		b2.ball.setFill(new ImagePattern(i5));
		b2.ball.setRadius(15);
		
		Group g1=new Group();
		Group g2=new Group();
		Group g3=new Group();
		Group g4=new Group();
		
		Path p1=new Path();
		p1.getElements().add(new MoveTo(300, 0));
		p1.getElements().add(new LineTo(300, 360));
		p1.setStrokeWidth(50);
		p1.setStroke(Color.DARKBLUE);
		
		
		Path p2=new Path();
		p2.getElements().add(new MoveTo(300, 540));
		p2.getElements().add(new LineTo(300, 800));
		p2.setStrokeWidth(50);
		p2.setStroke(Color.DARKBLUE);
		
		g1.getChildren().addAll(p1,p2);
		
		Path p3=new Path();
		p3.getElements().add(new MoveTo(300, 0));
		p3.getElements().add(new LineTo(300, 440));
		p3.setStrokeWidth(50);
		p3.setStroke(Color.DARKRED);
		
		
		Path p4=new Path();
		p4.getElements().add(new MoveTo(300, 620));
		p4.getElements().add(new LineTo(300, 800));
		p4.setStrokeWidth(50);
		p4.setStroke(Color.DARKRED);
		
		g2.getChildren().addAll(p3,p4);
		
		
		
		Path p5=new Path();
		p5.getElements().add(new MoveTo(300, 0));
		p5.getElements().add(new LineTo(300, 320));
		p5.setStrokeWidth(50);
		p5.setStroke(Color.DARKGREEN);
		
		
		Path p6=new Path();
		p6.getElements().add(new MoveTo(300, 500));
		p6.getElements().add(new LineTo(300, 800));
		p6.setStrokeWidth(50);
		p6.setStroke(Color.DARKGREEN);
		
		g3.getChildren().addAll(p5,p6);
		
		
		Path p7=new Path();
		p7.getElements().add(new MoveTo(300, 0));
		p7.getElements().add(new LineTo(300, 400));
		p7.setStrokeWidth(50);
		p7.setStroke(Color.rgb(255,0,255));
		
		
		Path p8=new Path();
		p8.getElements().add(new MoveTo(300, 580));
		p8.getElements().add(new LineTo(300, 800));
		p8.setStrokeWidth(50);
		p8.setStroke(Color.rgb(255,0,255));
		
		g4.getChildren().addAll(p7,p8);
		g1.setLayoutX(g1.getLayoutX()+100);
		g2.setLayoutX(400);
		g3.setLayoutX(700);
		g4.setLayoutX(1000);
		
		Pipes pipe1=new Pipes(g1);
		Pipes pipe2=new Pipes(g2);
		Pipes pipe3=new Pipes(g3);
		Pipes pipe4=new Pipes(g4);
		box2 = new Label(String.valueOf(g.points));
		 Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 45);
	      box2.setFont(font);
	      box2.setTextFill(Color.WHITE);
	      
	      
	      StackPane sp = new StackPane();
        Image img = new Image("Background2.png");
        ImageView imgView = new ImageView(img);
        imgView.setX(50); 
        imgView.setY(25); 
        
       StackPane sp1=new StackPane(box2);
        sp1.setLayoutX(20);
        sp1.setLayoutY(20);
        imgView.setFitHeight(800); 
        imgView.setFitWidth(800);
        sp.getChildren().add(imgView); 
		
		arr.add(pipe1.getG());arr.add(pipe2.getG());arr.add(pipe3.getG());arr.add(pipe4.getG());
		
		canvas2.getChildren().addAll(sp,b2.ball,pipe1.getG(),pipe2.getG(),pipe3.getG(),pipe4.getG(),sp1);
		//canvas2.setStyle(new ImagePattern(i4));
		scene1 = new Scene(canvas2, 800, 800);
		scene1.setFill(new ImagePattern(i4));
		window.setScene(scene1);
		window.show();
		
		Bounds bounds = canvas2.getBoundsInLocal();
		AnimationTimer timer1=new AnimationTimer() {

		//	private char[] points;

			@Override
			public void handle(long arg0) {
			//	System.out.println(points+"gp");
				
				if(b2.ball.getBoundsInParent().getCenterY()<bounds.getMaxY())
				{
				b2.ball.setCenterY(b2.ball.getCenterY()+g.down);// TODO Auto-generated method stub
				
				}
				else
				{
					g.down=0;
					b2.ball.setCenterY(b2.ball.getCenterY()+50);
					try {
						
						af.start11(window, s1,points);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		};
		timer1.start();

		AnimationTimer timer2=new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				//System.out.println(flag1);
				pipe1.getG().setLayoutX(pipe1.getG().getLayoutX()-g.flag1);
				pipe2.getG().setLayoutX(pipe2.getG().getLayoutX()-g.flag1);
				pipe3.getG().setLayoutX(pipe3.getG().getLayoutX()-g.flag1);
				pipe4.getG().setLayoutX(pipe4.getG().getLayoutX()-g.flag1);
				if(pipe1.getG().getBoundsInParent().getMaxX()<0)
				{
					pipe1.getG().setLayoutX(900);
					t1=0;
				}
				if(pipe2.getG().getBoundsInParent().getMaxX()<0)
				{
					pipe2.getG().setLayoutX(900);
					t2=0;
				}
				if(pipe3.getG().getBoundsInParent().getMaxX()<0)
				{
					pipe3.getG().setLayoutX(900);
					t3=0;
				}
				if(pipe4.getG().getBoundsInParent().getMaxX()<0)
				{
					pipe4.getG().setLayoutX(900);
					t4=0;
				}
				
			}
			
		};
		timer2.start();
		
		timer3=new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				// box2.setText((String.valueOf(g.points)));
				pipe1.collision(b2, g,s1,stage,af,points);
				pipe2.collision(b2, g,s1,stage,af,points);
				pipe3.collision(b2, g,s1,stage,af,points);
				pipe4.collision(b2, g,s1,stage,af,points);
				Add_Score(arr,b2);
				if(g.down!=0)
					g.flag1+=0.001;
				
			}
			
		};
		timer3.start();
		
		scene1.setOnKeyPressed(new EventHandler<KeyEvent>()
		{

			@Override
			public void handle(KeyEvent event) {
				
				if(event.getCode().toString().equals("W"))
				{
					
					flag=0;
					AnimationTimer timer3=new AnimationTimer() {

						@Override
						public void handle(long arg0) {
							
							b2.ball.setCenterY(b2.ball.getCenterY()-b2.getJump_value());
							
							
							flag++;
							if(flag>9)
								stop();
						}
						
					};
					timer3.start();
			}
			
				if(event.getCode().toString().equals("C"))
				{
					g.down=2.2f;
					g.flag1=2;
				}
				
		}
			
		});
		
	}
	
	
}