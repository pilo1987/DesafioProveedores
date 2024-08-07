package cl.praxis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedorDAO;
import cl.praxis.model.dao.ProveedorDAOImpl;
import cl.praxis.model.dto.ProveedorDTO;

@WebServlet("/ProveedorController")
public class ProveedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProveedorController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProveedorDAO aDAO = new ProveedorDAOImpl();

		List<ProveedorDTO> proveedores = aDAO.read();

		request.setAttribute("proveedores", proveedores);

		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProveedorDAO aDAO = new ProveedorDAOImpl();
		
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String contacto = request.getParameter("contacto");
		String telefono_contacto = request.getParameter("telefono_contacto");
		
		ProveedorDTO proveedor = new ProveedorDTO();
	  
	    proveedor.setNombre(nombre);
	    proveedor.setRut(rut);
	    proveedor.setDireccion(direccion);
	    proveedor.setCorreo(correo);
	    proveedor.setTelefono(telefono);
	    proveedor.setContacto(contacto);
	    proveedor.setTelefono_contacto(telefono_contacto);
	    
	    aDAO.create(proveedor);
		
		doGet(request, response);
	}
}
