package Examps.Examp33_Balondor;

import Examps.Examp20_Futbolcular.FootballPlayers;

public class FootballPlayer {
    private String name;
    private String team;
    private int goals;
    private int assists;

    public FootballPlayer(String name, String team, int goals, int assits){
        this.name = name;
        this.team = team;
        this.goals = goals;
        this.assists = assits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void showInfo(){
        System.out.println("Adı: " + name + "\nTakımı: " + team + "\nGol Sayısı: " + goals + "\nAsist Sayısı: " + assists);
    }

    public int calculateContribution(){
        return (int) (getGoals() * 1.2 + getAssists() * 0.8);
    }
}
