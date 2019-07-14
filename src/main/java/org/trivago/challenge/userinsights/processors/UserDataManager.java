package org.trivago.challenge.userinsights.processors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;

public class UserDataManager {
	public static void processUserData(MultipartFile file) {
		List<List<String>> records = new ArrayList<List<String>>();
		Reader reader;
		try {
			reader = new InputStreamReader(file.getInputStream());
			try (CSVReader csvReader = new CSVReader(reader);) {
			    String[] values = null;
			    while ((values = csvReader.readNext()) != null) {
			        records.add(Arrays.asList(values));
			    }
			    System.out.println("FINAL FILE LENGTH:"+records.size());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
}
