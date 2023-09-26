package javeriana.co.TallerWikiGroup.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imagenes")
public class ImageController {

    @GetMapping("/arquitecturaGeneral/modeloConceptual.png")
    public ResponseEntity<byte[]> getImage() {
        try {
            
            Resource resource = new ClassPathResource("/static/imagenes/arquitecturaGeneral/modeloConceptual.png");

        
            byte[] imageBytes = Files.readAllBytes(Path.of(resource.getURI()));

        
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            headers.setContentLength(imageBytes.length);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        } catch (IOException e) {
        
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 

       @GetMapping("/arquitecturaGeneral/modeloDatos.jpeg")
    public ResponseEntity<byte[]> getImageDatos() {
        try {
            
            Resource resource = new ClassPathResource("/static/imagenes/arquitecturaGeneral/modeloDatos.jpeg");

        
            byte[] imageBytes = Files.readAllBytes(Path.of(resource.getURI()));

        
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            headers.setContentLength(imageBytes.length);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        } catch (IOException e) {
        
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 

        @GetMapping("/descripcion.jpg")
    public ResponseEntity<byte[]> getImageImagenes() {
        try {
            
            Resource resource = new ClassPathResource("/static/imagenes/imagenes/descripcion.jpg");

        
            byte[] imageBytes = Files.readAllBytes(Path.of(resource.getURI()));

        
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            headers.setContentLength(imageBytes.length);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        } catch (IOException e) {
        
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}