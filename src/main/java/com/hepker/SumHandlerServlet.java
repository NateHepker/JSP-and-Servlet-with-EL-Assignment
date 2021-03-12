package com.hepker;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This servlet handles the logic for adding 2 numbers together and getting them
 * to display.
 *
 * @author Nate_Hepker
 */
@WebServlet(name = "SumHandlerServlet", urlPatterns = {"/Sum"})

public class SumHandlerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        SumModel sumModel = new SumModel();
        if (firstNum != null && secondNum != null) {
            sumModel = new SumModel(firstNum, secondNum);
            String message = sumModel.getMessage();
            sumModel.sumNums();
        }
        //add the sum model to the request
        request.getRequestDispatcher("/addTwo.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void procAddTwoForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        SumModel sumModel = new SumModel();
        String message = sumModel.getMessage();
        

    }
}
