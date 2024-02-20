package Examps.Examp34_GenericTypeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer a = 28;
        String b = "28";
        Helper helper = new Helper();

        System.out.println(helper.getType(a));
        System.out.println(helper.getType(helper.convert(a)));

        System.out.println(helper.getType(b));
        System.out.println(helper.getType(helper.reverse(b)));

        System.out.println("*************************************");

        Integer[] iArray1 = {1,2,3};
        Integer[] iArray2 = {4,5,6};
        String[] sArray1 = {"a","b","c"};
        String[] sArray2 = {"d","e","f"};

        List<Integer> iList1 = new ArrayList<>();
        List<Integer> iList2 = new ArrayList<>();
        helper.addToList1(iArray1, iList1);
        helper.addToList2(iArray2, iList2);

        List<String> sList1 = new ArrayList<>();
        List<String> sList2 = new ArrayList<>();
        helper.addToList1(sArray1, sList1);
        helper.addToList2(sArray2, sList2);

        helper.showList(iList1);
        helper.showList(iList2);
        helper.showList(sList1);
        helper.showList(sList2);
    }
}
