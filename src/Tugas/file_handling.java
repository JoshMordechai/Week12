package Tugas;


import  java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
	
	public static void main(String[] args) {
		try {
			File Obj = new File("myfile.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("AN error has occurred.");
			e.printStackTrace();
		}
	}

}
