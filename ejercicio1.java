
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String tipoSangre;
        int contador = 0;

        while (contador < 3) {
            System.out.print("Ingrese su nombre: ");
            nombre = dato.nextLine();
            System.out.print("Ingrese su apellido: ");
            apellido = dato.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = dato.nextInt();
            dato.nextLine(); // Limpiar el buffer para la próxima entrada

            System.out.print("Ingrese su tipo de sangre: ");
            tipoSangre = dato.nextLine();
            

             System.out.println("La persona con nombre " + nombre +" y apellido "+ apellido+"\n tiene " + edad
                + " de edad y su tipo de sangre es " + tipoSangre
             );

            System.out.println("-----------------------------");
                
            contador++;
        }
           

    }
}