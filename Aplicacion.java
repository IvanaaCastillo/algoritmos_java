public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Es numero par 6: " + Numero.esNumeroPar(6));
        System.out.println("Es numero par 7: " + Numero.esNumeroPar(7));

        System.out.println("Es numero primo 1: " + Numero.esNumeroPrimo(1));
        System.out.println("Es numero primo 7: " + Numero.esNumeroPrimo(7));
        System.out.println("Es numero primo 10: " + Numero.esNumeroPrimo(10));

        System.out.println("El reversa de NUBE: " + Cadena.stringEnReversa("NUBE"));

        System.out.println("Es un palindromo: OSO " + Cadena.esPalindromo("OSO"));
        System.out.println("Es un palindromo: CASA " + Cadena.esPalindromo("CASA"));

        FizzBuzz.metodoFizzBuzz(15);
    }
}
