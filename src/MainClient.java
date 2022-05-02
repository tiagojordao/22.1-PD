import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        int operation;
        Trip trip = new Trip();
        FlyCompany fc = new FlyCompany();

        BookingServiceInterface server = (BookingServiceInterface)
                Naming.lookup("rmi://127.0.0.1:2001/BookingServiceImpl");

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("TIN`S Booking Service\nEscolha algumas das opções abaixo para continuar");
        System.out.println("1 - Digitar manualmente\n2 - Ver companias");
        System.out.println("-----------------------------------------------------------------------");
        operation = sc.nextInt();

        switch (operation) {
            case 1:
                sc.nextLine();
                System.out.print("Digite o local de saida: ");
                trip.setLeaving_from(sc.nextLine());

                System.out.print("Digite o destino: ");
                trip.setGoing_to(sc.nextLine());

                System.out.print("Data de saida: ");
                trip.setLeaving_date(sc.nextLine());

                System.out.print("Data de chegada: ");
                trip.setArriving_date(sc.nextLine());

                System.out.print("Deseja voo direto? S/N: ");
                trip.setDirect_flight(sc.nextLine().charAt(0));
                break;
            case 2:
                break;
            default:
                System.out.println("Wrong inputs!");
        }

        server.route(trip);

        System.out.println("----------------------------------------------------------");
        System.out.println("Você agendou a sua viagem com as seguintes informações:\n");

        System.out.println("Local de saída: "+ trip.getLeaving_from());
        System.out.println("Local de chegada: " + trip.getGoing_to());

        System.out.println("Data de saída: " + trip.getLeaving_date());
        System.out.println("Data de chegada: " + trip.getArriving_date());

        if(trip.getDirect_flight()){
            System.out.println("Voo direto? Sim");
        }
        else {
            System.out.println("Voo direto? Não");
        }
    }
}