import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();
        TicketingSystem ticketingSystem = new TicketingSystem();

        String[][] seatsMap = bookingSystem.getSeatsMatrix();
        ArrayList<Ticket> ticketsList = ticketingSystem.createTicketsList();

        System.out.println("Bienvenido/a al sistema de reserva de asientos.");

        String option = "start";
        while(option.equals("start")){
            System.out.println("Por favor, seleccione una opción del menú: ");
            System.out.println("1. Visualizar mapa de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Ver precio total de tickets");
            System.out.println("4. Ver precio de tickets por fila");
            System.out.println("5. Salir del sistema");

            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    bookingSystem.printSeatsMap(seatsMap);
                    break;
                case 2:
                    bookingSystem.bookSeats(seatsMap, input);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    option = "exit";
                    System.out.println("Gracias por utilizar el programa. Hasta luego...");
                    break;
                default:
                    System.out.println("Error: ha ingresado una opción inválida.");
                    break;
            }
        }

    }

}