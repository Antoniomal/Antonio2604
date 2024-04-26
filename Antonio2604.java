import java.util.Scanner;

public class Antonio2604 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário de Carlos: ");
        float salarioCarlos = scanner.nextFloat();
        scanner.close();

        int mesesNecessarios = calcularMesesParaAlcancar(salarioCarlos);
        System.out.println("Serão necessários " + mesesNecessarios + " meses para que o salário de João iguale ou ultrapasse o de Carlos.");
    }

    public static int calcularMesesParaAlcancar(float salarioCarlos) {
        float salarioJoao = salarioCarlos / 3;
        float saldoCarlos = salarioCarlos;
        float saldoJoao = salarioJoao;
        float taxaCarlos = 0.02f;
        
        
        }

        return meses;
    }
}
