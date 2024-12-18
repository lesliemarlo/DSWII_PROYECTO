package pe.edu.cibertec.dawii.ms.ecc.inventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroInfo {
    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "isbn", nullable = false)
    private String isbn;
}
