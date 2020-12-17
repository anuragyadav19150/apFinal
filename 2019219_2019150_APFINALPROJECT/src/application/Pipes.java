package application;
import java.io.FileNotFoundException;
import java.util.*;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Pipes implements Collider{

	private Group g;
	
	public Pipes(Group g)
	{
		this.g=g;
	}
	

	public Group getG() {
		return this.g;
	}

	public void setG(Group g) {
		this.g = g;
	}
	
	@Override
	public void collision(Ball b, gameplay2 g,Scene s1,Stage stage,Aftercollision2 af,int points) {
		
		if(((Path)Shape.intersect(b.ball, (Shape) this.getG().getChildren().get(0))).getElements().size()>0) {
			
				//System.out.println("Collided");
				g.down=0;
				g.flag1=0;
				b.setX_coord(b.getX_coord()+70);
				try {
					af.start11(stage, s1,points);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	
		}
		
		if(((Path)Shape.intersect(b.ball, (Shape) this.getG().getChildren().get(1))).getElements().size()>0) {
			//System.out.println("Collided");
			g.down=0;
			g.flag1=0;
			b.setX_coord(b.getX_coord()+70);
			try {
				af.start11(stage, s1,points);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
	}
	
}