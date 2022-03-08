/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import analizadorLexico.Analizador;
import java.io.IOException;

/**
 *
 * @author oziel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Analizador an = new Analizador();
        System.out.println(an.cuartoMetodo());
    }

}
