/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program untuk mengeja sebuah kata
 */
public class IF110119005Latihan25EjaanNama {
    static final Scanner scanner = new Scanner(System.in);
    String nama;

    private void masukkanNamaDepan(){
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.next();
    }

    private void tampilEjaanNama(){
        System.out.println("\nEjaan untuk \""+nama+"\" adalah : ");
        int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IF110119005Latihan25EjaanNama data = new IF110119005Latihan25EjaanNama();
        data.masukkanNamaDepan();
        data.tampilEjaanNama();
        System.out.println("Developed by : Hayin Ananta");
    }
    
}
