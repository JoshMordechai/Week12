package Tugas;


import  java.io.File;
import java.io.IOException;

public class file_handling {
	
	public static void main(String[] args) {
		try {
			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File Created = " + Obj.getName());
			}
			else {
				System.out.println("File already exist.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
