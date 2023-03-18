package com.example.entities;

import java.time.LocalDate;

public class Borrar {
    private String name;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaAlta;
    private LocalDate fechaDeNacimiento;

    public enum Dias {
        LUNES, MARTES, MIERCOLES
    }
}
