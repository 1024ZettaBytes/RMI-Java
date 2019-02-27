/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.RMI;

/**
 *
 * @author lv1013
 */
public class ServidorRMI extends UnicastRemoteObject implements RMI{

    /**
     * @param args the command line arguments
     */
    public ServidorRMI() throws RemoteException{
        super();
    }
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1000);
            reg.rebind("1024Zettabytes", new ServidorRMI());
            System.out.println("Servidor iniciado...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String saluda(String nombre) throws RemoteException {
        return "Hola "+ nombre;
    }

    @Override
    public float suma(float a, float b) throws RemoteException {
        return a+b;
    }

    @Override
    public float resta(float a, float b) throws RemoteException {
        return a-b;
    }

    @Override
    public float multiplica(float a, float b) throws RemoteException {
        return a*b;
    }

    @Override
    public float divide(float a, float b) throws RemoteException {
       return a/b;
    }
    
}
