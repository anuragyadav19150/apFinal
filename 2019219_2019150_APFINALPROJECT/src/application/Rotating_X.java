package application;

import java.io.FileNotFoundException;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Rotating_X extends Obstacle{

	public Rotating_X(Group g) {
		super(g);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hitBall(Ball c,Stage stage,Scene s1,Scene s2,gameplay game) {
		
		if(c.getColor().equals(Color.rgb(255,119 , 28).toString()))
		{
			
		}
		
		else if(((Path)Shape.intersect(c.ball, (Shape) this.getG().getChildren().get(0))).getElements().size()>0) {
			if(!c.getColor().equals(Color.rgb(255,0 , 0).toString())) {
				//System.out.println("inside red");
								try {
					a.start11(stage, s1, s2,game,c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("collided");
			}
			}
		else if(((Path)Shape.intersect(c.ball, (Shape) this.getG().getChildren().get(1))).getElements().size()>0) 
		{
		
			if(!c.getColor().equals(Color.rgb(255,0 , 255).toString())) {
				
				try {
					a.start11(stage, s1, s2,game,c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//System.out.println("collided");
			}
			}
			//System.out.println(Color.rgb(255,0 , 255).toString());
		else if(((Path)Shape.intersect(c.ball, (Shape) this.getG().getChildren().get(2))).getElements().size()>0) 
		{
			
			if(!c.getColor().equals(Color.rgb(0,255,0).toString())) {
				
				try {
					a.start11(stage, s1, s2,game,c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("collided");
			}
			}
			//System.out.println(Color.rgb(0,255,0).toString());
		else if(((Path)Shape.intersect(c.ball, (Shape) this.getG().getChildren().get(3))).getElements().size()>0) 
		{
			//System.out.println("y");
			if(!c.getColor().equals(Color.rgb(255,255,0).toString())) {
				//System.out.println("inside y");
				try {
					a.start11(stage, s1, s2,game,c);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("collided");
			}
			}
		//System.out.println(Color.rgb(255,255,0).toString());
	}
	
}