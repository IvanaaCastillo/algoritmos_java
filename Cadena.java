public class Cadena {
    public static String stringEnReversa(String texto) {
        String textoReversa = "";
        for (int i = texto.length() - 1; i >= 0; i --) {
            textoReversa += texto.charAt(i);
        }
        return textoReversa;
    }

    public static boolean esPalindromo (String texto) {
        String textoEnReversa = stringEnReversa(texto);
        return texto.equalsIgnoreCase(textoEnReversa);
    }

}
