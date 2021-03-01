package br.com.hspm.sgh.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hspm.sgh.controller.dto.CensoDto;
import br.com.hspm.sgh.model.Censo;

@RestController
@RequestMapping("/hspmsgh-api/censo")
public class CensoController {
	
	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Censo>> getCenso(){
							
			List<Censo> c = CensoDto.getListaCenso();
			
			if(c == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(c);
	}

}
