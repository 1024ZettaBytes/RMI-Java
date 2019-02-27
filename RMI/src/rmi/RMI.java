
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author lv1013
 */
public interface RMI extends Remote{
    public String saluda(String nombre) throws RemoteException;
    public float suma(float a, float b) throws RemoteException;
    public float resta(float a, float b) throws RemoteException;
    public float multiplica(float a, float b) throws RemoteException;
    public float divide(float a, float b) throws RemoteException;
}
