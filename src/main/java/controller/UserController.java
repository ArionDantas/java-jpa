package controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import model.User;
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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        User user = new User();
        acao = request.getParameter("acao");
        if (acao.equals("cadastrar")) {

            user.setAge(Integer.parseInt(request.getParameter("txtAge")));
            Date d = new Date();
            user.setCreateAt(d);
            user.setName(request.getParameter("txtName"));
            user.setSurname(request.getParameter("txtSurname"));

            abrir = "index.jsp";

        }
        RequestDispatcher visualizar = request.getRequestDispatcher(abrir);
        visualizar.forward(request, response);
    }
}