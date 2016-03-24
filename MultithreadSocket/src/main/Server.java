import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static final int PORT = 5050;

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server Started");
        try {
            while (true){
                Socket socket = s.accept();
                try {
                    new ThreadFactory(socket);
                } catch (IOException e) {
                    socket.close();
                }
            }
        }
        finally {
            s.close();
        }
    }

}
