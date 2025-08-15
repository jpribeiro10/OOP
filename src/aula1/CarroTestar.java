package aula1;

import javax.tools.StandardLocation;

public class CarroTestar {
    public static void main(String [] args){

        Carro c1 = new Carro();

        c1.nome = "HB20S";
        c1.marca = "Hyundai";
        c1.anoFab = 2021;
        c1.ano = 2021;
        c1.vel = 50;

        c1.acelerar(10);

       // System.out.println("Velocidade: " + c1.vel + " Km/h");

        c1.freiar(30);

        System.out.println("Velocidade: " + c1.vel + " Km/h");

    }
}