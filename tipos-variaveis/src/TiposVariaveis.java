import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nome = "Bruno";
        int idade = 34;
        double peso = 120.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);

        //operadores.java

        double soma = 10.5 + 15.7;
        int multiplicao = 50 * 30;
        double resultado = soma + multiplicao;

        System.out.println(soma);
        System.out.println(multiplicao);
        System.out.println(resultado);

        //concatenação
        String nomeCompleto = "Bruno" + "Xavier";
        String primeiroNome = "Antonela";
        String segundoNome = "Xavier";
        String resultadoFinal = primeiroNome + segundoNome;

        System.out.println(nomeCompleto);
        System.out.println(resultadoFinal);
        System.out.println(segundoNome);

        
    }
}
