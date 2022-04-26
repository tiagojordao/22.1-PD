import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MainServer {

    public static void main(String[] args) throws RemoteException, MalformedURLException {

        System.setProperty("java.rmi.server.hostname","127.0.0.1");

        BookingServiceInterface server = new BookingServiceImpl();

        LocateRegistry.createRegistry(2001);

        Naming.rebind("rmi://127.0.0.1:2001/BookingServiceImpl", server);

        System.out.println("Server Starterd.");

    }

}
