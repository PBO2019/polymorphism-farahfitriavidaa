package com.company;

public class Staff extends Pegawai{
    private int tarif;
    private int gaji;
    private String nama;

    public Staff(){
        System.out.println("");
        this.gajiPegawai();
    }

    public void gajiPegawaii(int tarif,String nama){
        System.out.println("Gaji Staff ");
        System.out.println("Bapak/Ibu, " + nama);
        this.tarif = tarif;
    }

    public int getGaji(){
        return tarif;
    }
}
