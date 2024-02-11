package Examps.Examp28_KullanıcıKayıtSenaryosu;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Batuhan KANBER", 22, true);
        User user2 = new User("LeBron James", 39, false);

        SignUpManager signUpManager1 = new SignUpManager(new AgeUserCheckService());
        SignUpManager signUpManager2 = new SignUpManager(new NationUserCheckService());

        signUpManager1.signUp(user1);
        signUpManager1.signUp(user2);
        signUpManager2.signUp(user1);
        signUpManager2.signUp(user2);
    }
}
