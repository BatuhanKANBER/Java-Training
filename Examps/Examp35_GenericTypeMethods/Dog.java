package Examps.Examp35_GenericTypeMethods;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + ": HAV HAV HAV...";
    }
}
