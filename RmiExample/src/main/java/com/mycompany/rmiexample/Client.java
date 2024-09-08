package com.mycompany.rmiexample;

import java.rmi.*;
import java.rmi.registry.*;
public class Client {
    public static void main(String[] args) {
        try {
            Registry reg =LocateRegistry.getRegistry("127.0.0.1",123);
            MessageServices skeleton=(MessageServices) reg.lookup("msg");
            System.out.println("msg= "+ skeleton.recieveMessage());
        } catch (NotBoundException | RemoteException ex) {
            System.out.println(ex.toString());
        }
    }
}
