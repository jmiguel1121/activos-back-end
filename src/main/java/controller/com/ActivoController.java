package controller.com;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.com.Activo;
import service.com.ActivoService;

@RestController
@RequestMapping("/api/es-activo/v1/")
public class ActivoController {

	@Autowired
	private ActivoService activoService;

	/**
	 * get all activos from database
	 * 
	 * @throws Exception
	 */
	@GetMapping("/activos")
	public List<Activo> getAllActivos() throws Exception {
		return activoService.getAllActivo();
	}

	/**
	 * create activo from database
	 */
	@PostMapping("/activos")
	public void createActivo(@RequestBody @Valid Activo activo) {
		try {
			activoService.createActivo(activo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * update activo from database
	 */
	@PutMapping("/activos")
	public void editActivo(@RequestBody @Valid Activo activo) {
		try {
			activoService.editActivo(activo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * delete activo from database
	 */
	@DeleteMapping("/activos/{id}")
	public void deleteActivo(@PathVariable("id") int activo) {
		try {
			activoService.deleteActivo(activo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
