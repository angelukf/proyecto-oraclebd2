/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author campitos
 */
public class Malo {
    public static void main(String[] args) {
        try{
         boolean valor=   Autenticacion.autenticar("system", "system");
            System.out.println(valor);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
