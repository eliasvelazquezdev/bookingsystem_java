import java.util.ArrayList;


public class TicketingSystem {
    public ArrayList<Ticket> createTicketsList(){
        return new ArrayList<Ticket>(100);
    }

    public double getTicketPriceByRow(int row){
        double ticketPrice = 0;

        switch (row){
            case 1 -> ticketPrice = 1500;
            case 2 -> ticketPrice = 1200;
            case 3 -> ticketPrice = 1000;
            case 4 -> ticketPrice = 900;
            case 5 -> ticketPrice = 750;
            case 6 -> ticketPrice = 600;
            case 7 -> ticketPrice = 500;
            case 8 -> ticketPrice = 350;
            case 9 -> ticketPrice = 200;
            case 10 -> ticketPrice = 150;
            default -> System.out.println("Error. Ha ingresado un número de fila incorrecto.");
        }
        return ticketPrice;
    }

    public double getTotalTicketPriceFromList(ArrayList<Ticket> ticketList){
        double totalTicketPrice = 0;

        for (Ticket ticket: ticketList){
            totalTicketPrice += ticket.getPrice();
        }

        return totalTicketPrice;
    }

    public void getTicketInfoByRow(ArrayList<Ticket> ticketList, int row){
        if (row < 0 || row > 10){
            System.out.println("Error. Ha ingresado un número de fila incorrecto.");
        } else {
            System.out.println("Esta es la información de los tickets pertenecientes a la fila " + row);

            if (ticketList.isEmpty()){
                System.out.println("No hay tickets correspondientes a ningún asiento reservado en esta fila.");
            } else {
                for (Ticket ticket: ticketList){
                    if (ticket.getRow() == row){
                        ticket.getTicketInfo();
                        System.out.println(" ");
                    } else {
                        System.out.println("No hay tickets correspondientes a ningún asiento reservado en esta fila.");
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}
