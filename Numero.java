public class Numero {
    //Numero par
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

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
}
