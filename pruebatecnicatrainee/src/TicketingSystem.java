import java.util.ArrayList;
import java.util.List;


public class TicketingSystem {
    List<Ticket> ticketList = new ArrayList<Ticket>(100);

    public double getTotalTicketPriceFromList(ArrayList<Ticket> ticketList){
        double totalTicketPrice = 0;

        for (Ticket ticket: ticketList){
            totalTicketPrice += ticket.getPrice();
        }

        return totalTicketPrice;
    }

    public void getTicketInfoByRow(ArrayList<Ticket> ticketList, int row){
        System.out.println("Esta es la información de los tickets pertenecientes a la fila " + row);

        for (Ticket ticket: ticketList){
            if (ticket.getRow() == row){
                ticket.getTicketInfo();
            }
        }
    }


}
