package anatomia_das_classes;

public class NomeCompleto {

    public static String nomeCompleto (String primeiroNome , String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static void main(String[] args) {

        String primeiroNome = "João Pedro";
        String segundoNome = "Cassiano";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

}
