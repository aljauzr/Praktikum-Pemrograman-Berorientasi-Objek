/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joji
 */
public class Lingkaran implements MenghitungBidang{
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }   
    
    @Override
    public double luas() {
        return Math.PI * (jariJari * jariJari);
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
    
}
