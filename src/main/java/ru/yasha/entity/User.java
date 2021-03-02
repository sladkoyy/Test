package ru.yasha.entity;

import lombok.Getter;
import lombok.Setter;
import ru.yasha.entity.Address;
import ru.yasha.entity.Docs;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer     id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;
    @Column(name = "age")
    private int     age;
    @Column(name = "name")
    private String  name;
    @OneToMany(mappedBy = "user")
    private List<Docs>  docs;

}
