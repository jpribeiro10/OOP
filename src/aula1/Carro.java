package aula1;

public class Carro {

    //atributos

     String nome;
     String marca;
     int anoFab;
     int ano;
     int vel;

     //métodos

    void acelerar(int aceleracao){
        vel+=aceleracao;
    }

    void freiar(int reduzir){
        vel-=reduzir;
    }

    void buzinar(){
        System.out.println("Barulho de Buzina");
    }
}
