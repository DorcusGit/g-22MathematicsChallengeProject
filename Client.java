import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{

    public static void main(String [] d){
         
        try{
    
        Socket soc=new Socket("localhost", 5121);
        BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter P=new PrintWriter(soc.getOutputStream(),true);
        BufferedReader Br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println("\t Welcome to mathematics Challenge System ");

    }catch(IOException e){
        e.printStackTrace();
    }
}
}