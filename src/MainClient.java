import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        Trip trip = new Trip();

        BookingServiceInterface server = (BookingServiceInterface)
                Naming.lookup("rmi://127.0.0.1:2001/BookingServiceImpl");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o local de saida: ");
        trip.setLeaving_from(sc.nextLine());

        System.out.print("Digite o destino: ");
        trip.setGoing_to(sc.nextLine());

        System.out.print("Data de saida: ");
        trip.setLeaving_date(sc.nextLine());

        System.out.print("Data de chegada: ");
        trip.setArriving_date(sc.nextLine());

        System.out.print("Deseja voo direto:");
        trip.setDirect_flight(sc.nextLine().charAt(0));

        server.route(trip);
    }

}