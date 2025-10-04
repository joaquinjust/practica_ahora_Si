package org.example.prac1.Gato;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Gato {

    //iwjefiowjefiowjefiwf
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //klwejglkwglkqweglk
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id2;

    private String perro;
    private String raza;

    private String vacuna;



}
