/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String MSG_USR = "Introducir número .....: ";
    public static final String MSG_OUT = "Número introducido ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta ";

    public final void launchApp() {
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        int n = (int) obtener(MSG_USR, MSG_ERR);
        //Separador
        System.out.println("---");
        //Mensaje de salida
        System.out.printf(MSG_OUT + "%d%n", n);
    }

    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean testOK = false;

        do {
            try {
                System.out.print("Introduzca un numero entero....: ");
                numero = SCN.nextInt();
                testOK = true;
            } catch (Exception e) {
                System.out.println("ERROR: Entrada incorrecta");
            } finally {
                SCN.nextLine();
            }
        } while (!testOK);
        return numero;
    }
}
