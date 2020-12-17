package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Saver_Loader {
	
	public void write(ArrayList<SavedGame> sv) throws FileNotFoundException, IOException {
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Database.txt"));
		o.writeObject(sv);
		
	}
	
	public ArrayList<SavedGame> read() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("Database.txt"));
		ArrayList<SavedGame> g=(ArrayList<SavedGame>)o1.readObject();
		return g;
		
	}
	public void write2(int[] m) throws FileNotFoundException, IOException
	{
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("Database1.txt"));
		o.writeObject(m);
	}
	
	public int[] read2() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("Database1.txt"));
		return (int[])o1.readObject();
		
		
	}
	
}

