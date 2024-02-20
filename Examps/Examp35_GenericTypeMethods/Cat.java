package Examps.Examp35_GenericTypeMethods;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + ": MİYAV MİYAV MİYAV...";
    }
}
