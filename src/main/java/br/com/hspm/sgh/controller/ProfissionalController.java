package br.com.hspm.sgh.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.ProfissionalDto;
import br.com.hspm.sgh.model.Profissional;


@RestController
@RequestMapping("/hspmsgh-api/profissional")
public class ProfissionalController {

	@CrossOrigin(origins="*")
	@GetMapping()
		public ResponseEntity<List<Profissional>> getProfissionais(){
			
			List<Profissional> profissionais = ProfissionalDto.Profissionais();
			
			
			if(profissionais == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(profissionais);
		}
}
