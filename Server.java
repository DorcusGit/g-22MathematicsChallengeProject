import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String [] args){
        try{
            ServerSocket ss=new ServerSocket(5121);
              
              System.out.println("\tMathematics Challenge System. waiting for the client.....");
              Socket soc=ss.accept();
        }catch(IOException e){
            e.printStackTrace();

        }
        
    }
}