import org.apache.xmlrpc.*;

public class ServerJava { 

   public Integer difference(int x, int y){
         return x*y;
   }

   public static void main (String [] args){
   
      try {

         System.out.println("Attempting to start XML-RPC Server...");
         
         WebServer server = new WebServer(80);
         server.addHandler("sample", new ServerJava());
         server.start();
         
         System.out.println("Started successfully.");
         System.out.println("Accepting requests. (Halt program to stop.)");
         
      } catch (Exception exception){
         System.err.println("JavaServer: " + exception);
      }
   }
}