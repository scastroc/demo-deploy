package cl.sebacastro.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sebacastro.producto.model.Producto;
import cl.sebacastro.producto.repository.IProductoRepository;


@Service
public class ProductoService {
	
	@Autowired
	private IProductoRepository pRepo;

	public ProductoService() {
		super();
	}
	
	public List<Producto> getAll(){
		return pRepo.findAll();
	}
	
	public Producto getOne(int id) {		
		return pRepo.findById(id).get();
	}
	
	public void create(Producto p) {
		pRepo.save(p);		
	}
	
	public void update(Producto p) {
		pRepo.save(p);		
	}
	
	public void delete(int id) {
		//pRepo.delete(pRepo.getOne(id));
		pRepo.delete(pRepo.getReferenceById(id));
	}	

}
