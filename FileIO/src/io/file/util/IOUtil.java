package io.file.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOUtil {

	BufferedReader bf = null;
	BufferedWriter br = null;
	public void fileIO(String inFile, String outFile, int linesToWrite) throws IOException {
		String data = null;
		int count=linesToWrite;
		try {
			
			bf = new BufferedReader(new FileReader(new File(inFile)));
			br = new BufferedWriter(new FileWriter(new File(outFile)));
			System.out.println("Reading file "+inFile);
			data = bf.readLine();
			while (data != null && linesToWrite > 0){
				br.write(data);
				br.newLine();
				linesToWrite--;
				data = bf.readLine();
			}
			System.out.println(count+" lines written to file "+outFile);

		} finally {
			if(bf!=null){
				bf.close();
			}
			if(br!=null){
				br.flush();
				br.close();
			}
		}

	}

}
