package com.company;

public class Forint{
    double penz;
    public Forint(double penz){
        this.penz = penz;
    }
    public double brutto(){
        return penz+(penz*0.27) ;
    }
    public double afa(){
        return penz*0.27;
    }
    public double euroba(){
        return penz/367;
    }
    public double Yen(){
        return (penz/2.72);
    }

}
