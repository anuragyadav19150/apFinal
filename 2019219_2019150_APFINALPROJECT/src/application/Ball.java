package application;

import java.util.*;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {
	private int x_coord, y_coord;
	final private int jump_value;
	private String color;
	Circle ball;

	public Ball(int x, int y, String color) {
		jump_value = 9;
		this.x_coord = x;
		this.y_coord = y;
		this.color = color;

		ball = new Circle(10, Color.web(this.color));
		ball.relocate(x, y);
	}

	public int getX_coord() {
		return x_coord;
	}

	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
		this.ball.relocate(this.x_coord, this.y_coord);
	}

	public int getY_coord() {
		return y_coord;
	}

	public void setY_coord(int y_coord) {
		this.y_coord = y_coord;
		this.ball.relocate(this.x_coord, this.y_coord);
	}

	public int getJump_value() {
		return jump_value;
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		this.ball.setFill(Color.web(color));
	}

}