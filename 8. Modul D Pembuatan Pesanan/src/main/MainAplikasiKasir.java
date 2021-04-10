/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainAplikasiKasir {
    public DaftarMenu daftarMenu;
    
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;
    
        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();}
        
        System.out.println("======== TRANSAKSI ========");
        
        do {
        System.out.print("No Transaksi : ");
        no_transaksi = input.next();
        System.out.print("Pemesan : ");
        nama_pemesan = input.next();
        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.print("Makan ditempat? [Y/N]");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")){
            System.out.print("Nomor Meja : ");
            no_meja = input.next();
        }
}       
        Transaksi trans = new Transaksi(no_transaksi, nama_pemesan, tanggal, no_meja);
        int no_kuah;
        do{
        
        Menu menu_yang_dipilih = app.daftarMenu.pilihMenu();
        
        jumlah pesanan = (int) app.cekInputNumber("Jumlah : ");
        
        Pesanan pesanan = new Pesanan (menu_yang_dipilih, jumlah_pesanan);
        trans.tambahPesanan(pesanan);
        
        if (menu_yang_dipilih.getKategori().equals("Ramen")){
         int jumlah_ramen = jumlah_pesanan;   
        do{
            Menu kuah_yang_dipilih = app.daftarMenu.pilihKuah();
            
            System.out.print("Level : [0-5] : ");
            String level = input.next();
            
            int jumlah_kuah =0;
            do{
                jumlah_kuah = (int) app.cekINputNumber("Jumlah : ");
                
                if(jumlah_kuah > jumlah_ramen){    
                } else {
                    break;
                }
        }while (jumlah_kuah > jumlah_ramen);
        
        Pesanan pesanan_kuah = new Pesanan(kuah_yang_dipilih, jumlah_kuah);
        pesaan_kuah.setKeterangan("Level " + level);
        
        trans.tambahPesanan(pesaan_kuah);
        jumlah_ramen == jumlah_kuah;
        } while (jumlah_ramen > 0);
        } else {
            System.out.print("Keterangan [- jika kosong]: ");
            keterangan = input.next();
        }
        if (!keterangan.equals("_")){
            pesanan.setKeterangan(keterangan);
        }
        System.out.print("Tambah Pesanan lagi? [Y/N] : ");
        pesan_lagi = input.next();
        } while {pesan_lagi.equalIgnoreCase("Y")};
        
    public void generateDaftarMenu() {
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Toping("Wiskas", 7000));
        daftarMenu.tambahMenu(new Toping("Mesis Sereal", 10000));
        daftarMenu.tambahMenu(new Toping("Pur Ayam", 5000));
        daftarMenu.tambahMenu(new Toping("Blue Cheese", 50000));
        daftarMenu.tambahMenu(new Minuman("Jamu Kuat", 10000));
        daftarMenu.tambahMenu(new Minuman("Sake", 80000));
        daftarMenu.tambahMenu(new Minuman("Shochu", 70000));
        daftarMenu.tambahMenu(new Minuman("Energen", 10000));
    
        daftarMenu.tampilDaftarMenu();}
    public double cekInputNumber(String label){
        try{
            Scanner get_input = new Scanner(System.in);
            System.out.print(label);
            double nilai = get_input.nextDouble();

            return nilai;
        }catch (InputMismatchException ex){
            System.out.println("[Err] Harap masukkan angka");
            return cekInputNumber(label);
        }
    }  
}