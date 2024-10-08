import java.util.Scanner;

class littleCalculo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("insira a conta");
        char operacao = scanner.next().charAt(0);

        int resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':


                if (numero2 != 0) {
                    double resultadoDivisao = (double) numero1 / numero2;
                    System.out.println("Resultado: " + resultadoDivisao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }


        scanner.close();
    }

}
