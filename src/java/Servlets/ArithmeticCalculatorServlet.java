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
public class ArithmeticCalculatorServlet extends HttpServlet {

    public static boolean isNumeric(String str) { 
      try {  
        Double.parseDouble(str);  
        return true;
      } catch(NumberFormatException e){  
        return false;  
      }  
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //sets attributes from the two inputs
        String firstinput = request.getParameter("first_input");
        String secondinput = request.getParameter("second_input");
        
        request.setAttribute("firstInput", firstinput);
        request.setAttribute("secondInput", secondinput);
        
        //check if numeric, or empty, or null
        if (firstinput == null || firstinput == "" || (!isNumeric(firstinput)) || secondinput == null || secondinput == "" || (!isNumeric(secondinput))) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }


        
        String actionSelected = request.getParameter("action");
        Double answer = 0.0;
        
        switch (actionSelected) {
            case "+":
                answer = Double.parseDouble(firstinput) + Double.parseDouble(secondinput);
                break;
            case "-":
                answer = Double.parseDouble(firstinput) - Double.parseDouble(secondinput);
                break;
            case "*":
                answer = Double.parseDouble(firstinput) * Double.parseDouble(secondinput);
                break;
            case "/":
                answer = Double.parseDouble(firstinput) / Double.parseDouble(secondinput);
                break;
        }
        
        request.setAttribute("message", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

}
