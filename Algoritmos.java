public class Algoritmos {
    //Metodo para saber si el numero es Par
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    //Metodo para verificar si es un numero primo
    public static boolean esNumeroPrimo(int numero) {
        //Numeros menores a 2, no son primos
        if(numero < 2){
            System.out.println("El numero " + numero + "es menor a 2");
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    //Metodo es reversa
    public static String stringEnReversa(String texto) {
        String textoReversa = "";
        for (int i = texto.length() - 1; i >= 0; i --) {
            textoReversa += texto.charAt(i);
        }
        return textoReversa;
    }

    //Metodo es Palindromo
    public static boolean esPalindromo (String texto) {
        String textoEnReversa = stringEnReversa(texto);
        return texto.equalsIgnoreCase(textoEnReversa);
    }

    //Metodo FizzBuzz

    public static void metodoFizzBuzz(int numero) {
        for(int i = 1; i<= numero; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Es numero par 6: " + esNumeroPar(6)); //True
        System.out.println("Es numero par 7: " + esNumeroPar(7)); //False

        System.out.println("Es numero primo 1: " + esNumeroPrimo(1)); //False
        System.out.println("Es numero primo 7: " + esNumeroPrimo(7)); //True
        System.out.println("Es numero primo 10: " + esNumeroPrimo(10)); //False

        System.out.println("El reversa de NUBE: " + stringEnReversa("NUBE")); //EBUN

        System.out.println("Es un palindromo: OSO " + esPalindromo("OSO"));
        System.out.println("Es un palindromo: CASA " + esPalindromo("CASA"));

        metodoFizzBuzz(15);
    }
}
