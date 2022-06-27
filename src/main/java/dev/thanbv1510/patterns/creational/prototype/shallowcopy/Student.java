package dev.thanbv1510.patterns.creational.prototype.shallowcopy;

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
        return (Student) super.clone();
    }
}
