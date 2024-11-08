import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Questao {
    public static void main(String [] args) throws InterruptedException {

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
        System.out.println("Vamos começar!!");

        Thread.sleep(2000);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("             Tema do Quiz");
        System.out.println("               |Animais|");
        System.out.println("-----------------------------------------");
        System.out.println();

        Thread.sleep(3000);

        System.out.println("Por favor escreva com as letras maiúsculas!! 'Caps Lock'");
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

        int pontos = 0;
        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas.get(i));
            System.out.println(alternativas.get(i));
            System.out.print("Escolha a opção: ");
            String resposaUsuario = scanner.nextLine().toLowerCase();

            if (resposaUsuario.equalsIgnoreCase(respostacerta.get(i))) {
                System.out.println("Resposta Certa!!");
                pontos++;
            } else {
                System.out.println("Resposta errada!!");
                System.out.println("Á resposta certa é: " + respostacerta.get(i));
            }
            System.out.println();
        }
        Thread.sleep(1000);

        System.out.println("Acabou as perguntas, espere o resultado.");
        System.out.println();

        Thread.sleep(3000);

        if ( pontos == 15){
            System.out.println("Parabéns, vc acertou todas as 15° perguntas.");
        } else if (pontos >= 10){
            System.out.println("Vc sé saiu muito bem :)");
        } else if (pontos >= 5){
            System.out.println("Poderia ser bem melhor, mais fazer oque né");
        } else {
            System.out.println("Vc só acertou " + pontos + "    perguntas, tenta de novo ou estude mais");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        Thread.sleep(2000);

        System.out.println();
        System.out.println("Pontual final: " + pontos + " de 15 perguntas.");

        Thread.sleep(1000);
        scanner.close();
    }
}