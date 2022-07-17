package es.biblioteca.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Juan Manuel Cintas
 *
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoAdicional {

    /**
     * Id.
     */
    @Id
    private int id;

    /**
     * ISBN del libro.
     */
    private String isbn;

    /**
     * Fecha publicación del libro.
     */
    private Integer fechaPublicacion;

    /**
     * Idioma del libro.
     */
    private String idioma;

    /**
     * Objeto libro.
     */
    @OneToOne
    @JoinColumns(
            {@JoinColumn(name = "libro_codigo", referencedColumnName =
                    "codigo"),
            @JoinColumn(name = "libro_idioma", referencedColumnName =
                    "idioma")}
    )
    private Libro libro;

}
