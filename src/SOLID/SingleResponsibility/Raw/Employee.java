package SOLID.SingleResponsibility.Raw;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public boolean isPromotionDueThisYear() {
        //promotion logic implementation does not belong to core functionality of employee class hence
        // breaking single responsibility pattern

        return false;
    }

    public Double calcIncomeTaxForCurrentYear() {
        //income tax logic implementation does not belong to core functionality of employee class hence
        //        // breaking single responsibility pattern
        return 0.0;
    }
    //Getters & Setters for all the private attributes
}
