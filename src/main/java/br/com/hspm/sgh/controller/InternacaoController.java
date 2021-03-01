package br.com.hspm.sgh.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.InternacaoDto;
import br.com.hspm.sgh.model.Internacao;

@RestController
@RequestMapping("/hspmsgh-api/internacoes")
public class InternacaoController {

	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Internacao>> getInternacoesAlta(int tipo ,String dt_inicio, String dt_fim){
			// tipo = 1 - consulta por data da alta
			// tipo = 2 - consulta por data da internacao
				
			List<Internacao> internacoes = InternacaoDto.Internacoes(tipo, dt_inicio, dt_fim);
			
			if(internacoes == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(internacoes);
	}
	
	//@GetMapping("/")
	//public ResponseEntity<List<Internacao>> getInternacoes(){
		
	//	List<Internacao> internacoes = InternacaoDto.Internacoes();
		
		
	//	if(internacoes == null) {
	//		return ResponseEntity.notFound().build();
	//	}
	//	return ResponseEntity.ok(internacoes);
	//}
	
	
	// TODO: Fazer parametros de consulta
	//  @RequestMapping(path = "/mno/objectKey/{id}/{name}", method = RequestMethod.GET)
	// public Book getBook(@PathVariable int id, @PathVariable String name) {
	    // code here
	// }
	
}