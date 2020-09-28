import java.util.*;

public class TecladoRoto {

    public static void brokenKb(String s) {
        LinkedList<String> texto = new LinkedList<>();
        boolean Final = true;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                if (Final) {
                    texto.addLast(s.substring(k,i));
                } else {
                    texto.addFirst(s.substring(k,i));
                }

                k = i + 1;
                Final = false;
            }
            if (s.charAt(i) == ']') {
                if (Final) {
                    texto.addLast(s.substring(k,i));
                } else {
                    texto.addFirst(s.substring(k,i));
                }

                k = i + 1;
                Final = true;
            }
        }
        if (Final) {
            texto.addLast(s.substring(k));
        } else {
            texto.addFirst(s.substring(k));
        }
        String textoFinal= "";
        for (String a: texto) {
            textoFinal+= a;
        }
        System.out.println(textoFinal);
    }
}
