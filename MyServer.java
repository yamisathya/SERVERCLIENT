import java.net.*;  
import java.io.*; 
 
class MyServer{  
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
