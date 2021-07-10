package com.ngo.bike.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "bike")
public class  Bike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
    @SequenceGenerator(name = "seq_generator", sequenceName = "hibernate_sequence", allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "MM-dd-yyyy")
    private Date purchaseDate;
    private boolean contact;

    //constructor with name, password and role

}
