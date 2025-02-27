public class Player {
    public int pontos;
    Carta monteCarta[] = new Carta[10];

    public Player() {
        this.pontos = 0;

        for (int i = 0; i < monteCarta.length; i++) {
            Carta carta = new Carta();
            monteCarta[i] = carta;
        }
    }

    public void exibirMonte(){
        for (int i = 0; i < monteCarta.length; i++) {
            monteCarta[i].exibirCarta();
        }
    }
}
