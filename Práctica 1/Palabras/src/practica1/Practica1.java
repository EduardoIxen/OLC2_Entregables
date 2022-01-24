/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.io.FileInputStream;
/**
 *
 * @author Eduardo-Ixen
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interpretar("./entrada.txt");
    }
    
    private static void interpretar(String path){
        analizadores.Parser parse;
        try {
            parse = new analizadores.Parser(new analizadores.Lexico(new FileInputStream(path)));
            parse.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilacion de entrada");
            System.out.println("Causa, "+e.getCause());
        }
    }
    
}
