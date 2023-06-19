package com.serializationAndDeserialization;

import java.io.File;
import java.io.FileInputStream;

public class UserDeserialization {
	
	public static void main(String[] args) {
		try {
			File file=new File("User.txt");
			
			if(file.exists())
			{
				System.out.println("File already exists");
				
				FileInputStream fileInputStream=new FileInputStream(file);
				
			}
			else
			{
				System.out.print("file does not exist");
			}
		} catch (Exception e) {
			
			
		}
	}

}
