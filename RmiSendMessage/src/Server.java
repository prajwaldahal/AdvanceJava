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
import java.util.Scanner;
public class Server {
    public static void main(String[] args) {
        String msg ;
        Registry reg;
        MessageReciever stub;
        try {
            reg = LocateRegistry.createRegistry(999);
            stub = new RemoteMessageServices();
            Scanner sc = new Scanner(System.in);
            while(true){
                if(stub.getAck()){
                stub.lock(true);
                reg.rebind("lock",stub);
                System.out.println("enter a message: ");
                msg=sc.nextLine();
                stub.SendMessage(msg);
                stub.lock(false);
                reg.rebind("msg",stub);
               }
           }
        } catch (RemoteException ex) {
            System.out.println("unabe to create registry");
            System.exit(1);
        } 
        
    }
}
