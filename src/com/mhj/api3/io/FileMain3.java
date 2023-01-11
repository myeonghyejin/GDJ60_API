package com.mhj.api3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileMain3 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\fileTest", "test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			//보조스트림
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String name = br.readLine();
				if(name==null) {
					break;
				}
				System.out.println(name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
