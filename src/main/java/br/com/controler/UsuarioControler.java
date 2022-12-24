package br.com.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.enteties.Usuario;

/*Controlador rest*/
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioControler {
	
	/*Retorna respostas de requisiçoes web*/
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Eduardo Emmanuel", "eduardo.eesf@gmail.com", "83998699835", "123");
		
		return ResponseEntity.ok().body(u);
	}

}
