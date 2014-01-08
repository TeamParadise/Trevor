/*
 * This is the Java file running on the Raspberry Pi to create a socket
 */
package net.pvschools.robotics.javabot.practice;
import java.net.*;
import java.io.*;

public class PiServer {
    public static class Server {
        private int portNumber;
        private boolean running;

        public Server(int portNumber) {
            this.portNumber = portNumber;
            this.running = false;
        }

        public void start() {
            this.running = true;
            // TODO: should the server be created outside this loop?
            while (this.running) {
                try (
                    ServerSocket serverSocket = new ServerSocket(portNumber);
                    Socket clientSocket = serverSocket.accept();
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ) {
                    System.out.println("Connected");
                    String inputLine;
                    while((inputLine = in.readLine()) != null) {
                        System.out.println("read: " + inputLine);
                        out.println("Sent from Pi: " + inputLine);
                    }
                } catch (IOException e) {
                    System.out.println("Exception caught when trying to listen on port "
                            + portNumber + " or listening for a connection");

                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("General Exception: " + e.getMessage());
                }
            }
        }

        public void stop() {
            this.running = false;
        }
    }


    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java PiServer <portnumber>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);
        Server server = new Server(portNumber);

        server.start();
    }
}
