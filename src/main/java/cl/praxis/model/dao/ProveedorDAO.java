package cl.praxis.model.dao;

import java.util.List;
import cl.praxis.model.dto.ProveedorDTO;

public interface ProveedorDAO {
	
	void create(ProveedorDTO a); 
	ProveedorDTO read(int id);
	List<ProveedorDTO> read();
	void update(ProveedorDTO a);
	String delete(int id);

}
