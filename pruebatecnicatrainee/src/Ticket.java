public class Ticket {
    int number;
    int row;
    int seat;
    String purchaseDate;
    String expirationDate;
    double price;

    //Constructor
    public Ticket(
        int number,
        int row,
        int seat,
        String purchaseDate,
        String expirationDate,
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

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public String getExpirationDate(){
        return this.expirationDate;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }



}
