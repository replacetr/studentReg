package shaiful;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("action"));
		double icno = Double.parseDouble(request.getParameter("icno")); 
		if (request.getParameter("action").equals("delete") == true) {
			System.out.println("deleteting : " + icno);
			
			//continue to delete data
			
			DeleteData deleted = new DeleteData();
			int result = deleted.deleting(icno);
					
			request.setAttribute("deletedrows", result);	
		
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");      
	        view.include(request, response);
			
			
		}
		else {
			
		
		SelectData selected = new SelectData();
		ArrayList<Student> data = new ArrayList<Student>();
		data = selected.select(icno);
		request.setAttribute("data", data);
		RequestDispatcher view = request.getRequestDispatcher("/update.jsp");      
        view.include(request, response);
        
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
