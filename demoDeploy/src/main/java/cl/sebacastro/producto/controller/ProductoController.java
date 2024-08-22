package cl.sebacastro.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.sebacastro.producto.model.Producto;
import cl.sebacastro.producto.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService ps;
	
	@GetMapping("/productos")
	public ModelAndView mostrarProductos() {
		List<Producto> productos = ps.getAll();
		
		return new ModelAndView("productos", "productos", productos);		
	}
}
