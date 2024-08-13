import java.util.Scanner;

public class metodos2Ejercicio6 {
// Método para comprobar si la contraseña es segura

    public static boolean esSegura(String contraseña) {
        return tieneLongitudCorrecta(contraseña)
                && tieneMayuscula(contraseña)
                && tieneMinuscula(contraseña)
                && tieneNumero(contraseña)
                && tieneCaracterEspecial(contraseña);
    }

// Método para comprobar si la contraseña tiene al menos 8 caracteres
    public static boolean tieneLongitudCorrecta(String contraseña) {
        return contraseña.length() >= 8;
    }

// Método para comprobar si la contraseña contiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

// Método para comprobar si la contraseña contiene al menos una letra minúscula
    public static boolean tieneMinuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

// Método para comprobar si la contraseña contiene al menos un número
    public static boolean tieneNumero(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

// Método para comprobar si la contraseña contiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String contraseña) {
        String caracteresEspeciales = "!@#$%^&*()_+-={}:<>?,./";
        for (char c : contraseña.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        try (// Solicitar al usuario que ingrese una contraseña
        Scanner scanner = new java.util.Scanner(System.in)) {
          System.out.print("Ingrese una contraseña: ");
          String contraseña = scanner.nextLine();
          // Verificar si la contraseña es segura
          if (esSegura(contraseña)) {
              System.out.println("La contraseña es segura.");
          } else {
              System.out.println("La contraseña no es segura.");
          }
        }
    }
}
