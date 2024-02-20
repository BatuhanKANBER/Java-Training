package Examps.Examp34_GenericTypeInterface;

public interface Converter <E1,E2>{
    E1 convert(E2 value);
    E2 reverse(E1 value);
}
