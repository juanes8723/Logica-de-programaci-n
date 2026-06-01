package proyectoIntegrador;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner dato= new Scanner(System.in);//esta linea se encarga de recoger los datos
    //arreglos para datos de clientes
    static ArrayList<Integer>idClientes= new ArrayList<>();
    static ArrayList<String>nombresClientes= new ArrayList<>();
    static ArrayList<String>telefono= new ArrayList<>();
    static ArrayList<String>email= new ArrayList<>();
    //arreglos productos
    static String [] idProductos={"210","2608","2609","3946","B2U"};
    static String []nombreProducto= {"Acople aro 210","Conector 2608","Conector 2609","Conerctor mg 3946",
            "Acople universal B2U"};
    static int[]precios= {35000,8600,8600,4000,30000};
    static int[]stock_invetarios= {10,8,12,9,15};
    //arreglos para la venta
    static ArrayList<Integer> idVenta= new ArrayList<>();
    static ArrayList<Integer>informacionVenta= new ArrayList<>();
    static ArrayList<String>productoComprados= new ArrayList<>();
    static ArrayList<Byte>cantidadesCompradas= new ArrayList<>();
    static ArrayList<Integer>subtotales= new ArrayList<>();
    static String opcion1;
    static byte opcion,cantidad;
    static int verificarid,aux=0,acum=0;
    static void main() {
        System.out.println("Ingresando al sistema por favor ingrese su perfil:");
        do{
            System.out.println("""
                    1.Administrador
                    2.Cliente
                    0.Salir del sistema
                    """);
            opcion= dato.nextByte();
            switch (opcion){
                case 1:
                    System.out.println("Bienvenido");
                    moduloAdministrador();
                    break;
                case 2:
                    do{
                        System.out.println("""
                                ========Bienvenido al sistema, por favor escoge una opcion========
                                1.Crear cuenta
                                2.Mostra productos para la venta
                                0.Salir del sistema
                                """);
                        switch (opcion){
                            case 1:
                                crearClientes();
                                break;
                            case 2:
                                mostrarProductos();
                                break;
                            case 3:
                                System.out.println("Saliendo del sistema");
                                break;
                            default:
                                System.out.println("Oocion invalida");
                                break;
                        }

                    }while(opcion!=0);
                    System.out.println("Bienvedino por favor cree su cuenta");

                    break;
                case 3:
                    System.out.println("Saliendo del sistema.....");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion!=0);


    }
    public static void moduloAdministrador(){
        // con este bloque y con este iterador garantizamos que se ejecute por lo menos una vez
        do {
            //mostramos el menu
            System.out.println("""
                    Bienvenido al modulo de compras, por favor escoja una opcion:
                    1.Crear cliente
                    2.Ver clientes ingresados
                    3.Actualizar datos clientes
                    4.Productos
                    5.Venta
                    0.Salir
                    """);
            //pedimos al usuario que ingrese la opcion y la almacene en la variable opcion
            opcion= dato.nextByte();
            //el switch evalua la opcion y muestra al asuario la opcion que tomo
            switch (opcion){
                case 1:
                    crearClientes();
                    break;
                case 2:
                    mostrarClientesIngresados();
                    break;
                case 3:
                    actualizarDatosClientes();
                    break;
                case 4:
                    productos();
                    break;
                case 5:
                    venta();
                    break;

                case 0 :
                    System.out.println("Usted esta saliendo del programa, gracias por su compra.");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }while (opcion!=0);
    }
    public static void crearClientes(){
        System.out.println("Ingrese id del cliente: ");
        idClientes.add(dato.nextInt());//esta linea ingresa el cliente al arreglo
        dato.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        nombresClientes.add(dato.nextLine());//esta linea ingresa el cliente al arreglo
        System.out.println("Ingrese el telefono del cliente: ");
        telefono.add(dato.next());//esta linea ingresa el cliente al arreglo
        System.out.println("Ingrese el email del cliente: ");
        email.add(dato.next());//esta linea ingresa el cliente al arreglo
        System.out.println("Cliente Ingresado Con Exito");
        System.out.println("==========================================================");
    }
    public static void mostrarClientesIngresados(){
        System.out.println("Identificación | Nombre | Telefono | Email ");
        //este bloque iterador recorre cada arreglo y los muestra por pantalla
        for(int i=0;i<idClientes.size();i++){
            System.out.println(idClientes.get(i)+ " | "+ nombresClientes.get(i)+" | "+telefono.get(i)+" | "+email.get(i));
        }
    }
    public static void actualizarDatosClientes(){
        do{
            System.out.println("""
                            Señor usuario por favor escoger la opcion correspondiente:
                            1.Actualizar nombre
                            2.Actualizar telefono
                            3.actuaizar email
                            4.actualizar todos los datos
                            5.Eliminar cliente
                            6.salir
                            """);
            int id=0,indice=0;
            opcion= dato.nextByte();
            switch (opcion){
                case 1:
                    System.out.print("Por favor ingrese el Id del cliente a actualizar: ");
                    id= dato.nextInt();
                    indice= idClientes.indexOf(id);
                    if(indice==-1){
                        System.out.println("El Id ingresado no se encuentra en la base de datos");
                    }else {
                        for(int i=0;i<nombresClientes.size();i++){
                            if(indice==i){
                                dato.nextLine();
                                System.out.println("Ingrese el nuevo nombre.");
                                nombresClientes.set(indice,dato.nextLine());
                            }
                        }
                        System.out.println("Nombre actualizado con exito.");
                        System.out.println("=============================");
                    }
                    break;
                case 2:
                    System.out.print("Por favor ingrese el Id del cliente a actualizar: ");
                    id= dato.nextInt();
                    indice= idClientes.indexOf(id);
                    if(indice==-1){
                        System.out.println("El Id ingresado no se encuentra en la base de datos");
                    }else {
                        for(int i=0;i<telefono.size();i++){
                            if(indice==i){
                                dato.nextLine();
                                System.out.println("Ingrese el nuevo numero telefonico.");
                                telefono.set(indice,dato.nextLine());
                            }
                        }
                        System.out.println("Telefono actualizado con exito.");
                        System.out.println("================================");
                    }
                    break;
                case 3:
                    System.out.print("Por favor ingrese el Id del cliente a actualizar: ");
                    id= dato.nextInt();
                    indice= idClientes.indexOf(id);
                    if(indice==-1){
                        System.out.println("El Id ingresado no se encuentra en la base de datos");
                    }else {
                        for(int i=0;i<email.size();i++){
                            if(indice==i){
                                dato.nextLine();
                                System.out.println("Ingrese el nuevo email.");
                                email.set(indice,dato.nextLine());
                            }
                        }
                        System.out.println("Email actualizado con exito.");
                        System.out.println("============================");
                    }
                    break;
                case 4:
                    System.out.print("Por favor ingrese el Id del cliente a actualizar: ");
                    id= dato.nextInt();
                    indice= idClientes.indexOf(id);
                    if(indice==-1){
                        System.out.println("El Id ingresado no se encuentra en la base de datos");
                    }else {
                        for(int i=0;i<idClientes.size();i++){
                            if(indice==i){
                                dato.nextLine();
                                System.out.println("Ingrese el nuevo nombre.");
                                nombresClientes.set(indice,dato.nextLine());
                                System.out.println("Ingrese el nuevo telefono.");
                                telefono.set(indice,dato.nextLine());
                                System.out.println("Ingrese el nuevo email.");
                                email.set(indice,dato.nextLine());
                            }
                        }
                        System.out.println("Datos actualizados con exito.");
                        System.out.println("=============================");
                    }
                    break;
                case 5:
                    System.out.print("Por favor ingrese el Id del cliente que desea eliminar: ");
                    id= dato.nextInt();
                    indice= idClientes.indexOf(id);
                    if(indice==-1){
                        System.out.println("El Id ingresado no se encuentra en la base de datos");
                    }else {
                        for(int i=0;i<idClientes.size();i++){
                            if(indice==i){
                                idClientes.remove(i);
                                nombresClientes.remove(i);
                                telefono.remove(i);
                                email.remove(i);
                            }
                        }
                        System.out.println("Datos actualizados con exito.");
                        System.out.println("=============================");
                    }

                    break;
                case 6:
                    System.out.println("Regresando al menu principal");
                    System.out.println("=============================");
                    break;
                default:
                    System.out.println("La opcion ingresada es invalida");
                    break;
            }


        }while (opcion!=6);
    }
    public static void productos(){
        System.out.println("Sistema de inventarios");
        do{
            System.out.println("""
                                1.Mostrar articulos para le venta
                                2.Actualizar stocks
                                3.Actualizar precios
                                4.salir
                                """);
            opcion= dato.nextByte();
            int modificador=0;
            switch (opcion){
                case 1:
                   mostrarProductos();
                    break;
                case 2:
                    System.out.println("Ingrese el Id del producto que le desea actualizar el stock");
                    opcion1= dato.next();
                    System.out.println("Ingrese el nuevo valor de invetario:");
                    modificador= dato.nextInt();
                    for(int i=0;i<idProductos.length;i++){
                        if(opcion1.equals(idProductos[i])){
                            stock_invetarios[i]=modificador;
                            System.out.println("Inventario modificado con exito");
                        }

                    }
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("Ingrese el Id del producto que le desea actualizar el precio");
                    opcion1= dato.next();
                    System.out.println("Ingrese el nuevo valor del precio:");
                    modificador= dato.nextInt();
                    for(int i=0;i<idProductos.length;i++){
                        if(opcion1.equals(idProductos[i])){
                            precios[i]=modificador;
                            System.out.println("Precio modificado con exito");
                        }

                    }
                    System.out.println("==========================================");
                    break;
                case 4:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("El valor ingresado no corresponde a una de las opciones");
                    break;
            }
        }while (opcion!=4);
    }
    public static void mostrarProductos(){
        System.out.println("Id Productos            | Aticulo         | Precio         | Inventario");
        for(int i=0; i<nombreProducto.length;i++){
            System.out.println(idProductos[i]+"             "+ nombreProducto[i]+"          "+precios[i]+"          "+ stock_invetarios[i]);
        }
    }
    public static void venta(){
        System.out.println("Ingrese Id compra:");
        informacionVenta.add(dato.nextInt());
        System.out.print("Por favor ingrese un numero de identificacion para inciar" +
                "la compra: ");
        verificarid= dato.nextInt();
        informacionVenta.add(verificarid);
        informacionVenta.add(cantidadesCompradas.size());
        int indice= idClientes.indexOf(verificarid);
        do{
            System.out.println("""
                                Modulo de compras:
                                  Producto             Precio
                                1.Acople aro210        35.000     
                                2.Conector2608         8.600     
                                3.Conector2609         8.600         
                                4.Conerctor mg3946     4.000     
                                5.Acople universalB2U  30.000     
                                6.factura
                                7.salir
                                """);
            System.out.println("Ingrese la opcion del articulo o 7 para salir:");

            opcion= dato.nextByte();
            switch (opcion){
                case 1:
                    productoComprados.add(idProductos[0]);
                    if(stock_invetarios[0]!=0){
                        System.out.println("Por favor ingrese la cantidad que desea comprar:");
                        cantidad=dato.nextByte();
                        cantidadesCompradas.add(cantidad);
                        stock_invetarios[0]-=cantidad;
                        System.out.println("Actualmente quedan "+stock_invetarios[0]+" articulos" +
                                "para la venta.");
                        subtotales.add(cantidad*precios[0]);

                        System.out.println("====================================================");
                    }else {
                        System.out.println("Articulo agotado");
                    }
                    break;
                case 2:
                    productoComprados.add(idProductos[1]);
                    if(stock_invetarios[1]!=0) {
                        System.out.println("Por favor ingrese la cantidad que desea comprar:");
                        cantidad = dato.nextByte();
                        cantidadesCompradas.add(cantidad);
                        stock_invetarios[1] -= cantidad;
                        System.out.println("Actualmente quedan " + stock_invetarios[1] + " articulos" +
                                "para la venta.");
                        subtotales.add(cantidad*precios[1]);
                        System.out.println("====================================================");
                    }else {
                        System.out.println("Articulo agotado");
                    }
                    break;
                case 3:
                    productoComprados.add(idProductos[2]);
                    if(stock_invetarios[2]!=0) {
                        System.out.println("Por favor ingrese la cantidad que desea comprar:");
                        cantidad = dato.nextByte();
                        stock_invetarios[2] -= cantidad;
                        System.out.println("Actualmente quedan " + stock_invetarios[2] + " articulos" +
                                "para la venta.");
                        subtotales.add(cantidad*precios[2]);
                        System.out.println("====================================================");
                    }else {
                        System.out.println("Articulo agotado");
                    }
                    break;
                case 4:
                    productoComprados.add(idProductos[3]);
                    if(stock_invetarios[3]!=0) {
                        System.out.println("Por favor ingrese la cantidad que desea comprar:");
                        cantidad = dato.nextByte();
                        stock_invetarios[3] -= cantidad;
                        System.out.println("Actualmente quedan " + stock_invetarios[3] + " articulos" +
                                "para la venta.");
                        subtotales.add(cantidad*precios[3]);
                        System.out.println("====================================================");
                    }else {
                        System.out.println("Articulo agotado");
                    }
                    break;
                case 5:
                    productoComprados.add(idProductos[4]);
                    if(stock_invetarios[4]!=0) {
                        System.out.println("Por favor ingrese la cantidad que desea comprar:");
                        cantidad = dato.nextByte();
                        stock_invetarios[4] -= cantidad;
                        System.out.println("Actualmente quedan " + stock_invetarios[4] + " articulos" +
                                "para la venta.");
                        subtotales.add(cantidad*precios[4]);
                        System.out.println("====================================================");
                    }else{
                        System.out.println("Articulo agotado");
                    }
                    break;
                case 6:
                    System.out.println("==========================================================");
                    for(int i=0;i<idClientes.size();i++){
                        if(indice == i){
                            System.out.println("Cliente: "+ nombresClientes.get(i) );
                        }
                    }
                    System.out.println("Productos facturados");

                    for(int i=0;i<productoComprados.size();i++){
                        System.out.println(productoComprados.get(i));

                    }
                    System.out.println("subtotales productos");
                    for(int i=0;i<subtotales.size();i++){
                        System.out.println(subtotales.get(i));
                        acum+=subtotales.get(i);
                    }
                    System.out.println("Valor total compra:");
                    System.out.println(acum);
                    informacionVenta.add(acum);

                    break;
                case 7:
                    System.out.println("Gracias por su compra, lo esperamos de nuevo. Rregresando al menu" +
                            "principal");

                    break;
                default:
                    System.out.println("La opcion ingresadsa es invalida");
                    break;
            }

        }while ( opcion!=7);
    }
}

