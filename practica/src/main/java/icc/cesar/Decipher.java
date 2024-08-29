package icc.cesar;

public class Decipher {

    /**
     * Metodo que cifra un caracter
     * @param c caracter a cifrar
     * @param key llave de cifrado
     * @return caracter cifrado
     */
    public static char charDecipher(char c, int key){
        // TODO: Implementar
       return Constants.ALPHABET.charAt((Constants.ALPHABET.indexOf(c) - key) % Constants.ALPHABET_LENGTH);

      //  return Constants.ALPHABET.charAt((Constants.ALPHABET.indexOf(c) - key));
    }
    /**
     * Metodo que cifra un texto
     * @param text texto a cifrar
     * @param key llave de cifrado
     * @return texto cifrado
     */
    public static String decipher(String text, int key){
        /*
         * TODO: Implementar
         * 1. Crear un StringBuilder
         * 2. Recorrer cada caracter del texto
         * 3. Decifrar el caracter
         * 4. Agregar el caracter decifrado al StringBuilder
         * 5. Retornar el texto decifrado
         */

         String criptogramad = "";
         for(int i=0; i < text.length(); i++){
            criptogramad += charDecipher(text.charAt(i), key);

            
        }
        return criptogramad;
    }
    
    public static void main(String[] args) {
        //String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        for(int i =1 ; i < 9; i++){
            System.out.println("llave: "+ decipher("xjjshzjsywfitsijjqhfqjsifwntrzjxywfqtxinfx", i));
        }

        
    }
}
