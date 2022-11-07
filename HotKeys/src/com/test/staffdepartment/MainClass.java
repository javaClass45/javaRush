package com.test.staffdepartment;

public class MainClass {
    public static void main(String[] args) throws Exception {
        StaffDepartment staffDepartment = new StaffDepartment();
        Employee empl1  = staffDepartment.receiveEmployee("Lawyer");
        empl1.work();
        Employee empl2  = staffDepartment.receiveEmployee("Buhgalter");
        empl2.work();
        Employee empl3  = staffDepartment.receiveEmployee("Lawyer");
        empl1.work();
        Employee empl4  = staffDepartment.receiveEmployee("Buhgalter");
        empl2.work();
        Employee empl5  = staffDepartment.receiveEmployee("Lawyer");
        empl1.work();
        Employee empl6  = staffDepartment.receiveEmployee("Buhgalter");
        empl2.work();
        Employee empl7  = staffDepartment.receiveEmployee("Lawyer");
        empl1.work();
        Employee empl8  = staffDepartment.receiveEmployee("Buhgalter");
        empl2.work();
        Employee empl9  = staffDepartment.receiveEmployee("Lawyer");
        empl1.work();
        Employee empl10  = staffDepartment.receiveEmployee("Buhgalter");
        empl2.work();
    }

}
