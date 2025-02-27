import java.util.Scanner;

public class Batalha {

    public void exibirPlacar(Player play1, Player play2){
        System.out.println("=====================");
        System.out.println("= Play1 " + play1.pontos + " X " + play2.pontos + " Play2 =");
        System.out.println("=====================");
    }

    public void iniciarBatalha(Player play1, Player play2) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        for (int i = 0; i <= 9; i++) {
            exibirPlacar(play1, play2);
            if(i % 2 == 0) {
                System.out.println("////////////");
                System.out.println("/ Rodada " + (i + 1) + " /");
                System.out.println("////////////");
                play1.monteCarta[i].exibirCarta();
                System.out.println("Player 1 joga!");
                System.out.println("Escolha um atributo: ");
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        if (play1.monteCarta[i].forca > play2.monteCarta[i].forca) {
                            play1.pontos++;
                            System.out.println("Parabéns, você ganhou!!!");
                        } else if (play1.monteCarta[i].forca == play2.monteCarta[i].forca) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play2.pontos++;
                            System.out.println("Você perdeu, boa sorte na próxima!!!");
                        }
                        break;
                    case 2:
                        if (play1.monteCarta[i].inteligencia > play2.monteCarta[i].inteligencia) {
                            play1.pontos++;
                            System.out.println("Parabéns, você ganhou!!!");
                        } else if (play1.monteCarta[i].inteligencia == play2.monteCarta[i].inteligencia) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play2.pontos++;
                            System.out.println("Você perdeu, boa sorte na próxima!!!");
                        }
                        break;
                    case 3:
                        if (play1.monteCarta[i].defesa > play2.monteCarta[i].defesa) {
                            play1.pontos++;
                            System.out.println("Parabéns, você ganhou!!!");
                        } else if (play1.monteCarta[i].defesa == play2.monteCarta[i].defesa) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play2.pontos++;
                            System.out.println("Você perdeu, boa sorte na próxima!!!");
                        }
                        break;
                    case 4:
                        if (play1.monteCarta[i].fadiga < play2.monteCarta[i].fadiga) {
                            play1.pontos++;
                            System.out.println("Parabéns, você ganhou!!!");
                        } else if (play1.monteCarta[i].fadiga == play2.monteCarta[i].fadiga) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play2.pontos++;
                            System.out.println("Você perdeu, boa sorte na próxima!!!");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                }
            } else {
                System.out.println("////////////");
                System.out.println("/ Rodada " + (i + 1) + " /");
                System.out.println("////////////");
                System.out.println("Player 2 joga!");
                System.out.println("Sua carta: ");
                play1.monteCarta[i].exibirCarta();
                System.out.println("========================");
                System.out.println("Carta do Player 2: ");
                play2.monteCarta[i].exibirCarta();
                int diferencaForca = Math.abs(100 - play2.monteCarta[i].forca);
                int diferencaInteligencia = Math.abs(100 - play2.monteCarta[i].inteligencia);
                int diferencaDefesa = Math.abs(100 - play2.monteCarta[i].defesa);
                int diferencaFadiga = Math.abs(0 - play2.monteCarta[i].fadiga);

                int menorDiferenca = diferencaForca;
                int escolha = 1;

                if(diferencaInteligencia < menorDiferenca){
                    menorDiferenca = diferencaInteligencia;
                    escolha = 2;
                }
                if(diferencaDefesa < menorDiferenca){
                    menorDiferenca = diferencaDefesa;
                    escolha = 3;
                }
                if(diferencaFadiga < menorDiferenca){
                    menorDiferenca = diferencaFadiga;
                    escolha = 4;
                }

                System.out.println("O player2 escolheu o atributo " + escolha);

                switch (escolha){
                    case 1:
                        if (play2.monteCarta[i].forca > play1.monteCarta[i].forca) {
                            play2.pontos++;
                            System.out.println("Player 2 ganhou!!!");
                        } else if (play2.monteCarta[i].forca == play1.monteCarta[i].forca) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play1.pontos++;
                            System.out.println("Player 2 perdeu!!!");
                        }
                        break;
                    case 2:
                        if (play2.monteCarta[i].inteligencia > play1.monteCarta[i].inteligencia) {
                            play2.pontos++;
                            System.out.println("Player 2 ganhou!!!");
                        } else if (play2.monteCarta[i].inteligencia == play1.monteCarta[i].inteligencia) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play1.pontos++;
                            System.out.println("Player 2 perdeu!!!");
                        }
                        break;
                    case 3:
                        if (play2.monteCarta[i].defesa > play1.monteCarta[i].defesa) {
                            play2.pontos++;
                            System.out.println("Player 2 ganhou!!!");
                        } else if (play2.monteCarta[i].defesa == play1.monteCarta[i].defesa) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play1.pontos++;
                            System.out.println("Player 2 perdeu!!!");
                        }
                        break;
                    case 4:
                        if (play2.monteCarta[i].fadiga < play1.monteCarta[i].fadiga) {
                            play2.pontos++;
                            System.out.println("Player 2 ganhou!!!");
                        } else if (play2.monteCarta[i].fadiga == play1.monteCarta[i].fadiga) {
                            System.out.println("Empate, nenhum jogador pontuou!!!");
                        } else {
                            play1.pontos++;
                            System.out.println("Player 2 perdeu!!!");
                        }
                        break;
                    default:
                        System.out.println("ERROR!!!");
                }
            }
        }
        exibirPlacar(play1, play2);
        if (play1.pontos > play2.pontos) {
            System.out.println("======== BOOYAH ========");
        } else if (play1.pontos == play2.pontos) {
            System.out.println("======== EMPATE ========");
        } else {
            System.out.println("====== GAME OVER ======");
        }
    }
}
