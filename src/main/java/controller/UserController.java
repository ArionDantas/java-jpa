package controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/user" })
public class UserController extends HttpServlet {

    private String acao, abrir;
    // private final String cadastrar = "cadastrar_aluno.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // acao = request.getParameter("acao");

        // if (acao.equals("cadastrar")) {
        //     abrir = "create_user.jsp";

        // }
        // RequestDispatcher visualizar = request.getRequestDispatcher(abrir);
        // visualizar.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        acao = request.getParameter("acao");
        if (acao.equals("cadastrar")) {
            abrir = "create_user.jsp";

        }
        RequestDispatcher visualizar = request.getRequestDispatcher(abrir);
        visualizar.forward(request, response);
    }
}