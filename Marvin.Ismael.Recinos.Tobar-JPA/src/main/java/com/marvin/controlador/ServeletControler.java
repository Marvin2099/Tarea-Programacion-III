package com.marvin.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import com.google.gson.Gson;
import com.marvin.DAO.ClienteDAO;
import com.marvin.model.Cliente;


/**
 * Servlet implementation class ServeletControler
 */
public class ServeletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cliente cl = new Cliente();
		ClienteDAO cld = new ClienteDAO();
		String id=null;
		String nombre=null;
		String apellido=null; 
		String edad=null; 
		String direccion=null;
		String dui=null;
		String nit=null; 
		String grupoDeClaseProgramacion3Alquepertenece=null; 
		String ultimaNotaObtenidaEnProgramacion2=null; 
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		id= request.getParameter("Id");
		nombre= request.getParameter("Nombre");
		apellido= request.getParameter("Apellido");
		edad= request.getParameter("Edad");
		direccion= request.getParameter("Direccion");
		dui= request.getParameter("Dui");
		nit= request.getParameter("Nit");
		grupoDeClaseProgramacion3Alquepertenece= request.getParameter("grupoDeClaseProgramacion3Alquepertenece");
		ultimaNotaObtenidaEnProgramacion2= request.getParameter("ultimaNotaObtenidaEnProgramacion2");
		
		 cl.setId(Integer.parseInt(id));
		 cl.setNombre(nombre);
		 cl.setApellido(apellido);
		 cl.setEdad(Integer.parseInt(edad));
		 cl.setDireccion(direccion);	
		 cl.setDui(dui);
		 cl.setNit(nit);
		 cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		 cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		String acction=request.getParameter("btn");
		
		if(acction.equals("GUARDAR")) {	 
		 cl.setId(Integer.parseInt(id));
		 cl.setNombre(nombre);
		 cl.setApellido(apellido);
		 cl.setEdad(Integer.parseInt(edad));
		 cl.setDireccion(direccion);	
		 cl.setDui(dui);
		 cl.setNit(nit);
		 cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		 cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		 	 
		 cld.agregarDatos(cl);
		 	 
		 }
		 else if(acction.equals("ACTUALIZAR")){
			 cl.setId(Integer.parseInt(id));
			 cl.setNombre(nombre);
			 cl.setApellido(apellido);
			 cl.setEdad(Integer.parseInt(edad));
			 cl.setDireccion(direccion);	
			 cl.setDui(dui);
			 cl.setNit(nit);
			 cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
			 cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		 
			 cld.actualizarDatos(cl);
		 }else if(acction.equals("ELIMINAR")) {
			 cl.setId(Integer.parseInt(id));
			 cld.eliminarDatos(cl);
		 }
		 response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteDAO cldao = new ClienteDAO();
		
	    Gson json = new Gson();
	    
	    try {
			
	    	response.getWriter().append(json.toJson(cldao.clienteLista()));
	    	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
