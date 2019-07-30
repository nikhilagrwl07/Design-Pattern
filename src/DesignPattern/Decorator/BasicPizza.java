/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.Decorator;

public class BasicPizza implements Pizza {

    public String bakePizza() {
        return "Basic Pizza";
    }

    public String serve(int customerID) {
        return ("Serving basic Pizza to customer :: " + customerID);
    }

    public int cost() {
        return 200;
    }
}
