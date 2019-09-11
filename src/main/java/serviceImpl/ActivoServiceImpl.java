package serviceImpl;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.com.Activo;
import repository.com.ActivoRepository;
import service.com.ActivoService;

@Service
public class ActivoServiceImpl implements ActivoService {

	@Autowired
	private ActivoRepository activoRepository;

	/**
	 * 
	 */
	@Override
	public List<Activo> getAllActivo() throws Exception {
		try {
			return activoRepository.findAll();
		} catch (Exception e) {
			Logger.getLogger(ActivoServiceImpl.class.getName()).log(Logger.Level.ERROR, e);
			throw new Exception("Error inesperado");
		}
	}

	/**
	 * 
	 */
	@Override
	public boolean createActivo(Activo activo) throws Exception {
		try {
			return (activoRepository.save(activo) != null) ? true : false;
		} catch (Exception e) {
			Logger.getLogger(ActivoServiceImpl.class.getName()).log(Logger.Level.ERROR, e);
			throw new Exception("Error inesperado");
		}
	}

	/**
	 * 
	 */
	@Override
	public boolean editActivo(Activo activo) throws Exception {
		try {
			return (activoRepository.save(activo) != null) ? true : false;
		} catch (Exception e) {
			Logger.getLogger(ActivoServiceImpl.class.getName()).log(Logger.Level.ERROR, e);
			throw new Exception("Error inesperado");
		}
	}

	/**
	 * 
	 */
	@Override
	public boolean deleteActivo(int activo) throws Exception {
		try {
			Long id= new Long(activo);
			//return (activoRepository.delete(activoRepository.findById(id)) != null) ? true : false;
			return false;
		} catch (Exception e) {
			Logger.getLogger(ActivoServiceImpl.class.getName()).log(Logger.Level.ERROR, e);
			throw new Exception("Error inesperado");
		}
	}

}
