/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rmiexample;


import java.rmi.*;
public interface MessageServices extends Remote {
    public void sendMessage(String msg) throws RemoteException;
    public String recieveMessage()throws RemoteException;
}
