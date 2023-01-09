import Generics.SortingAlgorithms;

public class Main {
/*    public static void Company() {
        Date date = new Date();

        Classes.Manager mg = new Classes.Manager("Alin", 25555.5, date, "management", 50);
        Classes.Developer dev = new Classes.Developer("Mihai", 6969696, date, "developers", "python");

        System.out.println("MGName:" + mg.getName() + " Salary:" + mg.getSalary() + " hireDate:" + mg.getHireDate()
            + " department:" + mg.getDepartment() + " Number of Subordinates:" + mg.getNumOfSubords());

        System.out.println("Dev Name:" + dev.getName() + " Salary:" +dev.getSalary() + " hireDate:" + dev.getHireDate()
                + " department:" + dev.getDepartment() + " Lang:" + dev.getLang());
    }*/

    public static void main(String[] args) {
        SortingAlgorithms sort = new SortingAlgorithms();

        System.out.println(sort.TestBubbleSort());
    }
}