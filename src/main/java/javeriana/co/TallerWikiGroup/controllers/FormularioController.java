package javeriana.co.TallerWikiGroup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javeriana.co.TallerWikiGroup.modelo.Mensaje;
import javeriana.co.TallerWikiGroup.modelo.MensajeRepository;

@Controller
@RequestMapping("/contacto")
public class FormularioController {

    @Autowired
    private MensajeRepository mensajeRepository;

     @GetMapping
    public String showRegistrationForm(@ModelAttribute("mensaje") Mensaje mensaje, Model model){

        model.addAttribute("mensaje", new Mensaje());

        return "contacto";
    }


    @PostMapping
    public String envioMansaje(@ModelAttribute Mensaje mensaje){

        mensajeRepository.save(mensaje);

        return "contacto";
    }

}
