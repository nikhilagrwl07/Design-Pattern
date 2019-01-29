/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.AbstractFactory;

public class MainDriver {

	public static void main(String[] args) {
		PCFactory pcFactory = new PCFactory("2 GB", "500 GB", "2.4 GHz");
		Computer pc = ComputerFactory.getComputer(pcFactory);

		ServerFactory serverFactory = new ServerFactory("16 GB", "1 TB", "2.9 GHz");
		Computer server = ComputerFactory.getComputer(serverFactory);

		System.out.println("AbstractFactory PC Config::"+pc.toString());
		System.out.println("AbstractFactory Server Config::"+server.toString());
	}
}