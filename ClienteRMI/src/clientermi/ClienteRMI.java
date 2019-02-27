/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.RMI;

/**
 *
 * @author lv1013
 */
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1000);
            RMI rmi = (RMI)reg.lookup("1024Zettabytes");
            System.out.println(rmi.saluda("Eduardo"));
            System.out.println(rmi.suma(3, 5));
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
