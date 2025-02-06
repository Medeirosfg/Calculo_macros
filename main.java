
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Qual a sua idade: ");
        int idade = Integer.parseInt(scan.nextLine());

        System.out.print("Qual a sua altura em cm: ");
        double altura = Double.parseDouble(scan.nextLine());

        System.out.print("Qual o seu peso: ");
        double peso = Double.parseDouble(scan.nextLine()); 

        System.out.print("Sexo M ou F: ");
        String sexo = scan.nextLine();


        if (sexo.equalsIgnoreCase("m") ) {
            System.out.println("\n##Sua taxa de metabolismo basal e : " + basalM(peso, altura, idade) + " Kcal/dia");


        } else if (sexo.equalsIgnoreCase("f")) {
            System.out.println("\n##Sua taxa de metabolismo basal e: " + basalF(peso, altura, idade) + " Kcal/dia");
        } else {
            System.out.println("OPCAO INVALIDA");
        }

        System.out.println("\nQual o seu principal objetivo? ");
        while (true) {
            exibirMenu();

            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                System.out.println("\nOtimo, vamos para os calculos dos macros diarios para se encaixar no seu objetivo.");
                System.out.println("Para que voce consiga fazer uma fase de emagrecimento (cutting), sera necessario cortar um pouco os carboidratos, vamos manter a quantidade de proteinas, e controlar a ingestao de gorduras.");
                System.out.println("Oriento para que seus macros fiquem da seguinte forma: ");
                System.out.println("\nProteinas entre: " + peso*1.8 + " e " + peso*2.1);
                System.out.println("Carboidratos entre: " + peso*2 + " e " + peso*2.2);
                System.out.println("Gorduras nao mais que: " + peso*1.3);
                System.out.println("\n Nada melhor que uma boa observacao durante os treinos.");
                System.out.println("Se sentir muita fraqueza ou cansaco, pode-se ingerir um pouco mais de carboidratos. Manter sempre a ingestao de carboidratos limpos como: Arroz, Batata doce, Batata inglesa, etc");
                    
                    break;
                
                case 2:
                System.out.println("\nVamos manter seu peso de forma saudavel");

                    break;

                case 3: 
                System.out.println("\nVamos ficar monstros");
                
                    break;

                case 4:
                System.out.println("\nBoa sorte com seus objetivos");
                System.exit(0);
                    break;
            }
        }
       

       
    }

        public static double basalM(double peso, double altura, int idade) {
            double resultado = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.75 * idade);
            return Math.round(resultado *100)/100;
        }

        public static double basalF(double peso, double altura, int idade){
            double resultado = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
            return Math.round(resultado *100)/100;
        }

        public static void exibirMenu(){
            System.out.println("\n1 - Cutting.");
            System.out.println("2 - Manutenção.");
            System.out.println("3 - Bulking.");
            System.out.println("4 - Sair.");
        }
    
}