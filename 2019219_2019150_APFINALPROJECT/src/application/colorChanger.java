package application;
import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
public class colorChanger {
	private int x_coord,y_coord;
	Circle changer;
	Image i=new Image("colorChanger.png");
	
	public colorChanger(int x,int y)
	{
		this.x_coord=x;
		this.y_coord=y;
		this.changer=new Circle(15,Color.BLACK);
		this.changer.relocate(x, y);
		this.changer.setFill(new ImagePattern(i));
	}

	public int getX_coord() {
		return x_coord;	
	}

	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
		this.changer.relocate(this.x_coord, this.y_coord);
	}

	public int getY_coord() {
		return y_coord;
	}

	public void setY_coord(double d) {
		this.y_coord = (int) d;
		this.changer.relocate(this.x_coord, this.y_coord);
	}
	
	public void Change_Color(Ball b) {
		Random rand=new Random();
		int n=rand.nextInt(4);
		
		if(n==0)
			b.setColor(Color.rgb(255, 0, 0).toString());
		else if(n==1)
			b.setColor(Color.rgb(255, 0, 255).toString());
		else if(n==2)
			b.setColor(Color.rgb(0, 255, 0).toString());
		else if(n==3)
			b.setColor(Color.rgb(255, 255, 0).toString());
	}
	
	public void CollisionWithBall(Ball b,Pane canvas,colorChanger c, star s1, int scnt, gameplay g) {
		
		int kk=scnt%3;
		
		
		if(b.ball.getBoundsInParent().intersects(c.changer.getBoundsInParent()))
		{
			if(b.getColor().equals(Color.rgb(255,119 , 28).toString()) )
			{
				c.setY_coord(s1.s.get(kk).getLayoutY()-50);
			}
			else
			{
			c.Change_Color(b);

			c.setY_coord(s1.s.get(kk).getLayoutY()-50);
			}
		
			
			
		}
	}
}