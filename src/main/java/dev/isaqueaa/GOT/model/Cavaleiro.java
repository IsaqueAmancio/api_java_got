package dev.isaqueaa.GOT.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cavaleiros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cavaleiro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String nome;
    String casa;
    int idade;




}
