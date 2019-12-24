package com.Task2.Task2Demo;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "person_data")
@IdClass(Person.PersonId.class)
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id" ,nullable = false)
    private BigInteger id;

    @Column(name = "first_name" ,nullable = false)
    private String firstName;

    @Column(name = "last_name" ,nullable = false)
    private String lastName;

    public static class PersonId {
        private BigInteger id;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public BigInteger getId(){
        return this.id;
    }

    public void setId(BigInteger id){
        this.id=id;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}
