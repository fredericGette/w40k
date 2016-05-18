package com.w40k2.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.w40k2.dao.MyHibernate;
import com.w40k2.model.Figurine;
import com.w40k2.model.Role;

/**
 * Servlet implementation class FigurineServlet
 */
public class FigurineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FigurineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Role role1 = new Role("Big Mek");
		Role role2 = new Role("Big Boss");
		
		Figurine figurine1 = new Figurine();
		figurine1.setDefault_role(role1);
		figurine1.setRole(role1);
		figurine1.addPossibleRole(role1);
		figurine1.addPossibleRole(role2);

		Figurine figurine2 = new Figurine();
		figurine2.setDefault_role(role2);
		figurine2.setRole(role2);
		figurine2.addPossibleRole(role2);

		
		SessionFactory sf = MyHibernate.INSTANCE.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(role1);
		session.save(role2);
		session.save(figurine1);
		session.save(figurine2);
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
