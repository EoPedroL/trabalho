import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Questao {
    public static void main(String[] args) throws InterruptedException {

        List<String> perguntas = new ArrayList<>();
        List<String> alternativas = new ArrayList<>();
        List<String> respostacerta = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Thread.sleep(1000);

        System.out.println();
        System.out.println("Universidade: Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: Pedro Lucas Pacheco Pessoa.");
        System.out.println("Disciplina: Algoritmos e Programação II.");
        System.out.println("Professor: Brenno Pimenta.");
        System.out.println();

        Thread.sleep(2000);

        String tipoUsuario = "";
        while (!tipoUsuario.equals("A") && !tipoUsuario.equals("P")) {
            System.out.println("Você é um aluno ou professor? (A para Aluno / P para Professor): ");

            tipoUsuario = scanner.next();
            if (tipoUsuario.length() == 1 && Character.isUpperCase(tipoUsuario.charAt(0))) {
                if (tipoUsuario.equals("A") || tipoUsuario.equals("P")) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 'A' para Aluno ou 'P' para Professor.");
                }
            } else {
                System.out.println("Por favor, digite apenas a letra maiúscula (A ou P)\n");
            }
        }

        if (tipoUsuario.equals("A")) {
            System.out.println("Você escolheu: Aluno");
        } else {
            System.out.println("Você escolheu: Professor");
        }

        System.out.println("\nPor favor, informe seu nome: ");
        String nome = scanner.nextLine();

        String curso = "";
        if (tipoUsuario.equals("A")) {
        System.out.println("\nPor favor, informe seu curso: ");
        curso = scanner.nextLine();
}

        Thread.sleep(2000);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("             Tema do Quiz");
        System.out.println("               |Animais|");
        System.out.println("-----------------------------------------");
        System.out.println();

        Thread.sleep(2000);

        int numperguntas = 0;

        while (numperguntas < 1 || numperguntas > 18) {
            System.out.println("Quantas perguntas vc quer responder? (TOTAL DE PERGUNTAS: 20");
            try {
                numperguntas = Integer.parseInt(scanner.nextLine());
                if (numperguntas < 1 || numperguntas > 20) {
                    System.out.println("A quantidade de perguntas deve ser entre 1 e 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Insira um número entre 1 e 20");
            }

        }

        System.out.println("Preparado? \nVamos lá!!!");
        System.out.println();

        Thread.sleep(2000);

        perguntas.add("Qual é o animal mais rápido do mundo?");
        alternativas.add(" A) Águia\n B) Cavalo\n C) Guepardo\n D) Tigre\n E) Falcão");
        respostacerta.add("E");

        perguntas.add("Animal aquatico que é mais inteligente?");
        alternativas.add(" A) Golfinho\n B) Baleia\n C) Lula\n D) Peixe\n E) Cavalo-Marinho");
        respostacerta.add("A");

        perguntas.add("Qual é o animal que muda de cor?");
        alternativas.add(" A) Sapo\n B) Camaleão\n C) Polvo\n D) Largato\n E) Peixe");
        respostacerta.add("B");

        perguntas.add("Animal que consegue dar um estralo que pode chegar em 4.700 °C em baixo da água?");
        alternativas.add(" A) Peixe-Bolha\n B) Tubarão-Martelo\n C) Camarão Pistola\n D) Lula-Vampira\n E) Água-Viva ");
        respostacerta.add("C");

        perguntas.add("Quantas especies de cachorros existem?");
        alternativas.add(" A) 344\n B) 25\n C) 85\n D) 510\n E) 98");
        respostacerta.add("A");

        perguntas.add("Quantos dias demora pra uma largata virar borboleta?");
        alternativas.add(" A) 5\n B) 35\n C) 120\n D) 134\n E) 105");
        respostacerta.add("C");

        perguntas.add("Animal que luta boxe?");
        alternativas.add(" A) Leão\n B) Hiena\n C) Canguru\n D) Girafa\n E) Zebra");
        respostacerta.add("C");

        perguntas.add("Qual é o menor animal do mundo?");
        alternativas.add(" A) Sapo-pulga \n B) Colibri-abelha\n C) Tartaruga Padloper\n D) Camaleão Brookesia\n E) Vaca Vechur");
        respostacerta.add("D");

        perguntas.add("Qual é o maior animal voador do mundo?");
        alternativas.add(" A) Abutre\n B) Falcão-Peregrino\n C) Urubu\n D) Águia-Americana\n E) Harpia");
        respostacerta.add("E");

        perguntas.add("Qual é o animal que denominado como rei?");
        alternativas.add(" A) Tigre\n B) Leão\n C) Rinoceronte\n D) Hipopótamo\n E) Pantera");
        respostacerta.add("B");

        perguntas.add("Qual é o animal mais próximo dos dinossauros?");
        alternativas.add(" A) Largato\n B) Dragão de Komodo\n C) Jacaré\n D) Galinha\n E) Crocodilos");
        respostacerta.add("D");

        perguntas.add("Qual é o animal que caça em bando?");
        alternativas.add(" A) Lobo\n B) Pantera\n C) Leão\n D) Onça\n E) Leopardo");
        respostacerta.add("A");

        perguntas.add("Animal que sempre cai em pé?");
        alternativas.add(" A) Cachorro\n B) Gato\n C) Leopardos\n D) Esquilo\n E) Rato");
        respostacerta.add("B");

        perguntas.add("Qual é o animal mais venenoso? ");
        alternativas.add(" A) Cobra\n B) Dragão de Komodo\n C) Aranha Armadeira\n D) Baiacu\n E) Rã-dardo");
        respostacerta.add("E");

        perguntas.add("Qual foi o animal mais pesado da história?");
        alternativas.add(" A) Baleia-Azul\n B) Megalodon\n C) Amphicoelias fragillimus\n D) Baleia-franca\n E) Argentinosaurus");
        respostacerta.add("A");

        perguntas.add("Em qual ano os dinossauros existiram?");
        alternativas.add(" A) 50 anos atrás\n B) 48 anos atrás\n C) 65 anos atrás\n D) 77 anos atrás\n E) 59 anos atrás");
        respostacerta.add("C");

        perguntas.add("Qual e o país que tem a ilhas das cobras?");
        alternativas.add(" A) Estados Unidos\n B) Austrália\n C) Russia\n D) Brasil\n E) Itália");
        respostacerta.add("D");

        perguntas.add("Oque o Boitatá é?");
        alternativas.add(" A) Gato\n B) Cobra\n C) Boi\n D) Cavalo\n E) Tatu");
        respostacerta.add("C");

        perguntas.add("Quantos coração um polvo tem? ");
        alternativas.add(" A) 5\n B) 3\n C) 4\n D) 1\n E) 2");
        respostacerta.add("B");

        perguntas.add(" Por qual parte do corpo temos como saber a diferença entre um crocodilo e um jacaré");
        alternativas.add(" A) Pelos dentes\n B) Pelos olhos\n C) Pelo focinho\n D) Pela pele\n E) Pelas patas");
        respostacerta.add("C");

        int pontos = 0;
        for (int i = 0; i < numperguntas; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas.get(i));
            System.out.println(alternativas.get(i));
            String respostaUsuario = "";
            boolean respostaCAPS = false;

            while (!respostaCAPS) {
                System.out.print("Escolha a opção: ");
                respostaUsuario = scanner.nextLine();

                if (respostaUsuario.length() == 1 && Character.isUpperCase(respostaUsuario.charAt(0))) {
                    respostaCAPS = true;
                } else {
                    System.out.println("\nPor favor, digite uma letra maiúscula (A, B, C, D ou E).\n");
                }
            }

            if (respostaUsuario.equals(respostacerta.get(i))) {
                System.out.println("Resposta Certa!!");
                pontos++;
            } else {
                System.out.println("Resposta errada!!");
                System.out.println("Á resposta certa é: " + respostacerta.get(i));
            }
            System.out.println();
        }
        Thread.sleep(1000);

        System.out.println("Vc concluiu o quiz, obrigado por jogar. \nEspere o resultado.");
        System.out.println();

        Thread.sleep(2000);

        System.out.println("Questionario final.");
        System.out.println();
        Thread.sleep(2000);


        System.out.println("-----------------------------------------");
        if (tipoUsuario.equals("P")){
            System.out.println("Nome do professor: " + nome);
        } else if (tipoUsuario.equals("A")) {
            System.out.println("Nome aluno: " + nome);
            System.out.println("Curso: " + curso);
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("");
        System.out.println("Sua pontuação foi de: " + pontos + "°" + "\nTotal de perguntas que vc respondeu: " + numperguntas);


        Thread.sleep(1000);
        scanner.close();
    }
}