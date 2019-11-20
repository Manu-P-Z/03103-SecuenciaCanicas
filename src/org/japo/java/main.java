/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Constantes
        final String CANICA_GRANDE = "Ruperta";
        final int CANICAS_INICIO = 5;
        
        //Variables
        int nCanF;
        int nCanC;
        
        //Operaciones
        nCanC = 4;
        nCanF = CANICAS_INICIO - nCanC;
        
        //mensaje
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");
        System.out.printf("%s %s%n", "Nombre de la canica ........:", CANICA_GRANDE);
        System.out.println("---");
        System.out.printf("%s %d%n", "Número de canicas inicial ..:", CANICAS_INICIO);
        System.out.printf("%s %d%n", "Número de canicas final ....:", nCanF);
        System.out.println("---");
        System.out.printf("%s %d%n", "Número de canicas perdidas .:", nCanC);
        
    }
    
}
