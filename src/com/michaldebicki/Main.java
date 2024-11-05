package com.michaldebicki;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {


            while (true) {
//                Socket socket = serverSocket.accept();
//                System.out.println("Client connected");
//                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
//
//                String echoString = input.readLine();
//                try{
//                    Thread.sleep(15000);
//                } catch (InterruptedException e){
//                    System.out.println("Thread interrupted");
//                }
//                if(echoString.equals("exit")){
//                    break;
//                }
//                output.println("Echo from server: " + echoString);
                new Echoer(serverSocket.accept()).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
