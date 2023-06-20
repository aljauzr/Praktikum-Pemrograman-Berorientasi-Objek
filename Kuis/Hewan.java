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
public class Hewan implements Animal{
    String nama, jenis, suara;

    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    @Override
    public String getName() {
        return this.nama;
    }

    @Override
    public String getType() {
        return this.jenis;
    }

    @Override
    public void makeSound() {
        System.out.println(this.suara);
    }
    
    public void printAnimal() {
        System.out.println(this.nama + " adalah " + this.jenis + " dengan bunyi "
        + this.suara);
    } 
}
