package javeriana.co.TallerWikiGroup.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Mensaje {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;

@Getter @Setter
 private String nombre;
 @Getter @Setter
 private String email;
 @Getter @Setter   
 private String telefono;
 @Getter @Setter 
 private String pagina;
 @Getter @Setter   
 private String asunto;
 @Getter @Setter  
private String texto;  
    
}
