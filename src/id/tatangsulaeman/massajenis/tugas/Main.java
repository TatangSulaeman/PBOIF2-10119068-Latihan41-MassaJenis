/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.massajenis.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan massa jenis kubus
 */
public class Main {
    public static void main(String[] args){
        Kubus dataKubus = new Kubus();
        
        System.out.println("=====Masa Jenis Kubus=====");
        
        dataKubus.setSisi(5);
        System.out.println("Sisi\t\t: " + dataKubus.getSisi());
        
        dataKubus.setMassa(250);
        System.out.println("Sisi\t\t: " + dataKubus.getMassa());
        
        System.out.println();
        
        System.out.println("=====Hasil Perhitungan=====");
        
        System.out.println("Volume\t\t: " + dataKubus.hitungVolume(dataKubus.getSisi()));
        System.out.println("Massa Jenis\t: " + dataKubus.hitungMassaJenis(dataKubus.getMassa(), dataKubus.hitungVolume(dataKubus.getSisi())));
    }
}
