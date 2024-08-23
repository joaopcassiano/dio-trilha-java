package tipos_e_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        String meuNome = "João Pedro";

        System.out.println(meuNome);

        double salarioMinimo = 2500; // forma correta de escrever milhares, se colocar 2.500 o ponto representa 2,5

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println("O salário mínimo é: " + salarioMinimo);

        int numero = 5;

        numero = 10; // valor foi alterado por conta que na variavel inicial não está definido como FINAL

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // mesmo a escrita em caixa alta sinalizando que o valor não poderá alterado, o indicado é colocar FINAL para esse intuito

        //VALOR_DE_PI = 10.75; // o código estara errado por quee o VALOR_DE_PI não pode ser alterado.

        System.out.println(VALOR_DE_PI);

    }
}
