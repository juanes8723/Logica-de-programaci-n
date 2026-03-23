import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);

      for(int contador = 0; contador < 3; contador++) {
         System.out.print("Ingrese su Nombre: ");
         String nombre = dato.nextLine();
         
         System.out.print("Ingrese su apellido: ");
         String apellido = dato.nextLine();
         
         System.out.print("Ingrese su identificación: ");
         int identificacion = dato.nextInt();
         dato.nextLine(); // Limpiar el buffer para la próxima entrada
         System.out.println("Apellido: " + apellido);
         System.out.println("Nombre: " + nombre);
         System.out.println("Identificación: " + identificacion);

         System.out.println("-----------------------------");
      }

   }
}
