package com.company;

public class Main {

    public static void main(String[] args) {
        /*

        Przyklad pierwszy = new Przyklad();
        pierwszy.wypisz();

        Przyklad drugi = new Przyklad(10);
        drugi.wypisz();
    }
}

class Przyklad{
    private int wartosc;

    public void wypisz(){
        System.out.println(wartosc);
    }

    Przyklad(){
        wartosc = 19;
    }

    Przyklad(int n){
        wartosc = n;



    }
}

*/

        /*
        PrzykladDwa c1, c2, c3;

        c1 = new PrzykladDwa();
        c2 = new PrzykladDwa(10);
        c3 = new PrzykladDwa(50, 4.5);

        c1.wypisz();
        c2.wypisz();
        c3.wypisz();
    }
}

class PrzykladDwa{
    private double prawdziwy;
    private double wyimaginowany;

    public void wypisz(){
        System.out.println(prawdziwy + " +i " + wyimaginowany);
    }

    PrzykladDwa(){
        prawdziwy = wyimaginowany = 0;
    }

    PrzykladDwa(double r){
        prawdziwy = r;
        wyimaginowany = 0;
    }

    PrzykladDwa(double r, double i){
        prawdziwy = r;
        wyimaginowany = i;
    }
}

         */

        /*
        Zadanie10 zadanie101 = new Zadanie10(8,8);
            System.out.println(zadanie101.wykonajOperacjeMatematycznaDodawanie());
            System.out.println(zadanie101.wykonajOperacjeMatematycznaDodawanie(-1));

            Zadanie10 zadanie102 = new Zadanie10();
            System.out.println(zadanie102.wykonajOperacjeMatematycznaMnozenie(1,1));
            System.out.println(zadanie102.wykonajOperacjeMatematycznaDodawanie(7));
    }
}

class Zadanie10{
    int a,b;

    Zadanie10(){

    }

    Zadanie10(int a){
        this.a = a;
    }

    Zadanie10(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(){
        return a + b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int a){
        return a + b;
    }

    public int wykonajOperacjeMatematycznaMnozenie(int a, int b){
        return a * b;
    }
}

         */

        PrzykladPrzeciazanie obj = new PrzykladPrzeciazanie();
        obj.wupisz(10);
        obj.wypisz(10.2);
        obj.wypisz("abc");

    }
}

class PrzykladPrzeciazanie{
    public void wupisz(int a){
    System.out.println("int - " + a);
    }

    public void wypisz(double a){
        System.out.println("double - " + a);
    }

    public void wypisz(String a){
        System.out.println("String - " + a);
    }
}