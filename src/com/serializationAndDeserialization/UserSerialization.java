package com.serializationAndDeserialization;

import java.io.File;

public class UserSerialization {
	
	public static void main(String[] args) {
		try {
			File file=new File("User.txt");
			
			if(file.exists())
			{
				System.out.print("File already exist");
			}
			else
			{
				file.createNewFile();
				System.out.println("File created Successfully");
			}
			User user=new User();
			user.setId(1);
			user.setName("Mayur");
			user.setUsername("mayurmehar03");
			user.setPassword("mayurmehar2016");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
