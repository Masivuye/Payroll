package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {
 private String firstName,lasName;

 private Employee(){}

 private Employee(Builder builder){
     this.firstName = builder.firstName;
     this.lasName = builder.lastName;
 }

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public static class Builder{
     private String firstName,lastName;

     public  Builder firstName(String firstName){
         this.firstName = firstName;
         return this;
     }
     public Builder lastName(String lastName){
         this.lastName = lastName;
         return this;
     }
     public Builder copy(Employee employee){
         this.firstName = firstName;
         this.lastName = lastName;
         return this;
     }
     public Employee build(){
         return new Employee(this);
     }

        @Override
        public String toString() {
            return "Builder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
