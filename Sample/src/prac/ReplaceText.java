package prac;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class fileprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String search=args[0];
		String replace=args[1];
		
		 try {
			 File csvFile = new File("C:\\Users\\agwan\\eclipse-workspace\\Sample\\src\\prac\\feedback dataset.csv");
			 File dataFile = new File("C:\\Users\\agwan\\eclipse-workspace\\Sample\\src\\prac\\temp.csv");
			 String content = null;
			 
			 if(!dataFile.exists())
			 {
				 content = FileUtils.readFileToString(csvFile, "UTF-8");
				 
			 }
			 else {
				 content = FileUtils.readFileToString(dataFile , "UTF-8");
			 }
			 
			 
		     if(content.contains(search))
		     {
		    	 
		    	 content = content.replaceFirst(search, replace);
			     
		    	 FileUtils.writeStringToFile(dataFile , content, "UTF-8");
			     
			     new FindText(1);
		     }
		    
		     else {
		    	 FileUtils.writeStringToFile(dataFile, content , "UTF-8");
		    	 new FindText(0);
		     }
		    
		  } catch (IOException e) {
		     //Simple exception handling
			  new FindText(2);
		  }
	}

}
