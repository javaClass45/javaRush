package com.test.staffdepartment;

import java.util.HashMap;
import java.util.Map;

public class StaffDepartment {

    private Map<String, Employee> currentEmploees = new HashMap<>();




    public Employee receiveEmployee(String type) throws Exception {
        Employee result;
        if (currentEmploees.containsKey(type)) {
            result = currentEmploees.get(type);
        } else {
            switch (type) {
                case "Buhgalter":
                    result = new Buhgalter();
                    currentEmploees.put(type, result);
                    break;

                case "Lawyer":
                    result = new Lawyer();
                    currentEmploees.put(type, result);
                    break;

                default:
                    throw new Exception("incompatible of state!!");
            }
        }


        return result;
    }




}
