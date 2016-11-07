



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException; 
    Integer getResta(int num1, int num2) throws RemoteException;
    Integer getDivision(int num1, int num2) throws RemoteException;
    Integer getMultiplicacion(int num1, int num2) throws RemoteException;
    double getPotencia(double num1, double num2) throws RemoteException;
    double getRaiz(double num1, double num2) throws RemoteException;
    String getSesion(String nombre, String Contra) throws RemoteException;
}
