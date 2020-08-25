//Punto 1.1

  // Este metodo sirve para ingresar los datos para ver cual es la subsecuencia
    // mas larga
    public static int SubSec1(String Sec1, String Sec2) {
        return SubSec(Sec1.length(), Sec2.length(), Sec1, Sec2);
    }

    public static int SubSec(int a, int b, String Sec1, String Sec2) {
        if (a == 0 || b == 0)
            return 0;
        if (Sec1.charAt(a - 1) == Sec2.charAt(b - 1))
            return 1 + SubSec(a - 1, b - 1, Sec1, Sec2);
        return Math.max(SubSec(a, b - 1, Sec1, Sec2), SubSec(a - 1, b, Sec1, Sec2));
    }
}



//Punto 1.2
public class subSecuencia {
public static int Calcular(int altura) {
        if (altura <= 2)
            return altura;
        return 1+ Calcular(altura-1);
    }
}
}
