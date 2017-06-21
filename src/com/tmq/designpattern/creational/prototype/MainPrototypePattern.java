package com.tmq.designpattern.creational.prototype;

import java.util.List;

/**
 * Created by quytm on 6/21/2017.
 */
public class MainPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();

        List<String> list = empsNew.getEmpList();
        list.add("John");

        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);

        testCloneAndCopy();
    }

    private static void testCloneAndCopy() {
        Employees employees = new Employees();
        employees.loadData();

        Employees copyEmployees = new Employees(employees.getEmpList());

        System.out.println("--- Before ---");
        System.out.println("employees: \t\tlist = " + employees.getEmpList());
        System.out.println("copyEmployees: \tlist = " + copyEmployees.getEmpList());

        System.out.println("--- After ---");
        employees.getEmpList().add("new_object_in_employees");
        copyEmployees.getEmpList().add("new_object_in_copyEmployees");
        System.out.println("employees: \t\tlist = " + employees.getEmpList());
        System.out.println("copyEmployees: \tlist = " + copyEmployees.getEmpList());
    }

}
