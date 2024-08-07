package cl.praxis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedorDAO;
import cl.praxis.model.dao.ProveedorDAOImpl;
import cl.praxis.model.dto.ProveedorDTO;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String strId = request.getParameter("id");
    		
    		int id = 0;
    		
    		if (strId != null) {
    			id = Integer.parseInt(strId);
    		}
    		
    		if (id > 0) {
    			
    			ProveedorDAO aDAO = new ProveedorDAOImpl();
    			
    			ProveedorDTO a = aDAO.read(id);
    			
    			request.setAttribute("proveedor", a);
    			
    			getServletContext().getRequestDispatcher("/updateproveedor.jsp").forward(request, response);
    		}else {
    			response.sendRedirect("error.html");
    		}
    	}

    	
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doGet(request, response);
    	}

    }