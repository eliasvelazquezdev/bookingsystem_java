import java.time.LocalDate;

public class Ticket {
    int number;
    int row;
    int seat;
    LocalDate purchaseDate;
    LocalDate expirationDate;
    double price;

    //Constructor
    public Ticket(
        int number,
        int row,
        int seat,
        LocalDate purchaseDate,
        LocalDate expirationDate,
        double price
    ){
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.purchaseDate = purchaseDate;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    // Getters & Setters
    public int getNumber(){
        return this.number;
    }

    public int getRow(){
        return this.row;
    }

    public int getSeat(){
        return this.seat;
    }

    public LocalDate getPurchaseDate(){
        return this.purchaseDate;
    }

    public LocalDate getExpirationDate(){
        return this.expirationDate;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void getTicketInfo(){
        System.out.println("Información de ticket " + this.number + ":");
        System.out.print("Fila: " + this.row + "," + "Asiento: " + this.seat + "," + "Fecha de compra: " + this.purchaseDate + "," + "Fecha de expiración: " + this.expirationDate + "," + "Precio: " + this.price);
        System.out.println(" ");
    }


}
