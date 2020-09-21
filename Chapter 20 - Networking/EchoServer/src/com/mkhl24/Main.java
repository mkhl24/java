package com.mkhl24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        // creating socket
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            while(true) {
//                Socket socket = serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();

                new Echoer(serverSocket.accept()).start();
                
//                Socket socket = serverSocket.accept();
//                System.out.println("Client connected");
//
//                BufferedReader input = new BufferedReader(
//                        new InputStreamReader(socket.getInputStream()));
//                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//
//                String echoString = input.readLine();
//                try {
//                    Thread.sleep(15000);
//                } catch (InterruptedException e) {
//                    System.out.println("Thread interrupted");
//                }
//
//                if(echoString.equals("exit")) {
//                    break;
//                }
//                output.println("Echo from server: " + echoString);
            }

        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
