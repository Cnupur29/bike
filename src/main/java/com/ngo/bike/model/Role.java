package com.ngo.bike.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // constructor with name
}
