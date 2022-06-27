package dev.thanbv1510.patterns.creational.builder.immutable;

import lombok.ToString;

@ToString
public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student build() {
            Student student = new Student();
            student.id = this.id;
            student.name = this.name;

            return student;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
    }
}
