package com.modhuntersuk.service;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * @author - Kyle Brown
 * 
 * This class will act as the main website reader.
 */

public class ModHunterService {
	
	public void webReadere() throws Exception{
	
	URL url = new URL("");
	BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
	String line;
	
	while ((line = reader.readLine()) != null){
		System.out.println(line);
		writer.write(line);
		writer.newLine();
	}
	
	reader.close();
	writer.close();
	
	}
}
