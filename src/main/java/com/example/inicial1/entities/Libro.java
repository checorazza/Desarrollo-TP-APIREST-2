package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Libro")
@Getter
@Setter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Libro extends Base{
    @Column(name="titulo")
    private String titulo;

    @Column(name="fecha")
    private int fecha;

    @Column(name="genero")
    private String genero;

    @Column(name="paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
