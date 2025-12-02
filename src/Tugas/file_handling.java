package Tugas;


import  java.io.FileWriter;
import java.io.IOException;

public class file_handling {
	
	public static void main(String[] args) {
		try {
			FileWriter Writer
				= new FileWriter("myfile.txt");
			Writer.write("Nama saya John Doe\n");
			Writer.write("Saya dari Universitas Multimedia Nusantara");
			Writer.close();
			System.out.println("SUccesfully written");
		}
		catch (IOException e) {
			System.out.println("AN error has occurred.");
			e.printStackTrace();
		}
	}
}
