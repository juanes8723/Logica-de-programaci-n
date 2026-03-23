
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String lote;
        int cantidad;
        System.out.println("Ingrese el número de lote: ");
        lote=dato.nextLine();
        System.out.println("Ingrese la cantidad de llantas: ");
        cantidad=dato.nextInt();
        byte par_impar;
        if (cantidad % 2 == 0) {
            par_impar = 0;
            System.out.println("# de lote: "+lote
                +"\nCantidad de llantas: "+cantidad
                +"\nPar o Impar: "+par_impar
            );
        } else {
            par_impar = 1;
            System.out.println("# de lote: "+lote
                +"\nCantidad de llantas: "+cantidad
                +"\nPar o Impar: "+par_impar
            );
        }
    }
    
}
