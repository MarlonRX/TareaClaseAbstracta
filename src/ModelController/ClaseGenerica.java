package ModelController;

import ModelController.ArrayList;
import java.util.Scanner;

public class ClaseGenerica {

    public static void main(String[] args) {
        
        ArrayList datos = new ArrayList(4);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombre :");
        String nombre = sc.nextLine();
        
        System.out.println("Por favor ingrese su edad :");        
        int edad = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Estos son su nombre y su edad : " + nombre + ", " + edad);
        
        System.out.println("Ingrese su EPS :");
        String eps = sc.nextLine();
        
        System.out.println("Ingrese su fecha de nacimiento");
        String fecha = sc.nextLine();
        
        System.out.println("Estos son su fecha de nacimiento y su EPS : " + fecha + ", " + eps);
        
        Pair<String, Integer> name_age = new Pair<>(nombre, edad);
        Pair<String, String> eps_date = new Pair<>(fecha, eps);
        
        Persona usuario = new Persona(name_age.getFirst(), name_age.getSecond(), eps_date.getFirst(), eps_date.getSecond());
        
        datos.add(usuario);
        
        System.out.println("Usuario registrado Correctamente");
        
        Persona usuarioList = (Persona) datos.get(0);
        
        System.out.println("Nombre : " + usuarioList.getNombre());
        System.out.println("Edad : " + usuarioList.getEdad());
        System.out.println("Fecha de Nacimiento : " + usuarioList.getFecha());
        System.out.println("EPS : " + usuarioList.getEps());
    }
}
