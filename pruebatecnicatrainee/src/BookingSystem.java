import java.util.Scanner;
public class BookingSystem {

    public String[][] getSeatsMatrix(){

        String [][] seatsMatrix = new String [10][10];

        for (int r = 0; r < seatsMatrix.length; r++){
            for (int c = 0; c < seatsMatrix.length; c++){
                seatsMatrix[r][c] = "L";
            }
        }

        return seatsMatrix;
    }

    public void printSeatsMap(String[][] matrix){
        System.out.println("Este es el mapa de asientos. Una 'X' significa que el asiento fue reservado. Una 'L' indica que el asiento está disponible para reserva.");

        for (int r = 0; r < matrix.length; r++){
            if (r <= 8) {
                System.out.print("Fila " + "0"+(r + 1) + ": ");
            } else {
                System.out.print("Fila " + (r + 1) + ": ");
            }
            for (int c = 0; c < matrix.length; c++){
                System.out.print("A" + (c+1) + ":" + matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public void bookSeats(String[][] matrix, Scanner input){
        System.out.println("A continuación se le solicitará el número de fila y asiento para realizar la reserva. Para volver al menú principal ingrese el texto 'salir'.");

        String option = "si";

        while (option.equals("si")) {

            System.out.println("Ingrese la fila del asiento a reservar: ");
            int row = input.nextInt();

            System.out.println("Ingrese el número de asiento a reservar: ");
            int seat = input.nextInt();

            if (row > 10 || row < 0 || seat > 10 || seat < 0){
                System.out.println("Ha ingresado una fila o número de asiento inválido. Solo existen 10 filas y 10 asientos por fila.");
                continue;
            }

            if (matrix[row][seat].equals("X")){
                System.out.println("Lo sentimos, el asiento seleccionado ya está reservado.");
            } else {
                System.out.println("¡El asiento ha sido reservado con éxito!");
                matrix[row - 1][seat - 1] = "X";
            }

            System.out.println("¿Desea realizar otra reserva? Escriba 'si' para continuar o 'menu' para volver al menú principal.");
            option = input.next();
        }

    }
}
