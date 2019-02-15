/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class rectangulo 
{
    private int base;
    private int altura;
    public rectangulo(){}
    public rectangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public int getBase(){
        return base;
    }
    public void setBase(int Base){
        this.base = base;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getArea(){
        return this.base * this.altura;
    }
    }
    

