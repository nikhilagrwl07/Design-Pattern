/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.AbstractFactoryPattern;

/**
 *
 * @author nikhilagrawal
 */
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
