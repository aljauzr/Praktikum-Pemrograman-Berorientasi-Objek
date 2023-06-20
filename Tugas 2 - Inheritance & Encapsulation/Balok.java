/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joji
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luasPermukaan() {
        return 2 * (super.getPanjang()*super.getLebar() + 
               super.getPanjang()*tinggi + super.getLebar()*tinggi);
    }

    @Override
    public double volume() {
        return super.getPanjang() * super.getLebar() * tinggi;
    }
    
    void hasil(){
        System.out.println("\nLuas Persegi Panjang\t\t: " + luas());
        System.out.println("Keliling Persegi Panjang\t: " + keliling());
        System.out.println("Luas Permukaan Balok\t\t: " + luasPermukaan());
        System.out.println("Volume Balok\t\t\t: " + volume());
    }
}
