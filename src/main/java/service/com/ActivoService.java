package service.com;

import java.util.List;
import org.springframework.stereotype.Service;
import Model.com.Activo;

@Service
public interface ActivoService {

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Activo> getAllActivo() throws Exception;

	/**
	 * 
	 * @param activo
	 * @throws Exception
	 */
	public boolean createActivo(Activo activo) throws Exception;
	
	/**
	 * 
	 * @param activo
	 * @return
	 * @throws Exception
	 */
	public boolean editActivo(Activo activo) throws Exception;

	/**
	 * 
	 * @param activo
	 * @return
	 * @throws Exception
	 */
	public boolean deleteActivo(int activo) throws Exception;
}
