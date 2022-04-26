import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BookingServiceInterface extends Remote{

    void route(String one_way_trip, String return_trip)
            throws RemoteException;
}