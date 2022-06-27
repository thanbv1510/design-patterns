package dev.thanbv1510.patterns.creational.prototype.deepcopy;

public class MainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(1, "John", new Address("123 Main St", "Anytown"));

        Student student2 = student1.clone();


        System.out.println(student1.hashCode()); // 925858445
        System.out.println(student1.getAddress().hashCode()); // 798154996
        System.out.println(student2.hashCode()); // 681842940
        System.out.println(student2.getAddress().hashCode()); // 1392838282

        student1.getAddress().setCity("New York");
        System.out.println(student1);
        System.out.println(student2);
    }
}
