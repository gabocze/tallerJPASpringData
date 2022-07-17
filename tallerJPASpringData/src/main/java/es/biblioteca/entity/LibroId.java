package es.biblioteca.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
public class LibroId implements Serializable {
	Integer codigo;
	String idioma;
	public LibroId(Integer codigo, String idioma) {
		this.codigo = codigo;
		this.idioma = idioma;
	}
}
