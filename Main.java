import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senhaCorreta = "admin123"; // Defina aqui a senha correta
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("Digite a senha:");
            String senha = input.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso permitido.");
                return;
            } else {
                tentativasRestantes--;
                System.out.println("Senha incorreta! Tentativas restantes: " + tentativasRestantes);
            }
        }

        System.out.println("Você excedeu o número máximo de tentativas permitidas. Tente novamente mais tarde.");
    }

}