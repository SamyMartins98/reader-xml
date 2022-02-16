package com.read.xml.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@XmlRootElement(name = "Customer")
@Entity
public class Customer {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

}