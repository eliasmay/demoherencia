/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia.DemoHerencia;

import java.util.Scanner;

/**
 *
 * @author EliasAlejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Proporcione el numero de la cuenta:");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcione el nombre del cliente:");
        String nombreDelCliente = entrada.nextLine();
        nombreDelCliente = entrada.nextLine();
        System.out.println("Proporcione el apellido del cliente:");
        String apellidoDelCliente = entrada.nextLine();
        System.out.println("Proporcione la fecha de nacimiento:");
        String fechaDeNacimeintoDelCliente = entrada.nextLine();
        System.out.println("Proporcione la direccion del cliente:");
        String direccionDelCliente = entrada.nextLine();
        System.out.println("Proporcione la ocupacion del cliente:");
        String ocupacionDelCliente = entrada.nextLine();
        System.out.println("Proporcione el telefono del cliente:");
        String telefonoDelCliente = entrada.nextLine();
        System.out.println("Proporcione el correo electronico del cliente:");
        String emailDelCliente = entrada.nextLine();
        
        Cliente cliente = new Cliente (nombreDelCliente, apellidoDelCliente);
 
        System.out.println("El numero de cuenta es: " + numeroDeCuenta);
        System.out.println("El nombre del cliente es: " + nombreDelCliente);
        System.out.println("El apellido del cliente es: " + apellidoDelCliente);
        System.out.println("La fecha de nacimiento del cliente es: " + fechaDeNacimeintoDelCliente);
        System.out.println("La direccion del cliente es: " + direccionDelCliente);
        System.out.println("La ocupacion del cliente es: " + ocupacionDelCliente);
        System.out.println("El telefono del cliente es: " + telefonoDelCliente);
        System.out.println("El correo electronico del cliente es: " + emailDelCliente);
        }
}    