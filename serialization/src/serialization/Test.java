//Amtul Maryam
//Serialization

package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
 

public class Test {
	 public static void main(String[] args) throws Exception 
	    {
		// implement info in ArrayList
	     ArrayList<String> namesList = new ArrayList<String>();
	     
	     try
	     {
	         FileInputStream fis = new FileInputStream("information"); //info of data
	         ObjectInputStream ois = new ObjectInputStream(fis);

	         namesList = (ArrayList) ois.readObject();

	         ois.close();
	         fis.close();
	     } 
	     catch (IOException ioe) 
	     {
	         ioe.printStackTrace();
	         return;
	     } 
	     //Error found
	     catch (ClassNotFoundException c) 
	     {
	         System.out.println("Error");
	         c.printStackTrace();
	         return;
	     }
	      
	     // information of names, phone number, date of birth, email
	     for (String name : namesList) {
	         System.out.println(name);
	     }
	 }



}
