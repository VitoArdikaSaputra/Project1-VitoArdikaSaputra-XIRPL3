/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.*;

import java.util.Scanner;
public class MainAplikasiKasir {
    public DaftarMenu daftarMenu;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();}
    
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
}