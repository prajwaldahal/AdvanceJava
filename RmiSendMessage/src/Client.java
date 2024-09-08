/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prajwal
 */
import java.rmi.*;
import java.rmi.registry.*;
public class Client {
    public static void main(String[] args) {
         MessageReciever skeletonLock,skeletonMsg;
        try {
            while(true){
                Registry reg = LocateRegistry.getRegistry("127.0.0.1",999);
                skeletonLock = (MessageReciever) reg.lookup("lock");
                if(!skeletonLock.getLock())
                {
                    skeletonLock.sentAck(false);
                    skeletonMsg=(MessageReciever) reg.lookup("msg");
                    System.out.println(skeletonMsg.recieveMessage());
                    skeletonLock.sentAck(true);
                }  
                
            }
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("something went wrong");
        }
    }
}
