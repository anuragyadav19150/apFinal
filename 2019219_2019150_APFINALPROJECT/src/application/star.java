 package application;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;

import java.util.*;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Shape;

public class star {
	//private Group g;
	private int x_coord;
	private int y_coord;
	private int points;
	Group star1=new Group();
	Group star2=new Group();
	Group star3=new Group();
	
	ArrayList<Group> s=new ArrayList();
	
	public star()
	{
		
	}

	
	public void setpoint(int p) {
		points=p;
	}
	
	public int getpoint() {
		return points;
	}
	public void y_dec() {
		star1.setLayoutY(star1.getLayoutY()+4);
		star2.setLayoutY(star2.getLayoutY()+4);
		star3.setLayoutY(star3.getLayoutY()+4);
		
		
		
		
	}
	
	public void y_dec1() {
		star1.setLayoutY(star1.getLayoutY()+1);
		star2.setLayoutY(star2.getLayoutY()+1);
		star3.setLayoutY(star3.getLayoutY()+1);
		
		
		
		// STAR DEBUGING HELPER>>>>>>>>>
//		if(star1.getLayoutY()>=800)
//			this.s.get(0).setLayoutY(this.s.get(2).getLayoutY()-600);
//
//		if(star2.getLayoutY()>=800)
//			this.s.get(1).setLayoutY(this.s.get(0).getLayoutY()-600);
//		if(star3.getLayoutY()>=800)
//			this.s.get(2).setLayoutY(this.s.get(1).getLayoutY()-600);
	}
	
	public int getx() {
		return this.x_coord;
	}

	public void setx(int x) {
		this.x_coord= x_coord;
	}
	
	public int gety() {
		return this.y_coord;
	}

	public void sety(int y) {
		this.y_coord= y_coord;
	}
	
	public void CollisionWithBall(Ball b, gameplay g,Label box)
	{
		
		//System.out.println(g.Stars_collected+" "+g.scnt);
		if(b.ball.getBoundsInParent().intersects(this.s.get(0).getBoundsInParent()))
		{
			this.s.get(0).setLayoutY(this.s.get(2).getLayoutY()-600);
			g.Stars_collected++;
			g.scnt++;
			box.setText(String.valueOf(g.Stars_collected));
			//System.out.println(g.Stars_collected+" "+g.scnt);
		//	System.out.println(g.Stars_collected);
		}
		if(b.ball.getBoundsInParent().intersects(this.s.get(1).getBoundsInParent()))
		{
			this.s.get(1).setLayoutY(this.s.get(0).getLayoutY()-600);
			g.Stars_collected++;
			g.scnt++;
			box.setText(String.valueOf(g.Stars_collected));
		//	System.out.println(g.Stars_collected+" "+g.scnt);
		}
		if(b.ball.getBoundsInParent().intersects(this.s.get(2).getBoundsInParent()))
		{
			this.s.get(2).setLayoutY(this.s.get(1).getLayoutY()-600);
			g.Stars_collected++;
			g.scnt++;
			box.setText(String.valueOf(g.Stars_collected));
			//System.out.println(g.Stars_collected+" "+g.scnt);
		}
		
	}
	
	
	public ArrayList<Group> starAdder() {
		 Image img = new Image("star.png");
	        ImageView imgView = new ImageView(img);
	        Glow glow=new Glow(20.5);
	        imgView.setEffect(glow);
	        imgView.setX(390); 
	        imgView.setY(250);
	        
	        Image img1 = new Image("star.png");
	        ImageView imgView1 = new ImageView(img1);
	        imgView1.setEffect(glow);
	        imgView1.setX(390); 
	        imgView1.setY(250);
	        
	        Image img2 = new Image("star.png");
	        ImageView imgView2 = new ImageView(img2);
	        imgView2.setEffect(glow);
	        imgView2.setX(390); 
	        imgView2.setY(250);
	        
	        
	        star1.getChildren().add(imgView);
	        star2.getChildren().add(imgView1);
	        star3.getChildren().add(imgView2);
	        star2.setLayoutY(-600);
	        star3.setLayoutY(-1200);
	        s.add(star1);
	        s.add(star2);
	        s.add(star3);
	        return s;
	        
	       
	    
		
	}
	
	public void starSub() {
		//....
	}
	
}