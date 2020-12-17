package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.net.*;
import java.util.ArrayList;

import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.input.KeyCode;
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class classic {
	classic() {

	}
	static ArrayList<SavedGame> sv=new ArrayList<>();
	static Scene s3;

	public static Group doit(Stage s, Scene s1,Scene s4,Scene s3,ArrayList<Scene> savedlist) {

		Canvas canvas = new Canvas();
		canvas.setHeight(800);
		canvas.setWidth(800);
		gameplay m1 = new gameplay();
		 PrevSaved pp=new PrevSaved();

	 
		
		 Saver_Loader sl=new Saver_Loader();
		
		 GraphicsContext graphics_context = canvas.getGraphicsContext2D();

		StackPane sp = new StackPane();
		Image img = new Image("B11.jpg");
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

		graphics_context.setFill(Color.BLUE);
		graphics_context.fillRect(10, 10, 70, 70);

		GraphicsContext gc = canvas.getGraphicsContext2D();
		GraphicsContext gc1 = canvas.getGraphicsContext2D();

		gc.setFill(Color.HOTPINK);
		gc.setStroke(Color.HOTPINK);
		gc.setLineWidth(2);
		Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
		gc.setFont(theFont);
		gc.fillText("CLASSIC GAME_MODE!", 150, 250);
		gc.strokeText("CLASSIC GAME_MODE!", 150, 250);

		gc1.setFill(Color.YELLOW);
		gc1.setStroke(Color.YELLOW);
		gc1.setLineWidth(1.5);
		Font theFont1 = Font.font("Times New Roman", FontWeight.BOLD, 50);
		gc1.setFont(theFont1);
		gc1.fillText("COLOR SWITCH", 200, 150);
		gc1.strokeText("COLOR SWITCH", 200, 150);

		Button b = new Button("START THE GAME");
		Button bt = new Button("PREV SAVED GAME");
		Button btt = new Button(".     EXIT     .");

		// create a stack pane
		Pane r = new Pane();

		// create a label
		Label l = new Label("");
		b.setScaleY(2);
		b.setScaleX(2);
		b.setLayoutX(200);
		b.setLayoutY(450);

		bt.setScaleY(2);
		bt.setScaleX(2);
		bt.setLayoutX(500);
		bt.setLayoutY(450);
		r.getChildren().add(b);
		// bt.setOnAction(event);

		btt.setScaleY(2);
		btt.setScaleX(2);
		btt.setLayoutX(375);
		btt.setLayoutY(550);

		r.getChildren().add(bt);
		r.getChildren().add(btt);
		Group f1 = new Group();
		b.setOnAction(e -> {

			m1.startu(s,s4,s3,sv,sl,0,0,0);
			//System.out.println(m1.g.Stars_collected);

		});

		btt.setOnAction(e -> {
			s.setScene(s1);

		});
		
		
		 bt.setOnAction(e -> {
	 			try {
					pp.start11(s, s1,sv, m1,sl,s4,s3);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	 		});

		Rectangle rectangle = new Rectangle();
		rectangle.setX(0);
		rectangle.setY(650);
		rectangle.setWidth(800);
		rectangle.setHeight(10);
		FillTransition fill = new FillTransition();
		fill.setAutoReverse(true);
		fill.setCycleCount(50);
		fill.setDuration(Duration.millis(2000));
		fill.setFromValue(Color.YELLOW);
		fill.setToValue(Color.CYAN);
		fill.setShape(rectangle);
		fill.play();

		Rectangle r1 = new Rectangle();
		r1.setX(0);
		r1.setY(700);
		r1.setWidth(800);
		r1.setHeight(10);
		FillTransition fill1 = new FillTransition();
		fill1.setAutoReverse(true);
		fill1.setCycleCount(50);
		fill1.setDuration(Duration.millis(2000));
		fill1.setFromValue(Color.YELLOW);
		fill1.setToValue(Color.CYAN);
		fill1.setShape(r1);
		fill1.play();

		Rectangle r2 = new Rectangle();
		r2.setX(0);
		r2.setY(750);
		r2.setWidth(800);
		r2.setHeight(10);
		FillTransition fill2 = new FillTransition();
		fill2.setAutoReverse(true);
		fill2.setCycleCount(50);
		fill2.setDuration(Duration.millis(2000));
		fill2.setFromValue(Color.YELLOW);
		fill2.setToValue(Color.CYAN);
		fill2.setShape(r2);
		fill2.play();

		Group g2 = new Group(sp, canvas, r, rectangle, r1, r2);
		return g2;

	}

}