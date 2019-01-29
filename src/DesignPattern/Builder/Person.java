package DesignPattern.Builder;

public class Person {
    private String name;
    private String emailId;
    private String address;
    private int age;

    public Person(Builder builder) {
        this.name=builder.name;
        this.emailId=builder.emailId;
        this.address=builder.address;
        this.age = builder.age;
    }

    public static class Builder{

        // Mandatory field for creating builder object of Person class
        private final String name;
        private final String emailId;

        // Optional field
        private String address;
        private int age;

        public Builder(String name, String emailId) {
            this.name = name;
            this.emailId = emailId;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
