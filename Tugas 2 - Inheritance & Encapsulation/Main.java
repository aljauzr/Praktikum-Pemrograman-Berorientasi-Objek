
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joji
 */
public class Main {
    public static void main(String[] args) {
        boolean perulangan1 = true;
        Scanner input = new Scanner(System.in);
        
//      Nama    : Al Jauzi Abdurrohman
//      NIM     : 123200106, Plug B

        while(perulangan1){
            System.out.println("----------");
            System.out.println("Menu Utama");
            System.out.println("----------");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.printf("Pilih: ");
            int pilih = input.nextInt();
            System.out.println("");
            
            if (pilih == 1){
                boolean perulangan2 = true;
                
                while(perulangan2){
                    System.out.printf("Input Panjang\t: ");
                    double panjang = input.nextDouble();
                    System.out.printf("Input Lebar\t: ");
                    double lebar = input.nextDouble();
                    System.out.printf("Input Tinggi\t: ");
                    double tinggi = input.nextDouble();
                    
                    Balok hasilBalok = new Balok(panjang, lebar, tinggi);
                    hasilBalok.hasil();
                    
                    System.out.printf("Ulangi? (Ya: 1 || Tidak: 0): ");
                    int ulang = input.nextInt();
                    
                    if (ulang == 1){
                        continue;
                    }
                    else if (ulang == 0){
                        perulangan2 = false;
                    }
                    else{
                        System.out.println("Input tidak valid. Akan kembali ke menu utama.");
                        perulangan2 = false;
                    }
                    System.out.println("");
                }
            }
            else if (pilih == 2){
                boolean perulangan2 = true;
                
                while(perulangan2){
                    System.out.printf("Input Tinggi\t: ");
                    double tinggi = input.nextDouble();
                    System.out.printf("Input Jari-Jari\t: ");
                    double jariJari = input.nextDouble();
                    
                    Tabung hasilTabung = new Tabung(tinggi, jariJari);
                    hasilTabung.hasil();
                    
                    System.out.printf("Ulangi? (Ya: 1 || Tidak: 0): ");
                    int ulang = input.nextInt();
                    
                    if (ulang == 1){
                        continue;
                    }
                    else if (ulang == 0){
                        perulangan2 = false;
                    }
                    else{
                        System.out.println("Input tidak valid. Akan kembali ke menu utama.");
                        perulangan2 = false;
                    }
                    System.out.println("");
                }
            }
            else if (pilih == 0){
                perulangan1 = false;
            }
            else{
                System.out.println("Input tidak valid. Silakan ulang.\n");
                continue;
            }
            System.out.println("");
        }
    }
}
