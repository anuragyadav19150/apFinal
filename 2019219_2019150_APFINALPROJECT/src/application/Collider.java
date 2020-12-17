package application;
import java.util.*;

import javafx.scene.Scene;
import javafx.stage.Stage;

public interface Collider {

	public void collision(Ball b, gameplay2 g,Scene s1,Stage stage,Aftercollision2 af,int points);
}