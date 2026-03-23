
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int llegadas,inventario,totalInventario=0;
        String fecha;
        System.out.println("¿Cuántas llegadas desea ingresar?");
        llegadas= dato.nextInt();
        dato.nextLine(); // Limpiar el buffer para la próxima entrada   
        for(int i=0;i<llegadas;i++){
            System.out.print("Ingrese la fecha: ");
            fecha = dato.nextLine();
            System.out.print("Ingrese el inventario: ");
            inventario = dato.nextInt();
            dato.nextLine(); // Limpiar el buffer para la próxima entrada
            totalInventario=totalInventario+inventario;
            System.out.println("Fecha: " + fecha);
            System.out.println("Inventario: " + inventario);
            System.out.println("Total inventario: " + totalInventario);
        }
    }
}
