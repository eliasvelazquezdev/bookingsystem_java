import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
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
                System.out.print("Fila " + "0" + (r + 1) + ": ");
            } else {
                System.out.print("Fila " + (r + 1) + ": ");
            }
            for (int c = 0; c < matrix.length; c++){
                System.out.print("A" + (c+1) + ":" + matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    public Map<String, Integer> bookSeats(String[][] matrix, Scanner input){
        String option = "si";
        Map<String, Integer> rowAndSeat = new HashMap<>();

        while (option.equals("si")) {
            System.out.println("Ingrese la fila del asiento a reservar: ");
            int row = input.nextInt();

            if (row > 10 || row < 0){
                System.out.println("Ha ingresado un número de fila inválido. Solo existen 10 filas.");
                continue;
            }

            System.out.println("Ingrese el número de asiento a reservar: ");
            int seat = input.nextInt();

            if (seat > 10 || seat < 0){
                System.out.println("Ha ingresado número de asiento inválido. Solo existen 10 asientos por fila.");
                continue;
            }

            if (matrix[row - 1][seat - 1].equals("X")){
                System.out.println("Lo sentimos, el asiento seleccionado ya está reservado.");
            } else {
                System.out.println("¡El asiento ha sido reservado con éxito!");
                matrix[row - 1][seat - 1] = "X";
            }

            rowAndSeat.put("row", row);
            rowAndSeat.put("seat", seat);

            System.out.println("¿Desea realizar otra reserva? Escriba 'si' para continuar o 'menu' para volver al menú principal.");
            option = input.next();
        }
        System.out.println("Message from bookSeats method: " + rowAndSeat);
        return rowAndSeat;
    }
}
