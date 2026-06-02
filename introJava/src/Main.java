import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Cadastro pet1 = new Cadastro("Rex", "Cachorro", 5, true);
        boolean running = true;
        while (running) {
            System.out.println("===ola seja bem vindo ao sistema de lavagem de pets===");
            System.out.println("1 - cadastre seu pet");
            System.out.println("2 - Lave o pet.");
            System.out.println("3 - limpar a maquina");
            System.out.println("4 - verificar niveis da maquina");
            System.out.println("5 - adicionar agua");
            System.out.println("6 - adicionar shampoo");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("0 - sair");
            var userInput = scanner.nextInt();
            System.out.println("Voce escolheu a opcao: " + userInput);

            switch (userInput) {
                case 1 -> System.out.println("O pet " + pet1.nome + " foi cadastrado com sucesso.");
                case 2 -> washMachine.washPet();
                case 3 -> washMachine.clearMachine();
                case 4 -> washMachine.verifyMachineLevels();
                case 5 -> washMachine.addWater();
                case 6 -> washMachine.addShampoo();
                case 7 -> washMachine.loadPet(pet1);
                case 0 -> {
                    System.out.println("Encerrando o programa...");
                    running = false;
                }
            }
        }
    scanner.close();
    }
}
