import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingServiceInterface {


    protected BookingServiceImpl() throws RemoteException {
        super();

    }

    @Override
    public void route(String one_way_trip, String return_trip)
            throws RemoteException {

        System.out.println("Ida: "+one_way_trip);
        System.out.println("Volta: "+return_trip);


    }
}
