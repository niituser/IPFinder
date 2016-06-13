
import java.net.*;  
public class IPFinder{  


public static void main(String[] args) {  
    
  String url="https://www.google.co.in/";  
    try {  
        InetAddress ia=InetAddress.getByName(new URL(url).getHost());  
        String ip=ia.getHostAddress();  
      System.out.println("The IP is:" +ip);  
    } catch (UnknownHostException e1) {  
        System.out.println("Exception is :"+e1.toString());  
    }   
	catch (Exception e2) {  
        System.out.println("Exception is :"+e2.toString());  
    }  
}  
}