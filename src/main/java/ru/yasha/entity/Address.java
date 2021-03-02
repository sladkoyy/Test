package ru.yasha.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer     id;
    @OneToOne(mappedBy = "address")
    private User user;
    @Column(name = "name")
    private String  name;
}
