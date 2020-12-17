package application;




import java.util.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public abstract class Obstacle {
	private Group g;
	int inside=0;
	int upper=0;
	int lower=1;
	AfterCollison a=new AfterCollison();
	public Obstacle(Group g)
	{
		this.setG(g);
	}

	public Group getG() {
		return this.g;
	}

	public void setG(Group g) {
		this.g = g;
	}
	
	public void Place_Obstacle(double y) {
		g.setLayoutY(y+100);
	}
	
	abstract public void hitBall(Ball c,Stage stage,Scene s1,Scene s2,gameplay game);
	
}

//
//import javafx.animation.KeyValue;
//import javafx.animation.Timeline;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.Event;
//import javafx.scene.input.KeyEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Bounds;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.animation.AnimationTimer;
//import javafx.animation.KeyFrame;
//
//import java.util.*;
//import javafx.animation.KeyValue;
//import javafx.animation.RotateTransition;
//import javafx.animation.Timeline;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.Event;
//import javafx.scene.input.KeyEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.Bounds;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.Paint;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.LineTo;
//import javafx.scene.shape.MoveTo;
//import javafx.scene.shape.Path;
//import javafx.scene.shape.Shape;
//import javafx.animation.AnimationTimer;
//import javafx.animation.KeyFrame;
//
//import javafx.animation.RotateTransition;
//import javafx.scene.Group;
//import javafx.scene.shape.Shape;
//import javafx.util.Duration;
//import javafx.scene.shape.Arc;
//import javafx.scene.shape.ArcType;
//
//public class Obstacle {
//	private Group g;
//	int obs_y=0;
//	int adder=0;
//	Group g1 = new Group();
//	Group g21=new Group();
//	Group g11=new Group();
//	Group g2=new Group();
//	Group g4=new Group();
//	Group g31=new Group();
//	Group g32=new Group();
//	
//	
//	Group g10 = new Group();
//	Group g210=new Group();
//	Group g110=new Group();
//	Group g20=new Group();
//	Group g40=new Group();
//	
//	
//	ArrayList<Group> obs=new ArrayList();
//	public void y_dec() {
//		g1.setLayoutY(g1.getLayoutY()+4);
//		g11.setLayoutY(g11.getLayoutY()+4);
//		g21.setLayoutY(g21.getLayoutY()+4);
//		g2.setLayoutY(g2.getLayoutY()+4);
//		g4.setLayoutY(g4.getLayoutY()+4);
//		g31.setLayoutY(g31.getLayoutY()+4);
//		g32.setLayoutY(g32.getLayoutY()+4);
//		
//		if(g1.getLayoutY()>=800) 
//			g1.setLayoutY(-1100);
//		if(g11.getLayoutY()>=800)
//			g11.setLayoutY(-1100);
//		if(g21.getLayoutY()>=800)
//			g21.setLayoutY(-1100);
//		if(g4.getLayoutY()>=800)
//			g4.setLayoutY(-1100);
//		if(g2.getLayoutY()>=800)
//			g2.setLayoutY(-1100);
//		if(g31.getLayoutY()>=800)
//			g31.setLayoutY(-1100);
//		if(g32.getLayoutY()>=800)
//			g32.setLayoutY(-1100);
//		
//		return;
//	}
//	void Rotate_Group(Group c,boolean reverse,int angle,int duration)
//	{
//		RotateTransition rt=new RotateTransition(Duration.seconds(duration),c);
//		//rt.setAutoReverse(reverse);
//		rt.setByAngle(angle);
//		rt.setRate(3);
//		rt.setCycleCount(500);
//		rt.playFromStart();
//	}
//	
//	public void xmovement() {
//		AnimationTimer timer2=new AnimationTimer() {
//			int flag=0;
//			int ranger=2300;
//			int ranger2=800;
//			//@Override
//			
//	
//			public void handle(long arg0) {
//		//		b.ball.setCenterY(b.ball.getCenterY()-9);
//				obs.get(1).setLayoutX(obs.get(1).getLayoutX()+3);
//				if(obs.get(1).getLayoutX()>=1500) {
//					//g2.setLayoutX(g2.getLayoutX());
//					ranger2=1600;
//					obs.get(1).setLayoutX(0);
//				}
//				
//				obs.get(2).setLayoutX(obs.get(2).getLayoutX()+3);
//				if(obs.get(2).getLayoutX()>=ranger)
//				{
//					//ranger=1500;
//					obs.get(2).setLayoutX(800);
//					ranger2=800;
//				}
//				//flag++;
//				if(flag>1000000)
//					stop();
//							
//			}
//};
//timer2.start();
//
//
//
//
//	}
//	
//	
//	public void xxmove() {
//		AnimationTimer timer1=new AnimationTimer() {
//			int flag=0;
//			int ranger=2300;
//			int ranger2=800;
//			//@Override
//			
//
//			public void handle(long arg0) {
////				b.ball.setCenterY(b.ball.getCenterY()-9);
//				g31.setLayoutX(g31.getLayoutX()+2);
//				if(g31.getLayoutX()>=ranger2) {
//					//g2.setLayoutX(g2.getLayoutX());
//					ranger2=1600;
//					g31.setLayoutX(-800);
//				}
//				
//				g32.setLayoutX(g32.getLayoutX()+2);
//				if(g32.getLayoutX()>=800)
//				{
//					//ranger=1500;
//					g32.setLayoutX(-800);
//					ranger2=800;
//				}
//				//flag++;
//				if(flag>1000000)
//					stop();
//							
//			}
//		};
//		timer1.start();
//	}
//	
//	void Rotate(Shape c, boolean reverse, int angle, int duration) {
//		RotateTransition rt = new RotateTransition(Duration.seconds(duration), c);
//		rt.setAutoReverse(reverse);
//		rt.setByAngle(angle);
//		rt.setRate(3);
//		rt.setCycleCount(500);
//		rt.playFromStart();
//	}
//	
//	public Obstacle(Group g)
//	{
//		this.setG(g);
//	}
//
//	public Group getG() {
//		return this.g;
//	}
//
//	public void setG(Group g) {
//		this.g = g;
//	}
//	
//	public void hitBall(Ball c)
//	{
//		
//	}
//	public ArrayList<Group> obstacle_creator() {
//		
//		Group canvas2=new Group();
//
////roup g1=new Group();
//		
//		Path path1=new Path();
//		path1.getElements().add(new MoveTo(300,400));
//		path1.getElements().add(new LineTo(500,400));
//		path1.setStrokeWidth(15);
//		path1.setStroke(Color.CYAN);
//		
//		
//		Path path2=new Path();
//		path2.getElements().add(new MoveTo(300,385));
//		path2.getElements().add(new LineTo(300,175));
//		path2.setStrokeWidth(15);
//		path2.setStroke(Color.GOLD);
//		
//		Path path3=new Path();
//		path3.getElements().add(new MoveTo(500,385));
//		path3.getElements().add(new LineTo(500,175));
//		path3.setStrokeWidth(15);
//		path3.setStroke(Color.LAWNGREEN);
//		
//		Path path4=new Path();
//		path4.getElements().add(new MoveTo(300,175));
//		path4.getElements().add(new LineTo(500,175));
//		path4.setStrokeWidth(15);
//		path4.setStroke(Color.CYAN);
//		
//		g1.getChildren().addAll(path1,path2,path3,path4);
//		Rotate_Group(g1,false,360,20);
//
//	
//		
//		
//		Path path39 = new Path();
//		path39.getElements().add(new MoveTo(0, 385));
//		path39.getElements().add(new LineTo(0, 175));
//		path39.setStrokeWidth(15);
//		path39.setStroke(Color.LAWNGREEN);
//
//
//		Path path19 = new Path();
//		path19.getElements().add(new MoveTo(-100, 355));
//		path19.getElements().add(new LineTo(-100, 155));
//		path19.setStrokeWidth(15);
//		path19.setStroke(Color.rgb(255,0, 255));
//		
//		
//		Path path29 = new Path();
//		path29.getElements().add(new MoveTo(-200, 385));
//		path29.getElements().add(new LineTo(-200, 175));
//		path29.setStrokeWidth(15);
//		path29.setStroke(Color.LAWNGREEN);
//		
//		
//		Path path49 = new Path();
//		path49.getElements().add(new MoveTo(-300, 355));
//		path49.getElements().add(new LineTo(-300, 155));
//		path49.setStrokeWidth(15);
//		path49.setStroke(Color.LAWNGREEN);
//		
//		
//		
//		Path path31 = new Path();
//		path31.getElements().add(new MoveTo(-400, 385));
//		path31.getElements().add(new LineTo(-400, 175));
//		path31.setStrokeWidth(15);
//		path31.setStroke(Color.LAWNGREEN);
//
//
//		Path path11 = new Path();
//		path11.getElements().add(new MoveTo(-500, 355));
//		path11.getElements().add(new LineTo(-500, 155));
//		path11.setStrokeWidth(15);
//		path11.setStroke(Color.rgb(255,0, 255));
//		
//		
//		Path path21 = new Path();
//		path21.getElements().add(new MoveTo(-600, 385));
//		path21.getElements().add(new LineTo(-600, 175));
//		path21.setStrokeWidth(15);
//		path21.setStroke(Color.LAWNGREEN);
//		
//		
//		Path path41 = new Path();
//		path41.getElements().add(new MoveTo(-700, 355));
//		path41.getElements().add(new LineTo(-700, 155));
//		path41.setStrokeWidth(15);
//		path41.setStroke(Color.LAWNGREEN);
//
////		Path path4 = new Path();
////		path4.getElements().add(new MoveTo(300, 175));
////		path4.getElements().add(new LineTo(500, 175));
////		path4.setStrokeWidth(15);
////	//	path4.setStroke(Color.CYAN);
//		
//
//		g11.getChildren().addAll( path19,path29,path49,path39,path11,path21,path31,path41);
//		
//		Path path32 = new Path();
//		path32.getElements().add(new MoveTo(-800, 385));
//		path32.getElements().add(new LineTo(-800, 175));
//		path32.setStrokeWidth(15);
//		path32.setStroke(Color.LAWNGREEN);
//
//
//		Path path12 = new Path();
//		path12.getElements().add(new MoveTo(-900, 355));
//		path12.getElements().add(new LineTo(-900, 155));
//		path12.setStrokeWidth(15);
//		path12.setStroke(Color.rgb(255,255, 0));
//		
//		
//		Path path22 = new Path();
//		path22.getElements().add(new MoveTo(-1000, 385));
//		path22.getElements().add(new LineTo(-1000, 175));
//		path22.setStrokeWidth(15);
//		path22.setStroke(Color.LAWNGREEN);
//		
//		
//		Path path42= new Path();
//		path42.getElements().add(new MoveTo(-1100, 355));
//		path42.getElements().add(new LineTo(-1100, 155));
//		path42.setStrokeWidth(15);
//		path42.setStroke(Color.LAWNGREEN);
//		
//		
//		
//		Path path312 = new Path();
//		path312.getElements().add(new MoveTo(-1200, 385));
//		path312.getElements().add(new LineTo(-1200, 175));
//		path312.setStrokeWidth(15);
//		path312.setStroke(Color.LAWNGREEN);
//
//
//		Path path112 = new Path();
//		path112.getElements().add(new MoveTo(-1300, 355));
//		path112.getElements().add(new LineTo(-1300, 155));
//		path112.setStrokeWidth(15);
//		path112.setStroke(Color.rgb(255,255, 0));
//		
//		
//		Path path212 = new Path();
//		path212.getElements().add(new MoveTo(-1400, 385));
//		path212.getElements().add(new LineTo(-1400, 175));
//		path212.setStrokeWidth(15);
//		path212.setStroke(Color.LAWNGREEN);
//		
//		
//		Path path412 = new Path();
//		path412.getElements().add(new MoveTo(-1500, 355));
//		path412.getElements().add(new LineTo(-1500, 155));
//		path412.setStrokeWidth(15);
//		path412.setStroke(Color.LAWNGREEN);
//		g21.getChildren().addAll( path12,path22,path42,path32,path112,path212,path312,path412);
//		g11.setLayoutY(-400);
//		g21.setLayoutY(-400);
//		obs.add(g1);
//		obs.add(g11);
//		obs.add(g21);
//
//		
//		Path path5=new Path();
//		path5.getElements().add(new MoveTo(300,400));
//		path5.getElements().add(new LineTo(500,400));
//		path5.setStrokeWidth(20);
//		path5.setStroke(Color.CYAN);
//		
//		Path path6=new Path();
//		path6.getElements().add(new MoveTo(280,400));
//		path6.getElements().add(new LineTo(390,180));
//		path6.setStrokeWidth(20);
//		path6.setStroke(Color.GOLD);
//		
//		Path path7=new Path();
//		path7.getElements().add(new MoveTo(520,400));
//		path7.getElements().add(new LineTo(410,180));
//		path7.setStrokeWidth(20);
//		path7.setStroke(Color.rgb(255,0,255));
//		
//		g2.getChildren().addAll(path5,path6,path7);
//		Rotate_Group(g2,false,360,20);
//		g2.setLayoutY(-800);
//		obs.add(g2);
//		
//
//		
//		Arc a1=new Arc(400,400,100,100,-1,25*Math.PI+1);
//		a1.setType(ArcType.OPEN);
//		a1.setStroke(Color.rgb(255,126,0));
//		a1.setStrokeWidth(20);
//		
//		Arc a2=new Arc(400,400,100,100,89,25*Math.PI+1);
//		a2.setType(ArcType.OPEN);
//		a2.setStroke(Color.LAWNGREEN);
//		a2.setStrokeWidth(20);
//		
//		Arc a3=new Arc(400,400,100,100,179,25*Math.PI+1);
//		a3.setType(ArcType.OPEN);
//		a3.setStroke(Color.rgb(255,62,23));
//		a3.setStrokeWidth(20);
//		
//		Arc a4=new Arc(400,400,100,100,269,25*Math.PI+1);
//		a4.setType(ArcType.OPEN);
//		a4.setStroke(Color.rgb(255,0,255));
//		a4.setStrokeWidth(20);
//		
//		g4.getChildren().addAll(a1,a2,a3,a4);
//		
//		Rotate_Group(g4,false,360,20);
//		g4.setLayoutY(-1300);
//		obs.add(g4);
//		
//	
//		
//		Path path100 = new Path();
//		path100.getElements().add(new MoveTo(0, 400));
//		path100.getElements().add(new LineTo(205, 400));
//		path100.setStrokeWidth(15);
//		path100.setStroke(Color.CYAN);
//		
//		Path path101 = new Path();
//		path101.getElements().add(new MoveTo(200, 400));
//		path101.getElements().add(new LineTo(405, 400));
//		path101.setStrokeWidth(15);
//		path101.setStroke(Color.rgb(255,255, 0));
//		
//		Path path102 = new Path();
//		path102.getElements().add(new MoveTo(400, 400));
//		path102.getElements().add(new LineTo(605, 400));
//		path102.setStrokeWidth(15);
//	//	path102.setst
//		path102.setStroke(Color.LAWNGREEN);
//		
//		Path path103 = new Path();
//		path103.getElements().add(new MoveTo(600, 400));
//		path103.getElements().add(new LineTo(805, 400));
//		path103.setStrokeWidth(15);
//		path103.setStroke(Color.rgb(255,0, 255));
//		g31.getChildren().addAll(path100,path101,path102,path103);
//		
//		Path path1001 = new Path();
//		path1001.getElements().add(new MoveTo(0, 400));
//		path1001.getElements().add(new LineTo(205, 400));
//		path1001.setStrokeWidth(15);
//
//		path1001.setStroke(Color.CYAN);
//		
//		Path path1011 = new Path();
//		path1011.getElements().add(new MoveTo(200, 400));
//		path1011.getElements().add(new LineTo(405, 400));
//		path1011.setStrokeWidth(15);
//		path1011.setStroke(Color.rgb(255,255, 0));
//		
//		Path path1021 = new Path();
//		path1021.getElements().add(new MoveTo(400, 400));
//		path1021.getElements().add(new LineTo(605, 400));
//		path1021.setStrokeWidth(15);
//	
//		path1021.setStroke(Color.LAWNGREEN);
//		
//		Path path1031 = new Path();
//		path1031.getElements().add(new MoveTo(600, 400));
//		path1031.getElements().add(new LineTo(805, 400));
//		path1031.setStrokeWidth(15);
//		path1031.setStroke(Color.rgb(255,0, 255));
//		g32.getChildren().addAll(path1001,path1011,path1021,path1031);
//		g32.setLayoutX(-1600);
//		g31.setLayoutX(-800);
//		g31.setLayoutY(-1600);
//		g32.setLayoutY(-1600);
//		obs.add(g31);
//		obs.add(g32);
//	
//
//		
//		
//		
//		//canvas2.getChildren().addAll(g1);
//		return obs;
//		
//	}
//	
//}