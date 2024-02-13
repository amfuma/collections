package com.cooksys.ftd.assignments.collections;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.ftd.assignments.collections.model.Employee;
import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.Worker;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {

        List<Employee> e = new ArrayList();
        Manager p = new Manager("p");
        Manager m = new Manager("m",p);
        Manager n = new Manager("n",m);
        Worker l = new Worker("l",n);
        e.add(p);
        e.add(m);
        e.add(n);
        e.add(l);
        System.out.println(l.getChainOfCommand());

    }
}
