package Examps.Examp20_Futbolcular;

import java.util.ArrayList;

public class FootballPlayers {
    private ArrayList<String> footballPlayers = new ArrayList<String>();

    public void showPlayers(){
        System.out.println("\nListede " + footballPlayers.size() + " adet futbolcu bulunuyor.\n");
        for (int i = 0; i < footballPlayers.size(); i++){
            System.out.println((i+1) + ". futbolcu: " + footballPlayers.get(i));
        }
    }
    public void addPlayer(String name){
        footballPlayers.add(name);
        System.out.println("\n" + name + " isimli futbolcu eklendi.\n");
    }
    public void updatePlayer(int index, String name){
        if (footballPlayers.size() < index){
            System.out.println("Böyle bir index bulunmuyor.");
        }else {
            footballPlayers.set(index, name);
            System.out.println("\n" + index + " numaralı index " + footballPlayers.get(index) + " isimli futbolcu olarak güncellendi.\n");
        }
    }
    public void removePlayer(int index){
        if (footballPlayers.size() < index){
            System.out.println("Böyle bir index bulunmuyor.");
        }else {
            String name = footballPlayers.get(index);
            footballPlayers.remove(index);
            System.out.println("\n" + name + " isimli futbolcu listeden kaldırıldı.\n");
        }
    }
}
