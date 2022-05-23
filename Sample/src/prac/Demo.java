package prac;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Demo {

	public static void main(String[] args) {
		
		String search=args[0];
		String replace=args[1];
		// TODO Auto-generated method stub
        File csvFile = new File("C:\\Users\\agwan\\eclipse-workspace\\Sample\\src\\prac\\sample.csv");
        File dataFile = new File("C:\\Users\\agwan\\eclipse-workspace\\Sample\\src\\prac\\new.csv");
        try {
        	  InputStreamReader ip=new InputStreamReader(new FileInputStream(csvFile));
        	  CSVParser parser =CSVFormat.DEFAULT.parse(ip);
        	  OutputStreamWriter op=null;
        	  CSVPrinter csvPrinter =null;
        	  int flag=0;
        	  int temp=0;
        	  int success = 0;
        	  
        	  for(CSVRecord csvRecord : parser) {
        		 
        			  
        		if(flag==0) {
        		  flag=1;	
        		  op=new OutputStreamWriter(new FileOutputStream(dataFile));
        		  csvPrinter= new CSVPrinter(op, CSVFormat.DEFAULT);
        		  csvPrinter.printRecord("ID","Data","New Data");
        		  continue;
        		}
        		
        	 	//System.out.println("Column 1 : " + csvRecord.get(0) + "\t Column 2 : " + csvRecord.get(1) );
                if(search.equals(csvRecord.get(1))) {
                	csvPrinter.printRecord(csvRecord.get(0),csvRecord.get(1),replace);
                	csvPrinter.flush();
                	// System.out.println("Record successfully updated at index (ID) : " + csvRecord.get(0));
                	temp=1;
                	success =1;
                	
                }
                else {
                	csvPrinter.printRecord(csvRecord.get(0),csvRecord.get(1),csvRecord.get(1));
                	csvPrinter.flush();
                }
               
               }
        	   if(temp==0) {
        		  //  System.out.println("Record not found");
        		   success =0 ;
        	   }
        	   new FindText(success);
        	   
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
       }

}
