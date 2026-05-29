package com.example.spring_data_jpa_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private @Getter @Setter String name;
    private @Getter @Setter String city;

    public Employee( String name, String city) {

        this.name = name;
        this.city = city;
    }

    public long getId() {
        return id;
    }


}
