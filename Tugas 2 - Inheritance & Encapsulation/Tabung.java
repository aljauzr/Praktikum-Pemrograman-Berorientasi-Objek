/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IM'TECH
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jariJari) {
        super(jariJari);
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
        return 2 * Math.PI * super.getJariJari() * (super.getJariJari() + tinggi);
    }

    @Override
    public double volume() {
        return Math.PI * super.getJariJari() * super.getJariJari() * tinggi;
    }
    
    void hasil(){
        System.out.println("\nLuas Lingkaran\t\t: " + luas());
        System.out.println("Keliling Lingkaran\t: " + keliling());
        System.out.println("Luas Permukaan Tabung\t: " + luasPermukaan());
        System.out.println("Volume Tabung\t\t: " + volume());
    }
}
