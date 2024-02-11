package Examps.Examp28_KullanıcıKayıtSenaryosu;

public class User {
    private String name;
    private int age;
    private boolean isTurk;

    public User(String name, int age, boolean isTurk) {
        this.name = name;
        this.age = age;
        this.isTurk = isTurk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTurk() {
        return isTurk;
    }

    public void setTurk(boolean turk) {
        isTurk = turk;
    }
}
