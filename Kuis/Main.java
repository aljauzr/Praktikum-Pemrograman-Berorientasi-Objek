/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author joji
 */
public class Main {
    public static void main(String[] args) {
        String[] nama = new String[4];
        String[] jenis = new String[4];
        String[] suara = new String[4];
        Scanner input = new Scanner(System.in);
        
        //      Nama    : Al Jauzi Abdurrohman
        //      NIM     : 123200106, Plug B

        for (int i=0; i<4; i++){
            System.out.printf("Masukkan nama hewan ke-" + (i+1) + "\t: ");
            nama[i] = input.nextLine();
            System.out.printf("Masukkan jenis hewan ke-" + (i+1) + "\t: ");
            jenis[i] = input.nextLine();
            System.out.printf("Masukkan suara hewan ke-" + (i+1) + "\t: ");
            suara[i] = input.nextLine();
            
            System.out.println("");
        }
        
        for (int j=0; j<4; j++){
            Hewan print = new Hewan(nama[j], jenis[j], suara[j]);
            print.printAnimal(  );
        }
    }
}
