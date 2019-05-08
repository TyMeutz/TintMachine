/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tintmachine;

/**
 *
 * @author tmeut
 */
public class TintExeption extends Exception{
        TintError error;    
    public TintExeption(String msg, TintError err){
        super(msg);
        error = err;
    }
}
