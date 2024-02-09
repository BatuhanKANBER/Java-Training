package Examps;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//LinkedListlerle ilk örnek
public class Examp23 {
    private static Scanner input = new Scanner(System.in);
    public static void operations(){
        System.out.println("ŞEHİRLERİ LİSTELEMEK İÇİN - 1");
        System.out.println("SONRAKİ ŞEHİR İÇİN - 2");
        System.out.println("ÖNCEKİ ŞEHİR İÇİN - 3");
        System.out.println("ŞEHİR EKLEMEK İÇİN - 4");
        System.out.println("ÇIKIŞ - 5");
    }

//    public static void addCity(LinkedList<String> cities){
//        ListIterator<String> iterator = cities.listIterator();
//        System.out.print("Eklemek istediğiniz şehir: ");
//        String city = input.nextLine();
//    }

    public static void showCities(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();
        int count = 1;

        while (iterator.hasNext()){
            System.out.println(count + ". Şehir: " + iterator.next());
            count++;
        }
    }

    public static void visitToCities(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();
        int operation;
        boolean quit = false;
        boolean previous = true;

        if (!iterator.hasNext()){
            System.out.println("Listede şehir bulunmuyor.");
        }else {
            do {
                operations();
                operation = input.nextInt();

                switch (operation){
                    case 1:
                        showCities(cities);
                        break;
                    case 2:
                        if (!previous){
                            if (iterator.hasNext()){
                                iterator.next();
                                previous = true;
                            }
                        }else {
                            if (iterator.hasNext()){
                                System.out.println("Gidilen şehir: " + iterator.next());
                            }else {
                                System.out.println("Bu şehirden sonra şehir bulunmuyor.");
                                previous = false;
                            }
                        }
                        break;
                    case 3:
                        if (previous){
                            if (iterator.hasPrevious()){
                                iterator.previous();
                                previous = false;
                            }
                        }else {
                            if (iterator.hasPrevious()){
                                System.out.println("Gidilen şehir: " + iterator.previous());
                            }else {
                                System.out.println("Bu şehirden önce şehir bulunmuyor.");
                                previous = true;
                            }
                        }
                        break;
                    case 4:
                        input.nextLine();//dummy input
                        System.out.print("Eklemek istediğiniz şehir: ");
                        String city = input.nextLine();
                        iterator.add(city);
                        break;
                    case 5:
                        quit = true;
                        break;
                    default:
                        System.out.println("Hatalı işlem!");
                        break;
                }
            }while (!quit);
        }

    }
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");

        visitToCities(cities);
    }
}
