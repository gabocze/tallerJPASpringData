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
	String edicion;  // "I", "II", "III", "IV", etc.
	public LibroId(Integer codigo, String edicion) {
		this.codigo = codigo;
		this.edicion = edicion;
	}
}
