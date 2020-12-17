package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavedGame implements Serializable{
	
	int Stars;
	int leaves;
	int scnt;
	
	@Override
	public String toString()
	{
		return "";
	}
	
	
	public SavedGame(int s,int l,int sc)
	{
		this.Stars=s;
		this.leaves=l;
		this.scnt=sc;
	}
	
	
}

