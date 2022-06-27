package dev.thanbv1510.patterns.creational.prototype.deepcopy;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Cloneable {
    private String street;
    private String city;

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
