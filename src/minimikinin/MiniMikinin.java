/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimikinin;

import java.util.Scanner;

/**
 *
 * @author ASUS A455L
 */
public class MiniMikinin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int makanan,jumlah,harga,total = 0;
        
        System.out.println("Menu makanan : ");
        System.out.println("1.Mie Ayam : Rp.5000");
        System.out.println("2.Bakso : Rp.10000");
        System.out.println("3.Soto : Rp.150000");
        
        System.out.println("Masukan pilihan angka Makanan yang ingin dipesan : ");
        makanan = input.nextInt();
        System.out.println("Masukan jumlah makanan : ");
        jumlah = input.nextInt();
        
        switch(makanan){
            case 1: 
                System.out.println("Makanan yang anda pesan : "+makanan);
                System.out.println("Jumlah makanan yang dipesan : "+jumlah);
                harga = 5000;
                total = jumlah* harga;
                System.out.println("Silahkan membayar sebesar Rp."+total);
            case 2 : 
                 System.out.println("Makanan yang anda pesan : "+makanan);
                System.out.println("Jumlah makanan yang dipesan : "+jumlah);
                harga = 10000;
                total = jumlah* harga;
                System.out.println("Silahkan membayar sebesar Rp."+total);
            case 3 :
                 System.out.println("Makanan yang anda pesan : "+makanan);
                System.out.println("Jumlah makanan yang dipesan : "+jumlah);
                harga = 15000;
                total = jumlah* harga;
                System.out.println("Silahkan membayar sebesar Rp."+total);
            default :
                System.out.println("Terima kasih atas kunjungan anda");
        }
        
    }
    
}
