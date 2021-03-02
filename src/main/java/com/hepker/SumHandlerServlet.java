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
        String action = request.getParameter("action");
        if (action == null) {
            action = "goToForm";
        }
        switch (action) {
            case "addTwoForm":
                procAddTwoForm(request, response);
                break;
            case "addTwo":
                showAddTwo(request, response);
                break;
            case "goToForm":
            default:
                goToForm(request, response);
                break;
        }
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
        String action = request.getParameter("action");
        if (action == null) {
            action = "goToForm";
        }
        switch (action) {
            case "addTwo":
                showAddTwo(request, response);
                break;
            case "addTwoForm":
                procAddTwoForm(request, response);
                break;
            case "goToForm":
                goToForm(request, response);
                break;
        }
    }
    
    private void procAddTwoForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SumModel sumModel = new SumModel();
        String firstNum = request.getParameter("firstNumber");
        String secondNum = request.getParameter("secondNumber");
        String sum = request.getParameter("sum");

        request.setAttribute("firstNumber", firstNum);
        request.setAttribute("secondNumber", secondNum);
        request.setAttribute("sum", sum);

        response.sendRedirect("Sum?action=addTwo");

    }

    private void showAddTwo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNum = request.getParameter("firstNumber");
        String secondNum = request.getParameter("secondNumber");
        String sum = request.getParameter("sum");

        request.setAttribute("firstNumber", firstNum);
        request.setAttribute("secondNumber", secondNum);
        request.setAttribute("sum", sum);
        request.getRequestDispatcher("/WEB-INF/jsp/view/addTwo.jsp").forward(request, response);
        //response.sendRedirect("Sum?action=addTwo");
    }

    private void goToForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/view/addTwoForm.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
