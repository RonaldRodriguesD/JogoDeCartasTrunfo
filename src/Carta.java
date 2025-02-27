import java.util.Random;

public class Carta {
    public int forca;
    public int inteligencia;
    public int defesa;
    public int fadiga;

    public Carta() {
        Random nm_aleatorio = new Random();
        this.forca = nm_aleatorio.nextInt(100);
        this.inteligencia = nm_aleatorio.nextInt(100);
        this.defesa = nm_aleatorio.nextInt(100);
        this.fadiga = nm_aleatorio.nextInt(100);
    }

    public void exibirCarta() {
        System.out.println("-------- CARTA --------");
        System.out.println("1 - Forca:..........." + forca);
        System.out.println("2 - Inteligencia:...." + inteligencia);
        System.out.println("3 - Defesa:.........." + defesa);
        System.out.println("4 - Fadiga:.........." + fadiga);
        System.out.println("-----------------------");
    }
}
