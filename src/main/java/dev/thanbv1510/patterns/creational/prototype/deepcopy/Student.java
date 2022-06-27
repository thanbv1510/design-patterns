package dev.thanbv1510.patterns.creational.prototype.deepcopy;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Cloneable {
    private int id;
    private String name;
    private Address address;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student studentCopy = (Student) super.clone();
        studentCopy.address = this.address.clone();

        return studentCopy;
    }
}
