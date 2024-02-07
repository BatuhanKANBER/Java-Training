package Examps.Examp15_SporProgramı;

public class Main {
    public static void main(String[] args) {
        Person batuhan = new Person("Batuhan KANBER", 95, true);
        Person ali = new Person("Ali Veli", 65, false);

        Exercise exercise = new Exercise();
        exercise.make(ali);
        exercise.make(batuhan);
    }
}
