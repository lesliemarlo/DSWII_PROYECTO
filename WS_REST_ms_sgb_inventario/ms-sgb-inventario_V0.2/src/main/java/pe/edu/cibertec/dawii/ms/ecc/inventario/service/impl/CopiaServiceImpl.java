package pe.edu.cibertec.dawii.ms.ecc.inventario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Copia;
import pe.edu.cibertec.dawii.ms.ecc.inventario.repository.CopiaRepository;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.CopiaService;

@Service
public class CopiaServiceImpl implements CopiaService{  

	@Autowired
	CopiaRepository copiaRepository;
	 
	@Override
	public List<Copia> listaCopiasTodos() {
		return copiaRepository.findAll();
	}

	@Override
	public Optional<Copia> obtenerCopiaPorId(Long idCopia) {
		return copiaRepository.findById(idCopia);
	}

	@Override
	public Copia registrarCopia(Copia copia) {
		return copiaRepository.save(copia);
	}

	@Override
	public Optional<Copia> actualizarCopia(Copia copia, Long idProd) {
		return Optional.empty();
	}

	@Override
	public void eliminarCopia(Long idCopia) {
		copiaRepository.deleteById(idCopia);
	}

}
