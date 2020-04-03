package com.marvin.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import javax.xml.bind.ParseConversionEvent;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acction=request.getParameter("btn");
		EntityManager em;
		EntityManagerFactory emf;
		 
		emf = Persistence.createEntityManagerFactory("Marvin.Ismael.Recinos.Tobar-JPA");
		em = emf.createEntityManager();
		Cliente cl = new Cliente();
		try {
     	String id= request.getParameter("Id");
		String nombre = request.getParameter("Nombre");
		String apellido = request.getParameter("Apellido");
		String edad = request.getParameter("Edad");
		String direccion = request.getParameter("Direccion");
		String dui = request.getParameter("Dui");
		String nit = request.getParameter("Nit");
		String grupoDeClaseProgramacion3Alquepertenece = request.getParameter("grupoDeClaseProgramacion3Alquepertenece");
		String ultimaNotaObtenidaEnProgramacion2 = request.getParameter("ultimaNotaObtenidaEnProgramacion2");
		
		 
		 cl.setId(Integer.parseInt(id));
		 cl.setNombre(nombre);
		 cl.setApellido(apellido);
		 cl.setEdad(Integer.parseInt(edad));
		 cl.setDireccion(direccion);	
		 cl.setDui(dui);
		 cl.setNit(nit);
		 cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grupoDeClaseProgramacion3Alquepertenece));
		 cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(ultimaNotaObtenidaEnProgramacion2));
		 
		 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(acction.contentEquals("AGREGAR")) {
			
			em.getTransaction().begin();
	        em.persist(cl);
			em.flush();
			em.getTransaction().commit();
				
			
		}else if(acction.equals("ELIMINAR")) {
			
		    
		 
		     cl = em.getReference(Cliente.class, cl.getId());
		    em.getTransaction().begin();
		     em.remove(cl);
		  	 em.flush();
		  	 em.getTransaction().commit();
			
			
			
		}else if (acction.equals("MODIFICAR")) {
			
		  em.getTransaction().begin();  
		  em.merge(cl);
		  em.flush();
		  em.getTransaction().commit();
			
			
			
		}
		response.sendRedirect("index.jsp");
	}

}
