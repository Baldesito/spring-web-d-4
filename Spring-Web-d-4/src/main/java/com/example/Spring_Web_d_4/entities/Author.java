package com.example.Spring_Web_d_4.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "authors")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dateOfBirth;
    private String avatar;

/* Per evitare lo stackoverflow error che avviene quando si manda un Author come risposta (può avvenire anche quando mandiamo un BlogPost con un Author)
   si può o togliere la bidirezionalità, oppure usare @JsonIgnore, oppure farsi un payload di risposta custom.
  @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    @JsonIgnore
    List<Blogpost> blogpostList;*/
}
