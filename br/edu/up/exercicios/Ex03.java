import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nome: ");
            String nome = leitor.nextLine(); 

            System.out.println("Salário fixo");
            double salarioF = leitor.nextDouble();

            System.out.println("Total em vendas: ");
            double vendas = leitor.nextDouble();

            Salario salario = new Salario();
            salario.setSalario(salarioF, vendas);

            double salarioMes = salario.calcularSalario();
            DecimalFormat formatador = new DecimalFormat("0.00");
            String salarioFormatado = formatador.format(salarioMes);

            System.out.println("Nome: " + nome + ", salario fixo: " + salarioF + ", salario do mês: " + salarioFormatado);

            leitor.close();
        }
    }
}
