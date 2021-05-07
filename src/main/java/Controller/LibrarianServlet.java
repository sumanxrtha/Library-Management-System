package Controller;

import Model.Student;
import Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LibrarianServlet", value = "/LibrarianServlet")
public class LibrarianServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("page");
        System.out.println(action);

        if (action.equalsIgnoreCase("librarian")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + " " + password + " ");
            StudentService ss = new StudentService();
            Student librarian = ss.getUser(username, password);
//            System.out.println(user.getUsername()+" "+user.getPassword());
            if (librarian != null) {
                HttpSession session = request.getSession();
                session.setAttribute("librarian", librarian);
                //                    System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
                session.setAttribute("page", "librarian" );

                RequestDispatcher rd = request.getRequestDispatcher("WebPages/Dashboard/librarian.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }


    }
}
