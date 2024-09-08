/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rmiexample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author prajwal
 */
public class RemoteMessageServices extends UnicastRemoteObject implements MessageServices{
    private String message;
    
    public RemoteMessageServices() throws RemoteException{
    }

    @Override
    public void sendMessage(String msg) {
        this.message=msg;
    }

    @Override
    public String recieveMessage() {
        return message;
    }
    
}
