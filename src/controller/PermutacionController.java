/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor .
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VICTOR.PEDRAZA
 */
public class PermutacionController {
    private List valoresNuevos;
    
    public List entraPemutacion(List valores, int permutaciones){
        valoresNuevos = new ArrayList<>();
        int tamano = valores.size()-1;
        System.out.println(tamano);
        for(int i=0; i<permutaciones; i++){
            for(int j=0;j<valores.size(); j++){
               
                int positionNext = j+1;
                int positionBefore = j-1;
      
                if(positionBefore == -1){
                    if(valores.get(positionNext).equals(0)){
                        valoresNuevos.clear();
                        valoresNuevos.add(j,0);
                    }else{
                        valoresNuevos.clear();
                        valoresNuevos.add(j,1);
                    }
                }else if(positionNext == valores.size()){
                     if(valores.get(positionBefore).equals(0)){
                        valoresNuevos.add(j,0);
                    }
                     else{
                         valoresNuevos.add(j,1);
                     }
                }
                else{
                    if(valores.get(positionBefore).equals(valores.get(positionNext))){
                        valoresNuevos.add(j,0);
                    }else{
                        valoresNuevos.add(j,1);
                    }
                }
                
                if(j==tamano){
                     System.out.println("entre");
                     valores.clear();
                     valores.addAll(valoresNuevos);
                }
            }
        }
        
        return valoresNuevos;
    }
    
}
