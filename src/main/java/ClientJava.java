import java.util.*;
import org.apache.xmlrpc.*;

public class ClientJava {
   public static void main (String [] args) {
   
      try {
         String serverUrl = "http://localhost/";
         XmlRpcClient client =  new XmlRpcClient("http://localhost/"); 
         Vector params = new Vector();
         
         params.addElement(10);
         params.addElement(8);

          int result = (Integer)client.execute("sample.difference", params);

                  System.out.println("Результат умножения двух чисел = "+ result);

      } catch (Exception exception) {
         System.err.println("JavaClient: " + exception);
      }
   }
}