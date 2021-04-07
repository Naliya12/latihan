/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS FX505D
 */
public class ClassSiswa {
    public static void main(String[] args) {
        siswa nama = new siswa();
        nama.setNama("Naliya Tsamara Yasmin");
        nama.setAlamat("Jl. Delima no. 11");
        nama.setBeratbadan(45);
        nama.setNoabsen(30);
        nama.setTTL("Lumajang, 12 Desember 2004");
        
        System.out.println("Nama: "+nama.getNama());  
        System.out.println("Alamat "+nama.getAlamat());
        System.out.println("Beratbadan: "+nama.getBeratbadan());
        System.out.println("No absen: "+nama.getNoabsen());
        System.out.println("TTL: "+nama.getTTL());
        
    }
    
}
