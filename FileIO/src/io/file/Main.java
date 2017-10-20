package io.file;

import java.io.IOException;

import io.file.util.IOUtil;

public class Main {

	public static void main(String[] args) {
		
		IOUtil util = new IOUtil();
		
		try {
			util.fileIO(args[0], args[1], Integer.parseInt(args[2]));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
