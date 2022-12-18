/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Umman Hasan
 */
public interface Startable
{
    
    void start();// default olaraq => public abstract void start();
    
    void foo1(); // body hissesi yoxdur ve yazmaq olmaz, xeta verecek
    
    default void foo(){// default keyword-u yazdiqdan sonra block icinde body yazmaq olar
        
    }
    
    int a =5;// default olaraq => public static final == int-in qarshisinda var
    // ve mutleq deyer verilmelidir cunki final keyword-u var, constant-dir.
}
