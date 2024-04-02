import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();
        TicketingSystem ticketingSystem = new TicketingSystem();

        String[][] seatsMatrix = bookingSystem.getSeatsMatrix();
        ArrayList<Ticket> ticketsList = ticketingSystem.createTicketsList();

        System.out.println("Bienvenido/a al sistema de reserva de asientos.");

        String option = "start";
        while(option.equals("start")){
            System.out.println("Por favor, seleccione una opción del menú: ");
            System.out.println("1. Visualizar mapa de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Ver precio total de tickets");
            System.out.println("4. Ver información de tickets por fila");
            System.out.println("5. Salir del sistema");

            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    bookingSystem.printSeatsMap(seatsMatrix);
                    break;
                case 2:
                    Map<String, Integer> rowAndSeatMap = bookingSystem.bookSeats(seatsMatrix, input);

                    Random random = new Random();
                    int ticketNumber = random.nextInt(9001) + 1000;
                    int row = rowAndSeatMap.get("row");
                    int seat = rowAndSeatMap.get("seat");
                    LocalDate purchaseDate = LocalDate.now();
                    LocalDate expirationDate = purchaseDate.plusDays(7);
                    double ticketPrice = ticketingSystem.getTicketPriceByRow(row);

                    Ticket ticket = new Ticket(
                        ticketNumber,
                        row,
                        seat,
                        purchaseDate,
                        expirationDate,
                        ticketPrice
                    );

                    ticketsList.add(ticket);
                    break;
                case 3:
                    System.out.println("El precio combinado de todos los asientos/tickets reservados es: $" + ticketingSystem.getTotalTicketPriceFromList(ticketsList) + "\".");
                    break;
                case 4:
                    System.out.println("Ingrese el número de fila: ");
                    int rowInput = input.nextInt();
                    ticketingSystem.getTicketInfoByRow(ticketsList, rowInput);
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