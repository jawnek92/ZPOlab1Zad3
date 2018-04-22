package com.jawnek;

import java.util.HashMap;

public class LiczbaSlownie {
    private StringBuffer string;
    public HashMap<String, String> jednosci;
    private HashMap<String, String> dziesiatki;
    private HashMap<String, String> setki;
    private HashMap<String, String> nascie;

    public LiczbaSlownie() {
        this.string = new StringBuffer("");
        this.jednosci = new HashMap<>();
        this.jednosci.put("0", "");
        this.jednosci.put("1", "jeden");
        this.jednosci.put("2", "dwa");
        this.jednosci.put("3", "trzy");
        this.jednosci.put("4", "cztery");
        this.jednosci.put("5", "piec");
        this.jednosci.put("6", "szesc");
        this.jednosci.put("7", "siedem");
        this.jednosci.put("8", "osiem");
        this.jednosci.put("9", "dziewiec");

        this.dziesiatki = new HashMap<>();
        this.dziesiatki.put("0", "");
        this.dziesiatki.put("1", "dziesiec");
        this.dziesiatki.put("2", "dwadziescia");
        this.dziesiatki.put("3", "trzydziesci");
        this.dziesiatki.put("4", "czterdziesci");
        this.dziesiatki.put("5", "piecdziesiat");
        this.dziesiatki.put("6", "szescdziesiat");
        this.dziesiatki.put("7", "siedemdziesiat");
        this.dziesiatki.put("8", "osiemdziesiat");
        this.dziesiatki.put("9", "dziewiecdziesiat");

        this.nascie = new HashMap<>();
        this.nascie.put("1", "jedenascie");
        this.nascie.put("2", "dwanascie");
        this.nascie.put("3", "trzynascie");
        this.nascie.put("4", "czternascie");
        this.nascie.put("5", "pietnascie");
        this.nascie.put("6", "szesnascie");
        this.nascie.put("7", "siedemnascie");
        this.nascie.put("8", "osiemnascie");
        this.nascie.put("9", "dziewietnascie");

        this.setki = new HashMap<>();
        this.setki.put("1", "sto");
        this.setki.put("2", "dwiescie");
        this.setki.put("3", "trzysta");
        this.setki.put("4", "czterysta");
        this.setki.put("5", "piecset");
        this.setki.put("6", "szescset");
        this.setki.put("7", "siedemset");
        this.setki.put("8", "osiemset");
        this.setki.put("9", "dziewiecset");
    }

    public String convert(int number){
        StringBuffer stringBuffer = new StringBuffer("");
        this.string.append(number);
        for(int i=0; i<string.length(); i++){
            switch(i){
                case 0:
                    stringBuffer.append(this.setki.get(string.substring(i,i+1)));
                    stringBuffer.append(" ");
                    break;
                case 1:
                    if((this.string.substring(i+1).equals("1")||
                        this.string.substring(i+1).equals("2")||
                        this.string.substring(i+1).equals("3")||
                        this.string.substring(i+1).equals("4")||
                        this.string.substring(i+1).equals("5")||
                        this.string.substring(i+1).equals("6")||
                        this.string.substring(i+1).equals("7")||
                        this.string.substring(i+1).equals("8")||
                        this.string.substring(i+1).equals("9"))&&
                        this.string.substring(i,i+1).equals("1")){
                        stringBuffer.append(this.nascie.get(string.substring(i+1,i+2)));
                    }else{
                        stringBuffer.append(this.dziesiatki.get(string.substring(i, i+1)));
                        stringBuffer.append(" ");
                    }
                    break;
                case 2:
                    if(!this.string.substring(i-1, i).equals("1")){
                        stringBuffer.append(this.jednosci.get(string.substring(i)));
                    }else if(this.string.substring(i-1,i).equals("0")){
                        stringBuffer.append(this.jednosci.get(string.substring(i)));
                    }else
                        stringBuffer.append(" ");
                    break;
            }
        }
        return stringBuffer.toString();

    }
}
