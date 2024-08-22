package cl.sebacastro.producto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    @GetMapping("/")
    public ModelAndView mostrarHome() {
        return new ModelAndView("home", "mensaje", "Bienvenidos a Spring Boot!!!");
    }
}

