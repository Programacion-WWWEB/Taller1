package javeriana.co.TallerWikiGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javeriana.co.TallerWikiGroup.modelo.MensajeRepository;

@SpringBootApplication

public class TallerWikiGroupApplication {
    
	@Autowired
	private MensajeRepository mensajeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TallerWikiGroupApplication.class, args);
	}

}
