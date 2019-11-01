/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutación;

import controller.PermutacionController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VICTOR.PEDRAZA
 */
public class Permutación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        PermutacionController permutacionController = new PermutacionController();
        List lista = new ArrayList();
        lista.add(1);
        lista.add(0);
        lista.add(1);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        lista.add(1);
        lista.add(1);
        System.out.println(permutacionController.entraPemutacion(lista, 2));
    }
    
    
    
}
