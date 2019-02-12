package com.company;

public class Supervisior extends Pegawai{
    private int tarif;
    private int gaji;
    private String nama;

    public Supervisior(){
        this.gajiPegawai();
    }

    public void gajiPegawaii(int tarif,String nama){
        System.out.println("Gaji Supervisior ");
        System.out.println("Bapak/Ibu, " + nama);
        this.tarif = tarif;
    }

    public int getGaji(){
        return tarif;
    }
}
