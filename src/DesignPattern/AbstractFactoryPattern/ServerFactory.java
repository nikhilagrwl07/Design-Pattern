/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.AbstractFactoryPattern;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}

}
