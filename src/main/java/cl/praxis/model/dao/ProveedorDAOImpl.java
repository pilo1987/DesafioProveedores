package cl.praxis.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.model.conexion.Conexion;
import cl.praxis.model.dto.ProveedorDTO;

public class ProveedorDAOImpl implements ProveedorDAO {

	public void create(ProveedorDTO a) {

		try {

			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "INSERT INTO proveedores (nombre,rut,direccion,correo,telefono,contacto,telefono_contacto) VALUES (?,?,?,?,?,?,?)";

			ResultSet rs = s.executeQuery(sql);
			try (PreparedStatement stmt = c.prepareStatement(sql)) {
				
				stmt.setString(1, a.getNombre());
				stmt.setString(2, a.getRut());
				stmt.setString(3, a.getDireccion());
				stmt.setString(4, a.getCorreo());
				stmt.setString(5, a.getTelefono());
				stmt.setString(6, a.getContacto());
				stmt.setString(7, a.getTelefono_contacto());

				stmt.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println("ERROR EN METODO CREATE ()");
			e.printStackTrace();
		}
	}

	public ProveedorDTO read(int id) {
		
		ProveedorDTO a = null;
		
		try {
			
			Connection c = Conexion.getCon();
			
			Statement s = c.createStatement();
			String sql ="select id, nombre, rut, direccion, correo, telefono, contacto,telefono_contacto from proveedores where id = " + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			if (rs.next()) {
				a = new ProveedorDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut")
						, rs.getString("direccion"), rs.getString("correo")
						, rs.getString("telefono"), rs.getString("contacto"),rs.getString("telefono_contacto"));
			}
			
		}	catch (SQLException e) {
			System.out.println("ERROR EN METODO READ (id)");
			e.printStackTrace();
		}
		return a;
	}

	public List<ProveedorDTO> read() {

		List<ProveedorDTO> proveedores = new ArrayList<ProveedorDTO>();

		try {

			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "SELECT id,nombre,rut,direccion,correo,telefono,contacto,telefono_contacto FROM proveedores";

			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				ProveedorDTO a = new ProveedorDTO();
				a.setId(rs.getInt("id"));
				a.setNombre(rs.getString("nombre"));
				a.setRut(rs.getString("rut"));
				a.setDireccion(rs.getString("direccion"));
				a.setCorreo(rs.getString("correo"));
				a.setTelefono(rs.getString("telefono"));
				a.setContacto(rs.getString("contacto"));
				a.setTelefono_contacto(rs.getString("telefono_contacto"));

				proveedores.add(a);
			}

		} catch (SQLException e) {
			System.out.println("ERROR EN METODO READ ()");
			e.printStackTrace();
		}

		return proveedores;
	}

	public void update(ProveedorDTO a) {

	}

	public String delete(int id) {
	
			try {
				Connection c = Conexion.getCon();
				
				Statement s = c.createStatement();
				String sql ="delete FROM proveedores WHERE id = " + id;
				s.executeUpdate(sql);

			} catch(SQLException e) {
				System.out.println("ERROR EN METODO DELETE ()");
				e.printStackTrace();
			}
			return "borrado exitosamente";
	}
}
