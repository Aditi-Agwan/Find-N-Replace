package prac;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Test {

	public static void main(String[] args) {
		String search ="He is a good person.";
		// TODO Auto-generated method stub
        File csvFile = new File("C:\\Users\\agwan\\eclipse-workspace\\Sample\\src\\prac\\sample.csv");
        
        try {
        	  InputStreamReader ip=new InputStreamReader(new FileInputStream(csvFile));
        	  CSVParser parser =CSVFormat.DEFAULT.parse(ip);
        	  List<CSVRecord> listCsvRecord =  new ArrayList<>();
        	 
              listCsvRecord.addAll(parser.getRecords());
              System.out.println(listCsvRecord);
        }catch(Exception e) {
        	System.out.println("!");
        }
        	  
		

	}
	}

