package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;

/*//import java.awt.Button;
import java.awt.Label;
import javafx.scene.control.Button; 

import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;*/

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Shape;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;

public class gameplay extends Application {
	static int flag = 0;
	Scene scene2;
	float down = 2.2f; // 2.2
	int rcycle = 3;
	float rate = 3;
	int count = 5;
	RotateTransition rt;
	star s = new star();
	Label box, box20;
	StackPane sp1, sp21;
	int scnt = 0;
	boolean power = false;
	boolean power1 = false;
	int max[]=new int[3];

	int x0 = 0;
	int x1 = -750;
	int x2 = -1350;
	int x3 = -1950;
	int x4 = -2450;
	int x5 = -3050;
	int x6 = -3100;
	int x7 = -2800;

	int y0 = 750;
	int y1 = 600;
	int y2 = 600;
	int y3 = 500;
	int y4 = 600;

	int xmaster = 0;

	Glow glow = new Glow();

	public gameplay() {

	}

	gameplay g;

	AfterCollison ac = new AfterCollison();

	Group g5 = new Group();
	Group g6 = new Group();
	Group g8 = new Group();
	Group g9 = new Group();
	int outside = 0;
	int upper = 0;
	int l = 0;
	Random rand = new Random();
	Pause1 p = new Pause1();

	ArrayList<Obstacle> a = new ArrayList<Obstacle>();
	ArrayList<Obstacle> a5 = new ArrayList<Obstacle>();

	int Stars_collected = 0, leaf_collected = 0;

	public void schnager(int dd) {
		this.Stars_collected = dd;

	}

	public void lchnager(int dd) {
		this.leaf_collected = dd;

	}

	public int sgetter() {
		return this.Stars_collected;
	}

	void Collision(Shape c1, Shape c2) {
		if (c1.getBoundsInParent().intersects(c2.getBoundsInParent())) {
			c1.setFill(Color.BROWN);

		}
	}

	colorChanger c1 = new colorChanger(400, 50);

	void xmove1() {

		AnimationTimer timer1 = new AnimationTimer() {
			int flag = 0;
			int ranger = 1600;
			int ranger2 = 800;

			public void handle(long arg0) {

				g8.setLayoutX(g8.getLayoutX() + 2);
				if (g8.getLayoutX() >= ranger2) {
					g8.setLayoutX(-800);
				}

				g9.setLayoutX(g9.getLayoutX() + 2);
				if (g9.getLayoutX() >= 800) {
					ranger = 801;
					g9.setLayoutX(-800);

				}

				if (flag > 1000000)
					stop();

			}
		};
		timer1.start();

	}

	void Rotate_Shape(Shape c, boolean reverse, int angle, int duration) {
		RotateTransition rt = new RotateTransition(Duration.seconds(duration), c);
		rt.setAutoReverse(reverse);
		rt.setByAngle(angle);
		rt.setRate(this.rate);
		rt.setCycleCount(500);
		rt.playFromStart();
	}

	void Rotate_Group(Group c, boolean reverse, int angle, int duration) {
		rt = new RotateTransition(Duration.seconds(duration), c);

		rt.setByAngle(angle);
		rt.setRate(this.rate);
		rt.setCycleCount(500);
		rt.playFromStart();

	}

	Stage window;

	public void startu(Stage primaryStage, Scene s3, Scene s5, ArrayList<SavedGame> savedlist, Saver_Loader sl, int x,
			int sd, int ld) {
		window = primaryStage;
		Pane canvas1 = new Pane();

		g = new gameplay();
		g.power = false;

		if (x != 0) {
			g.xmaster = x;
			g.x0 = x0 + x;
			g.x1 = x1 + x;
			g.x2 = x2 + x;
			g.x3 = x3 + x;
			g.x4 = x4 + x;
			g.x5 = x5 + x;
			g.x6 = x5 + x;

			if (g.x5 >= 800) {
				g.x5 = g.x7 + 400;
				g.x6 = g.x5 - 100;
				g.x4 = g.x5 + y4;
				g.x3 = g.x4 + y3;
				g.x2 = g.x3 + y2;
				g.x1 = g.x2 + y1;
				g.x0 = g.x1 + y0;

			}

			else if (g.x4 >= 800) {
				g.x4 = g.x7 + 400;
				g.x3 = g.x4 + y3;
				g.x2 = g.x3 + y2;
				g.x1 = g.x2 + y1;
				g.x0 = g.x1 + y0;

			}

			else if (g.x3 >= 800) {
				g.x3 = g.x7 + 400;
				g.x2 = g.x3 + y2;
				g.x1 = g.x2 + y1;
				g.x0 = g.x1 + y0;

			}

			else if (g.x2 >= 800) {
				g.x2 = g.x7 + 400;
				g.x1 = g.x2 + y1;
				g.x0 = g.x1 + y0;

			}

			else if (g.x1 >= 800) {
				g.x1 = g.x7 + 400;
				g.x0 = g.x1 + y0;

			} else if (g.x0 >= 800) {

				g.x0 = g.x7 + 400;

			}

		}

		g.Stars_collected = sd;
		g.leaf_collected = ld;

		Ball b = new Ball(400, 500, Color.rgb(255, 0, 0).toString());
		Button but = new Button();
		Pane r = new Pane();

		box = new Label(String.valueOf(g.Stars_collected));
		sp1 = new StackPane(box);
		Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 45);
		box.setFont(font);

		box.setTextFill(Color.WHITE);

		sp1.setLayoutX(100);
		sp1.setLayoutY(20);
		sp1.getEffect();

		StackPane star1 = new StackPane();
		Image star11 = new Image("star.png");
		ImageView images1 = new ImageView(star11);
		images1.setX(35);
		images1.setY(100);
		images1.setFitHeight(40);
		images1.setFitWidth(40);
		star1.getChildren().add(images1);
		star1.setLayoutX(25);
		star1.setLayoutY(30);

		box20 = new Label(String.valueOf(g.leaf_collected));
		sp21 = new StackPane(box20);
		Font font20 = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 45);
		box20.setFont(font20);

		box20.setTextFill(Color.WHITE);

		sp21.setLayoutX(100);
		sp21.setLayoutY(80);
		sp21.getEffect();

		StackPane heart1 = new StackPane();
		Image image1 = new Image("hh2.png");
		ImageView imagev1 = new ImageView(image1);
		imagev1.setX(35);
		imagev1.setY(100);
		imagev1.setFitHeight(60);
		imagev1.setFitWidth(60);
		heart1.getChildren().add(imagev1);
		heart1.setLayoutX(20);
		heart1.setLayoutY(80);

		StackPane heart = new StackPane();
		Image image = new Image("hh2.png");
		ImageView imagev = new ImageView(image);

		imagev.setFitHeight(80);
		imagev.setFitWidth(80);
		Group g20 = new Group();
		heart.getChildren().add(imagev);
		g20.getChildren().add(heart);
		g20.setLayoutX(380);

		StackPane speedy = new StackPane();
		Image speedy1 = new Image("speed.png");
		ImageView speedy2 = new ImageView(speedy1);

		speedy2.setFitHeight(80);
		speedy2.setFitWidth(80);
		Group g21 = new Group();
		speedy.getChildren().add(speedy2);
		g21.getChildren().add(speedy);
		g21.setLayoutX(378);

		Label box1 = new Label("FOR BALL TO JUMP PRESS 'W' & FOR PAUSE PRESS 'P'");
		StackPane sp12 = new StackPane(box1);
		Font font2 = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20);
		box1.setFont(font2);

		box1.setTextFill(Color.WHITE);
		sp12.setLayoutX(50);
		sp12.setLayoutY(700);
		sp12.getEffect();

		but.setScaleY(1);
		but.setScaleX(0.8);
		but.setLayoutX(710);
		but.setLayoutY(20);
		r.getChildren().add(but);

		but.setOnAction(e -> {
			try {
				down = 0f;
				p.start11(primaryStage, scene2, s5, down, savedlist, g, sl);
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}

		});

		Image img1 = new Image("pause.png");
		ImageView imgView1 = new ImageView(img1);
		imgView1.setX(0);
		imgView1.setY(0);

		imgView1.setFitHeight(50);
		imgView1.setFitWidth(60);
		but.setGraphic(imgView1);

		Group g1 = new Group();

		Path path1 = new Path();
		path1.getElements().add(new MoveTo(300, 400));
		path1.getElements().add(new LineTo(500, 400));
		path1.setStrokeWidth(15);
		path1.setStroke(Color.rgb(255, 0, 0));

		Path path2 = new Path();
		path2.getElements().add(new MoveTo(300, 385));
		path2.getElements().add(new LineTo(300, 175));
		path2.setStrokeWidth(15);
		path2.setStroke(Color.rgb(255, 0, 255));

		Path path3 = new Path();
		path3.getElements().add(new MoveTo(500, 385));
		path3.getElements().add(new LineTo(500, 175));
		path3.setStrokeWidth(15);
		path3.setStroke(Color.rgb(0, 255, 0));

		Path path4 = new Path();
		path4.getElements().add(new MoveTo(300, 175));
		path4.getElements().add(new LineTo(500, 175));
		path4.setStrokeWidth(15);
		path4.setStroke(Color.rgb(255, 255, 0));
		g1.getChildren().addAll(path1, path2, path3, path4);

		Group g2 = new Group();

		Group g3 = new Group();

		Path path8 = new Path();
		path8.getElements().add(new MoveTo(400, 400));
		path8.getElements().add(new LineTo(500, 400));
		path8.setStrokeWidth(20);
		path8.setStroke(Color.rgb(255, 0, 0));

		Path path9 = new Path();
		path9.getElements().add(new MoveTo(520, 390));
		path9.getElements().add(new LineTo(520, 280));
		path9.setStrokeWidth(20);
		path9.setStroke(Color.rgb(255, 0, 255));

		Path path10 = new Path();
		path10.getElements().add(new MoveTo(540, 400));
		path10.getElements().add(new LineTo(640, 400));
		path10.setStrokeWidth(20);
		path10.setStroke(Color.rgb(0, 255, 0));

		Path path11 = new Path();
		path11.getElements().add(new MoveTo(520, 410));
		path11.getElements().add(new LineTo(520, 520));
		path11.setStrokeWidth(20);
		path11.setStroke(Color.rgb(255, 255, 0));

		g3.getChildren().addAll(path8, path9, path10, path11);

		Group g4 = new Group();

		Arc a1 = new Arc(400, 400, 100, 100, -1, 25 * Math.PI + 1);
		a1.setType(ArcType.OPEN);
		a1.setStroke(Color.rgb(255, 0, 255));
		a1.setStrokeWidth(20);

		Arc a2 = new Arc(400, 400, 100, 100, 89, 25 * Math.PI + 1);
		a2.setType(ArcType.OPEN);
		a2.setStroke(Color.rgb(255, 0, 0));
		a2.setStrokeWidth(20);

		Arc a3 = new Arc(400, 400, 100, 100, 179, 25 * Math.PI + 1);
		a3.setType(ArcType.OPEN);
		a3.setStroke(Color.rgb(0, 255, 0));
		a3.setStrokeWidth(20);

		Arc a4 = new Arc(400, 400, 100, 100, 269, 25 * Math.PI + 1);
		a4.setType(ArcType.OPEN);
		a4.setStroke(Color.rgb(255, 255, 0));
		a4.setStrokeWidth(20);

		g4.getChildren().addAll(a1, a2, a3, a4);

		Arc a11 = new Arc(400, 400, 100, 100, -1, 25 * Math.PI + 1);
		a11.setType(ArcType.OPEN);
		a11.setStroke(Color.rgb(255, 0, 255));
		a11.setStrokeWidth(20);

		Arc a21 = new Arc(400, 400, 100, 100, 89, 25 * Math.PI + 1);
		a21.setType(ArcType.OPEN);
		a21.setStroke(Color.rgb(255, 0, 0));
		a21.setStrokeWidth(20);

		Arc a31 = new Arc(400, 400, 100, 100, 179, 25 * Math.PI + 1);
		a31.setType(ArcType.OPEN);
		a31.setStroke(Color.rgb(0, 255, 0));
		a31.setStrokeWidth(20);

		Arc a41 = new Arc(400, 400, 100, 100, 269, 25 * Math.PI + 1);
		a41.setType(ArcType.OPEN);
		a41.setStroke(Color.rgb(255, 255, 0));
		a41.setStrokeWidth(20);
		g2.getChildren().addAll(a11, a21, a31, a41);

		Path path19 = new Path();
		path19.getElements().add(new MoveTo(-100, 355));
		path19.getElements().add(new LineTo(-100, 155));
		path19.setStrokeWidth(15);
		path19.setStroke(Color.rgb(255, 0, 255));

		Path path29 = new Path();
		path29.getElements().add(new MoveTo(-200, 385));
		path29.getElements().add(new LineTo(-200, 175));
		path29.setStrokeWidth(15);
		path29.setStroke(Color.rgb(0, 255, 0));

		Path path39 = new Path();
		path39.getElements().add(new MoveTo(0, 385));
		path39.getElements().add(new LineTo(0, 175));
		path39.setStrokeWidth(15);
		path39.setStroke(Color.rgb(255, 0, 0));

		Path path49 = new Path();
		path49.getElements().add(new MoveTo(-300, 355));
		path49.getElements().add(new LineTo(-300, 155));
		path49.setStrokeWidth(15);
		path49.setStroke(Color.rgb(255, 255, 0));

		Path path31 = new Path();
		path31.getElements().add(new MoveTo(-400, 385));
		path31.getElements().add(new LineTo(-400, 175));
		path31.setStrokeWidth(15);
		path31.setStroke(Color.rgb(255, 0, 255));

		Path path12 = new Path();
		path12.getElements().add(new MoveTo(-500, 355));
		path12.getElements().add(new LineTo(-500, 155));
		path12.setStrokeWidth(15);
		path12.setStroke(Color.rgb(255, 0, 0));

		Path path21 = new Path();
		path21.getElements().add(new MoveTo(-600, 385));
		path21.getElements().add(new LineTo(-600, 175));
		path21.setStrokeWidth(15);
		path21.setStroke(Color.rgb(0, 255, 0));

		Path path41 = new Path();
		path41.getElements().add(new MoveTo(-700, 355));
		path41.getElements().add(new LineTo(-700, 155));
		path41.setStrokeWidth(15);
		path41.setStroke(Color.rgb(255, 255, 0));

		g5.getChildren().addAll(path19, path29, path39, path49, path31, path12, path21, path41);

		Path path13 = new Path();
		path13.getElements().add(new MoveTo(-900, 355));
		path13.getElements().add(new LineTo(-900, 155));
		path13.setStrokeWidth(15);
		path13.setStroke(Color.rgb(255, 0, 255));

		Path path22 = new Path();
		path22.getElements().add(new MoveTo(-1000, 385));
		path22.getElements().add(new LineTo(-1000, 175));
		path22.setStrokeWidth(15);
		path22.setStroke(Color.rgb(0, 255, 0));

		Path path42 = new Path();
		path42.getElements().add(new MoveTo(-1100, 355));
		path42.getElements().add(new LineTo(-1100, 155));
		path42.setStrokeWidth(15);
		path42.setStroke(Color.rgb(255, 0, 0));

		Path path32 = new Path();
		path32.getElements().add(new MoveTo(-800, 385));
		path32.getElements().add(new LineTo(-800, 175));
		path32.setStrokeWidth(15);
		path32.setStroke(Color.rgb(255, 255, 0));

		Path path112 = new Path();
		path112.getElements().add(new MoveTo(-1300, 355));
		path112.getElements().add(new LineTo(-1300, 155));
		path112.setStrokeWidth(15);
		path112.setStroke(Color.rgb(255, 0, 255));

		Path path212 = new Path();
		path212.getElements().add(new MoveTo(-1400, 385));
		path212.getElements().add(new LineTo(-1400, 175));
		path212.setStrokeWidth(15);
		path212.setStroke(Color.rgb(255, 0, 0));

		Path path312 = new Path();
		path312.getElements().add(new MoveTo(-1200, 385));
		path312.getElements().add(new LineTo(-1200, 175));
		path312.setStrokeWidth(15);
		path312.setStroke(Color.rgb(0, 255, 0));

		Path path412 = new Path();
		path412.getElements().add(new MoveTo(-1500, 355));
		path412.getElements().add(new LineTo(-1500, 155));
		path412.setStrokeWidth(15);
		path412.setStroke(Color.rgb(255, 255, 0));
		g6.getChildren().addAll(path13, path22, path42, path32, path112, path212, path312, path412);

		Group g10 = new Group();
		Path path100 = new Path();
		path100.getElements().add(new MoveTo(0, 400));
		path100.getElements().add(new LineTo(200, 400));
		path100.setStrokeWidth(15);
		path100.setStroke(Color.rgb(255, 0, 0));

		Path path101 = new Path();
		path101.getElements().add(new MoveTo(200, 400));
		path101.getElements().add(new LineTo(400, 400));
		path101.setStrokeWidth(15);
		path101.setStroke(Color.rgb(0, 255, 0));

		Path path102 = new Path();
		path102.getElements().add(new MoveTo(400, 400));
		path102.getElements().add(new LineTo(600, 400));
		path102.setStrokeWidth(15);

		path102.setStroke(Color.rgb(255, 255, 0));

		Path path103 = new Path();
		path103.getElements().add(new MoveTo(600, 400));
		path103.getElements().add(new LineTo(800, 400));
		path103.setStrokeWidth(15);
		path103.setStroke(Color.rgb(255, 0, 255));
		g8.getChildren().addAll(path100, path101, path102, path103);

		Path path1001 = new Path();
		path1001.getElements().add(new MoveTo(0, 400));
		path1001.getElements().add(new LineTo(200, 400));
		path1001.setStrokeWidth(15);

		path1001.setStroke(Color.rgb(255, 0, 0));

		Path path1011 = new Path();
		path1011.getElements().add(new MoveTo(200, 400));
		path1011.getElements().add(new LineTo(400, 400));
		path1011.setStrokeWidth(15);
		path1011.setStroke(Color.rgb(0, 255, 0));

		Path path1021 = new Path();
		path1021.getElements().add(new MoveTo(400, 400));
		path1021.getElements().add(new LineTo(600, 400));
		path1021.setStrokeWidth(15);

		path1021.setStroke(Color.rgb(255, 255, 0));

		Path path1031 = new Path();
		path1031.getElements().add(new MoveTo(600, 400));
		path1031.getElements().add(new LineTo(800, 400));
		path1031.setStrokeWidth(15);
		path1031.setStroke(Color.rgb(255, 0, 255));
		g9.getChildren().addAll(path1001, path1011, path1021, path1031);
		g9.setLayoutX(-800);

		g.Rotate_Group(g3, false, 360, 10);
		g.Rotate_Group(g4, false, 360, 10);
		g.Rotate_Group(g1, false, 360, 20);
		g.Rotate_Group(g2, false, 360, 20);

		g1.setLayoutY(g.x0);
		g2.setLayoutY(g.x1);
		g3.setLayoutY(g.x2);
		g20.setLayoutY(g1.getLayoutY() + 4);
		g4.setLayoutY(g.x3);

		g5.setLayoutY(g.x4);
		g6.setLayoutY(g.x4);
		g8.setLayoutY(g.x5);
		g9.setLayoutY(g.x5);
		g20.setLayoutY(-100);
		g21.setLayoutY(g.x6);

		Obstacle o1 = new Rectangle(g1);
		Obstacle o2 = new circle(g2);
		Obstacle o3 = new Rotating_X(g3);
		Obstacle o4 = new circle(g4);
		Obstacle o5 = new rectanglePiece(g5);
		Obstacle o6 = new Linex(g8);
		Obstacle o7 = new Linex(g9);
		Obstacle o8 = new rectanglePiece(g6);
		xmove1();

		AnimationTimer timer2 = new AnimationTimer() {
			int flag = 0;
			int ranger = 2400;
			int ranger2 = 800;

			public void handle(long arg0) {
				box.setText(String.valueOf(g.Stars_collected));

				if (g.scnt >= count) {

					g.rate += 0.25;
					g.Rotate_Group(g3, false, 360, 10);
					g.Rotate_Group(g4, false, 360, 10);
					g.Rotate_Group(g1, false, 360, 20);
					g.Rotate_Group(g2, false, 360, 20);
					count += 5;
				}
				box20.setText(String.valueOf(g.leaf_collected));

				g5.setLayoutX(g5.getLayoutX() + 1.5);
				if (g5.getLayoutX() >= 1600) {

					ranger2 = 1600;
					g5.setLayoutX(0);
				}

				g6.setLayoutX(g6.getLayoutX() + 1.5);
				if (g6.getLayoutX() >= ranger) {

					g6.setLayoutX(800);
					ranger2 = 800;
				}

				if (flag > 1000000)
					stop();

			}
		};
		timer2.start();

		ArrayList<Group> s1 = new ArrayList();
		s1 = s.starAdder();

		a.add(o1);
		a.add(o2);
		a.add(o3);
		a.add(o4);

		StackPane sp = new StackPane();
		Image img = new Image("b12.png");
		ImageView imgView = new ImageView(img);
		imgView.setX(50);
		imgView.setY(25);
		imgView.setFitHeight(800);
		imgView.setFitWidth(800);
		sp.getChildren().add(imgView);

		canvas1.getChildren().addAll(sp, but, o1.getG(), o2.getG(), o3.getG(), o4.getG(), o5.getG(), o6.getG(),
				o7.getG(), o8.getG(), g20, c1.changer, s1.get(0), s1.get(1), s1.get(2), sp12, b.ball, sp1, heart1, sp21,
				star1, g21);
		scene2 = new Scene(canvas1, 800, 800);

		window.setScene(scene2);

		Bounds bounds = canvas1.getBoundsInLocal();
		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {

				if (g.power1 == false) {
					o1.hitBall(b, primaryStage, scene2, s5, g);
					o3.hitBall(b, primaryStage, scene2, s5, g);
					o4.hitBall(b, primaryStage, scene2, s5, g);
					o2.hitBall(b, primaryStage, scene2, s5, g);
					o6.hitBall(b, primaryStage, scene2, s5, g);
					o7.hitBall(b, primaryStage, scene2, s5, g);
					o5.hitBall(b, primaryStage, scene2, s5, g);
					o8.hitBall(b, primaryStage, scene2, s5, g);
				}

				if (g.power == true) {
					glow.setLevel(100);
					b.ball.setEffect(glow);
					AnimationTimer timern = new AnimationTimer() {

						@Override
						public void handle(long arg0) {
							c1.CollisionWithBall(b, canvas1, c1, s, g.scnt, g);
							s.CollisionWithBall(b, g, box);

							if (b.ball.getBoundsInParent().intersects(g20.getBoundsInParent())) {
								g.leaf_collected++;
								box20.setText(String.valueOf(g.leaf_collected));
								g20.setLayoutY(g20.getLayoutY() - 800 - 2800);
							}

							g1.setLayoutY(g1.getLayoutY() + 1);
							g2.setLayoutY(g2.getLayoutY() + 1);
							g3.setLayoutY(g3.getLayoutY() + 1);
							g4.setLayoutY(g4.getLayoutY() + 1);
							g5.setLayoutY(g5.getLayoutY() + 1);
							g6.setLayoutY(g6.getLayoutY() + 1);
							g8.setLayoutY(g8.getLayoutY() + 1);
							g9.setLayoutY(g9.getLayoutY() + 1);
							c1.setY_coord(c1.getY_coord() + 1);
							g20.setLayoutY(g20.getLayoutY() + 1);
							g21.setLayoutY(g21.getLayoutY() + 1);
							sp12.setLayoutY(sp12.getLayoutY() + 1);
							s.y_dec1();

							if (g1.getLayoutY() >= 801) {
								g1.setLayoutY(-2800);
								o1.lower = 1;
								o1.inside = 0;
								o1.upper = 0;
							}
							if (g2.getLayoutY() >= 801) {
								g2.setLayoutY(-2800);
								o2.lower = 1;
								o2.inside = 0;
								o2.upper = 0;
							}
							if (g3.getLayoutY() >= 801)
								g3.setLayoutY(-2800);
							if (g4.getLayoutY() >= 801) {
								g4.setLayoutY(-2800);
								o4.lower = 1;
								o4.inside = 0;
								o4.upper = 0;
							}
							if (g5.getLayoutY() >= 801)
								g5.setLayoutY(-2800);
							if (g6.getLayoutY() >= 801)
								g6.setLayoutY(-2800);
							if (g8.getLayoutY() >= 801)
								g8.setLayoutY(-2800);
							if (g9.getLayoutY() >= 801)
								g9.setLayoutY(-2800);

							flag++;
							if (flag > 1600) {

								g.power = false;
								glow.setLevel(0);
								b.setColor(Color.rgb(255, 0, 0).toString());
								stop();

							}

						}

					};
					timern.start();

				}

				if (b.ball.getBoundsInParent().getCenterY() < bounds.getMaxY()) {

					b.ball.setCenterY(b.ball.getCenterY() + g.down);

				} else {

					try {
						ac.start111(primaryStage, scene2, s5, g, b);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

		};
		timer.start();

		scene2.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (g.power == false) {
					g.down = 2.2f;
					g.power1 = false;
				}
				rcycle = 3;
				// rt.play();

				if (event.getCode().toString().equals("W")) {
					flag = 0;

					AnimationTimer timer1 = new AnimationTimer() {

						@Override
						public void handle(long arg0) {

							if (g.power == false) {
								c1.CollisionWithBall(b, canvas1, c1, s, g.scnt, g);
								s.CollisionWithBall(b, g, box);

								b.ball.setCenterY(b.ball.getCenterY() - b.getJump_value());

								if (b.ball.getBoundsInParent().intersects(g20.getBoundsInParent())) {
									g.leaf_collected++;
									box20.setText(String.valueOf(g.leaf_collected));
									g20.setLayoutY(g20.getLayoutY() - 800 - 2800);
								}

								if (b.ball.getBoundsInParent().intersects(g21.getBoundsInParent())) {

									g21.setLayoutY((g21.getLayoutY() - 800 - 2800) * 2);
									g.power = true;
									g.down = 0;
									g.power1 = true;
									b.setColor(Color.rgb(255, 119, 28).toString());

								}

								if (b.ball.getBoundsInParent().getCenterY() <= 400) {

									g1.setLayoutY(g1.getLayoutY() + 4);
									g2.setLayoutY(g2.getLayoutY() + 4);
									g3.setLayoutY(g3.getLayoutY() + 4);
									g4.setLayoutY(g4.getLayoutY() + 4);
									g5.setLayoutY(g5.getLayoutY() + 4);
									g6.setLayoutY(g6.getLayoutY() + 4);
									g8.setLayoutY(g8.getLayoutY() + 4);
									g9.setLayoutY(g9.getLayoutY() + 4);
									c1.setY_coord(c1.getY_coord() + 4);
									g20.setLayoutY(g20.getLayoutY() + 4);
									g21.setLayoutY(g21.getLayoutY() + 4);
									sp12.setLayoutY(sp12.getLayoutY() + 4);
									s.y_dec();

									if (g1.getLayoutY() >= 801) {
										g1.setLayoutY(-2800);
										o1.lower = 1;
										o1.inside = 0;
										o1.upper = 0;
									}
									if (g2.getLayoutY() >= 801) {
										g2.setLayoutY(-2800);
										o2.lower = 1;
										o2.inside = 0;
										o2.upper = 0;
									}
									if (g3.getLayoutY() >= 801)
										g3.setLayoutY(-2800);
									if (g4.getLayoutY() >= 801) {
										g4.setLayoutY(-2800);
										o4.lower = 1;
										o4.inside = 0;
										o4.upper = 0;
									}
									if (g5.getLayoutY() >= 801)
										g5.setLayoutY(-2800);
									if (g6.getLayoutY() >= 801)
										g6.setLayoutY(-2800);
									if (g8.getLayoutY() >= 801)
										g8.setLayoutY(-2800);
									if (g9.getLayoutY() >= 801)
										g9.setLayoutY(-2800);
								}

								flag++;
								if (flag > 9)
									stop();

							}
						}
					};
					timer1.start();

					AnimationTimer timer2 = new AnimationTimer() {

						@Override
						public void handle(long arg0) {
							int n = rand.nextInt(5);
							Object h1 = a.get(n);

						}

					};

				} else if (event.getCode().toString().equals("P")) {
					g.down = 0f;

					try {
						p.start11(primaryStage, scene2, s5, down, savedlist, g, sl);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});

		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}