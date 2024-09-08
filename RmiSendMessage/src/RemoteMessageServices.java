/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prajwal
 */
import java.rmi.*;
import java.rmi.server.*;
public class RemoteMessageServices extends UnicastRemoteObject implements MessageReciever{
    private String message;
    private boolean lock;
    private boolean ack;
    public RemoteMessageServices() throws RemoteException{
        this.ack=true;
        this.lock=false;
    }
    
    @Override
    public void SendMessage(String message){
        this.message=message;
    }

    @Override
    public String recieveMessage(){
        return message;
    }  

    @Override
    public void lock(boolean l) {
       this.lock=l;
    }

    @Override
    public boolean getLock() {
        return lock;
    }

    @Override
    public void sentAck(boolean ack) {
      this.ack=ack;
    }

    @Override
    public boolean getAck() {
        return ack;
    }
    
}
