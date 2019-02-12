package com.company;

public class MenghitungGajinya {
    public static void main(String[] args){
        int gaji = 30;
        Supervisior sv = new Supervisior();
        sv.gajiPegawaii(10000,"Ir.Dino");
        System.out.println("Rp. " + sv.getGaji() * gaji);
        Staff st = new Staff();
        st.gajiPegawaii(50000, "Sapto");
        System.out.println("Rp. " + st.getGaji() * gaji);
    }
}
