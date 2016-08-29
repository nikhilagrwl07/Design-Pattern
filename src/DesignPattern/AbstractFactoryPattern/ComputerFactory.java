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
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory)
    {
	return factory.createComputer();
     }
}
