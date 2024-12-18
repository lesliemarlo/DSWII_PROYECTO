package pe.edu.cibertec.dawii.ms.ecc.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario,Long>{
  
}
   