package operadores;

public class Operadores4 {
    public static void main(String[] args) {
        int a, b;
        String resultado = "";
        a=5;
        b=6;

        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        a=5;
        b=5;
        String resultado2 = a==b ?"verdadeiro":"falso";
        System.out.println(resultado2);
    }
}
