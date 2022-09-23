/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kurt
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                            
        
        request.setAttribute("result", "---");
                            
                            
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

                    

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                request.setAttribute("result", "---");
                
                String result = "";
                String first = request.getParameter("first");
                String second = request.getParameter("second");
                String operation = request.getParameter("button");
                
                if(first == null||first.equals("")||second == null||second.equals("")){
                    result = "invalid";
                }
                else{
                    try{
                        if(operation.equals("+")){
                            result = ""+(Integer.parseInt(first)+Integer.parseInt(second));
                        }
                        else if(operation.equals("-")){
                            result = ""+(Integer.parseInt(first)-Integer.parseInt(second));
                        }
                         else if(operation.equals("*")){
                            result = ""+(Integer.parseInt(first)*Integer.parseInt(second));
                        }
                         else if(operation.equals("%")){
                            result = ""+(Integer.parseInt(first)%Integer.parseInt(second));
                        }
                    }
                    catch(NumberFormatException e){
                        result = "invalid";
                    }
                   
                }
        
        
        
        
        
        
                request.setAttribute("result", result);
        
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
