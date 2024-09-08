/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample;

import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.util.Scanner;


public class Server {
    public static void main(String[] args) {
        try {  
            Registry reg = LocateRegistry.createRegistry(123);
            MessageServices stub = new RemoteMessageServices();
            reg.rebind("msg",stub);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a message to send: ");
            String msg = sc.nextLine();
            stub.sendMessage(msg);
        } catch (RemoteException ex) {
            System.out.println(ex.toString());
        }
    }
}
