import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        // Leitura dos parâmetros
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //exibir a mensagem de erro caso os parâmetros são inválidos
            System.out.println(" O segundo paramêtro deve ser maior que o primeiro! : ");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException(); //lançar a exceção caso os parâmetros são inválidos



        int contagem = parametroDois - parametroUm;
        System.out.println("Sequência realizada com sucesso");
        for (int i = 1; i <= contagem; i++) {

            System.out.println(" -----> : "+ i);

        }

    }

}