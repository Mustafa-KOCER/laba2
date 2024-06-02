package org.rd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        Personel personel1 = new Personel();
        personel1.isim = "Mustafa";
        personel1.soy_isim = "KOCER";
        personel1.yas = 40;
        personel1.sicil_no = 1212;

        Personel personel2 = new Personel();
        personel2.isim = "Orhan";
        personel2.soy_isim = "CINBIZ";
        personel2.yas = 50;
        personel2.sicil_no = 1078;

        personel1.Bilgiler();
        personel2.Bilgiler();
    }
}
class Personel {

    String isim;
    String soy_isim;
    int yas;
    int sicil_no;

    public void Bilgiler(){
        System.out.println("\nisim: "+ isim + "\nsoy isim: " + soy_isim + "\nyas: " + yas + "\nsicil no:" + sicil_no);
    }
}
