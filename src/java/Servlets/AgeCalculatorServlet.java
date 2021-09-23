package Servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
public class AgeCalculatorServlet extends HttpServlet {
    
    public static boolean isNumeric(String str) { 
      try {  
        Integer.parseInt(str);  
        return true;
      } catch(NumberFormatException e){  
        return false;  
      }  
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //capture parameters
        String inputage = request.getParameter("input_age");
        
        request.setAttribute("inputAge", inputage);
        
        //checking if the parameters exist. If not, displays message
        if (inputage == null || inputage.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        
        //checks if the input age is an integer
        if (!isNumeric(inputage)) {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        
        int currentage = Integer.parseInt(inputage);
        int nextage = currentage + 1;
        request.setAttribute("message", "Your age next year is " + nextage + ".");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }


}
