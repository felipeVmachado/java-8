package com.challenge;

import com.challenge.desafio.CalculadorDeClasses;



public class CalculadoraMain {

    public static void main(String[] args) {

        CalculadorDeClasses verificaAnnotations = new CalculadorDeClasses(Calculadora.class);

        System.out.println("Subtrair: " + verificaAnnotations.subtrair());
        System.out.println("Somar:  " + verificaAnnotations.somar());
        System.out.println("totalizar:  " + verificaAnnotations.totalizar());


    }

}