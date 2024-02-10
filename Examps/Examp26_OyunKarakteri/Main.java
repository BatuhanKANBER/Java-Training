package Examps.Examp26_OyunKarakteri;

public class Main {
    public static void main(String[] args) {
        Kratos kratos = new Kratos("Kratos", 1000, 100, "Büyük, beyaz tenli ve kırmızı dövmeli.");
        Atreus atreus = new Atreus("Atreus", 100, 10, "Ergen.");

        kratos.showInfo();
        atreus.showInfo();
    }
}
