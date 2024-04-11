public class Customer {
    int customer_id;
    int dni;
    String name;
    String lastName;

    public Customer(
        int customer_id,
        int dni,
        String name,
        String lastName
    ){
        this.customer_id = customer_id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
    }

    public int getCustomer_id(){
        return this.customer_id;
    }

    public int getDni(){
        return this.dni;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getCustomerInfo(){
        String customerInfo = "ID Cliente: " + getCustomer_id() + ", Nombre y apellido: " + getName() + " " + getLastName() + ", DNI: "  + getDni() + ".";
        return customerInfo;
    }

}
