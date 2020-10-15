import java.io.File; 
import java.io.PrintWriter;

public class FileDemoPrint { 
  // Re: "throws Exception: We'll see better, more responsible 
  // ways to deal with exceptions soon
  public static void main(String[] args) throws Exception { 
    // Check args.length to make sure there is input
    if (args.length != 1) { 
      System.out.println("Usage: java FileDemo filename"); 
      // if not, exit the program
      System.exit(1); 
    } 
    
    String filename = args[0]; 
    File file = new File(filename); 
    System.out.println("File:\t\t" + filename); 
    // Return the absolute file name
    System.out.println("Absolute Path:\t" + file.getAbsolutePath()); 
    System.out.println("Exists?\t\t" + file.exists()); 
    System.out.println("Can Read?\t\t" + file.canRead()); 
    System.out.println("Can Write?\t\t" + file.canWrite()); 
    System.out.println("Length:\t\t" + file.length()); 
    
    if (file.exists() == false) {  // (!file.exists()) 
      System.out.println("File doesn't exist yet."); 
      PrintWriter output = new PrintWriter(file); 
      output.println("I have written to my file."); 
      output.close(); 
    } 
    else{
      System.out.println("File exists, so I'm going to overwrite it."); 
      PrintWriter output = new PrintWriter(file); 
      output.println("I have written to my old file."); 
      output.close(); 
    }
    
  } 
} 