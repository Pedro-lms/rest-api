package rest.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rest.api.model.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

	/*Serviço Restful*/
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<Usuario> init() {
		
		Usuario usuario = new Usuario();
		usuario.setId(25L);
		usuario.setLogin("pedro@gmail.com");
		usuario.setNome("Pedro");
		usuario.setSenha("Ahhhh pronto kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		Usuario pedro = new Usuario();
		pedro.setId(50L);
		pedro.setLogin("pedromachado@gmail.com");
		pedro.setNome("Pedro");
		pedro.setSenha("Ahhhh pronto kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		usuarios.add(pedro);
		
		return  new ResponseEntity(usuarios, HttpStatus.OK);
	}
}
