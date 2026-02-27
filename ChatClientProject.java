/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chatclientproject;






import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClientProject {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6000);
        System.out.println("Connected to the chat server!");

        // Thread to listen for messages from the server
        new Thread(() -> {
            try (Scanner in = new Scanner(socket.getInputStream())) {
                while (in.hasNextLine()) {
                    System.out.println("Broadcast: " + in.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

       
        try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner console = new Scanner(System.in)) {
            while (console.hasNextLine()) {
                out.println(console.nextLine());
            }
        }
    }
}