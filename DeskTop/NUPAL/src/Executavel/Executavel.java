/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executavel;

import VIEW.Autenticar;
import VIEW.Home;

/**
 *
 * @author Barato Soft Solution
 */
public class Executavel {
    public static void main(String[] args) {
        /*Autenticar aut = new Autenticar();
        aut.Config();*/
        Home hm = new Home();
         hm.Config();
         hm.setVisible(true);
    }
    
}
