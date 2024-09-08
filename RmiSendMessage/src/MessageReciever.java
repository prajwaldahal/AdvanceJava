/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author prajwal
 */
import java.rmi.*;
public interface MessageReciever extends Remote  {
    public void SendMessage(String message) throws RemoteException;
    public String recieveMessage() throws RemoteException;
    public void lock(boolean l) throws RemoteException;
    public boolean getLock() throws RemoteException;
    public void sentAck(boolean ack) throws RemoteException;
    public boolean getAck() throws RemoteException;    
}
