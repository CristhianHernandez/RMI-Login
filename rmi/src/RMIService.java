


import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.security.spec.InvalidKeySpecException;

public class RMIService {

    //Operational Classes

    private static RMIManager _rmiManager;
    private static final int RMIPort = 1234;

    //Constructors
    public RMIService() throws InvalidKeySpecException, IOException, Exception {
        try (ServerSocket serverSocket = new ServerSocket(RMIPort)) {
            System.out.println("puerto disponible...");
            serverSocket.close();
            this._rmiManager = new RMIManager(RMIPort);

        } catch (IOException x) {
            System.out.println("el puerto esta ocupado..." + x);
        }
    }


    public String getSesion(String Nombre, String Contra) throws RemoteException{
        String _translationRule = _rmiManager.getSesion(Nombre, Contra);
        return _translationRule;
    }
    
    
}
