import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        BookingServiceInterface server = (BookingServiceInterface)
                Naming.lookup("rmi://127.0.0.1:2001/BookingServiceImpl");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o destino de ida");
        String one_way_trip = sc.nextLine();

        System.out.println("Digite o destino de volta");
        String return_trip = sc.nextLine();

        server.route(one_way_trip, return_trip);
    }

}