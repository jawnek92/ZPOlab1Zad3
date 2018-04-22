package com.jawnek;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LiczbaSlownie pierwszaLiczba = new LiczbaSlownie();
        LiczbaSlownie drugaLiczba = new LiczbaSlownie();
        LiczbaSlownie trzecia = new LiczbaSlownie();
        LiczbaSlownie czwarta = new LiczbaSlownie();
        LiczbaSlownie piata = new LiczbaSlownie();
        LiczbaSlownie szosta = new LiczbaSlownie();

        System.out.println(pierwszaLiczba.convert(139));

        System.out.println(drugaLiczba.convert(502));

        System.out.println(trzecia.convert(212));

        System.out.println(czwarta.convert(999));

        System.out.println(piata.convert(100));

        System.out.println(szosta.convert(700));


    }
}
