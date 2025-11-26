package OperadoresLogicos;

import java.util.Scanner;

public class ValidarPerfilUsuario {
    public static void ingresarDatos() {
        // Solicitud de datos a usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt();

        System.out.println("Ingrese el saldo de su cuenta: ");
        double saldoCuenta = scanner.nextDouble();

        System.out.println("Es usted usuario Premium? ");
        boolean esUsuarioPremium = scanner.nextBoolean();

        // Limpiar buffer
        scanner.nextLine();
        scanner.close();

        // Validación de casos de acuerdo con la información ingresada
        boolean accesoExclusivo = (edadUsuario >= 18) && (esUsuarioPremium == true);
        boolean calificaPromocion = (saldoCuenta > 1000) || (edadUsuario < 25);
        boolean perfilIncompleto = (saldoCuenta == 0) || (!nombreUsuario.equals("invitado"));
        boolean perfilActivoTotal = (perfilIncompleto == true) && (accesoExclusivo || calificaPromocion);

        // Visualización de resultados de la validación
        System.out.println("Tiene acceso exclusivo? " + accesoExclusivo);
        System.out.println("Califica para promoción? " + calificaPromocion);
        System.out.println("Tiene perfil incompleto? " + perfilIncompleto);
        System.out.println("Tiene perfil activo total? " + perfilActivoTotal);
    }
}
