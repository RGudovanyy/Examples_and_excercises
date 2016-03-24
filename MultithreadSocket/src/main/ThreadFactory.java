import java.io.*;
import java.net.Socket;

public class ThreadFactory extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ThreadFactory(Socket s) throws IOException {
        this.socket = s;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
        start();
    }

    public void run(){
        try{
            while (true){
                String message = in.readLine();
                if(message.equals("Bye"))
                    break;
                System.out.println(message);
                out.println(message);
            }
        }catch (IOException e){
            System.err.println("IOException");
        }
        finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
