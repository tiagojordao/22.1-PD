import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookingServiceInterface extends Remote{

    public void route(Trip trip)
            throws RemoteException;
}