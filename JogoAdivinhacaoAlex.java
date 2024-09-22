import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoAlex {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        Scanner lerTeclado = new Scanner(System.in);
        
        int numeroEscolhido = numeroAleatorio.nextInt(100) + 1;
        int tentativas = 0;
        int limiteTentativas = 10;
        boolean acertou = false;

        System.out.println("Bem vindo ao jogo de adivinhação Alex Gonçalves!!!");
        System.out.println("Procure adivinhar o número entre 1 e 100.");
        System.out.println("Você tem " + limiteTentativas + " tentativas.");

        while (!acertou && tentativas < limiteTentativas) {
            System.out.print("Digite o seu palpite: ");
            int palpite = lerTeclado.nextInt();
            tentativas++;

            if (palpite < numeroEscolhido) {
                System.out.println("O número escolhido é maior!! Tente um mais alto.");
            } else if (palpite > numeroEscolhido) {
                System.out.println("O número escolhido é menor!! Tente um mais baixo.");
            } else {
                acertou = true; 
            }
        }

        if (acertou) {
            System.out.println("Parabéns! Você adivinhou o número " + numeroEscolhido + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você esgotou suas tentativas. O número era " + numeroEscolhido + ".");
        }

        System.out.println("Obrigado por jogar!!!\nFeito por Alex Gonçalves RA:1136919.");
    }
}
