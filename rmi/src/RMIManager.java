
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.spec.InvalidKeySpecException;

public class RMIManager implements InterfaceRmiCommunication {

    //Operational Classes
    private static Registry _registry;
    private static InterfaceRmiCommunication _stub;
    String bv;

    //Constructors
    public RMIManager(int rmiPort) throws IOException, InvalidKeySpecException, Exception {
        _registry = LocateRegistry.createRegistry(rmiPort);
        this._stub = (InterfaceRmiCommunication) UnicastRemoteObject.exportObject(this, 0);

        try {
            System.setProperty("java.security.policy", "java.policy");
            System.setSecurityManager(new RMISecurityManager());
            _registry.bind("rmiServer", _stub);
            System.out.println("Esperando peticiones del cliente...");
        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Server exception: " + e.toString());
        }
    }

    @Override

        public String getSesion(String Nombre, String Contra) throws RemoteException{
            if(Nombre.equals("Crixo") && Contra.equals("123"))
            {
                bv = "Bienvenido "+Nombre;
            }
            else
            {
                bv = "credencial incorrecta";
            }
            return bv;
        }

    @Override
    public Integer getSuma(int num1, int num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getResta(int num1, int num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getDivision(int num1, int num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getMultiplicacion(int num1, int num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPotencia(double num1, double num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRaiz(double num1, double num2) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
