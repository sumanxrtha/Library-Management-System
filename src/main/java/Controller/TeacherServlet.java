package Controller;

import Model.Teacher;
import Service.TeacherService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TeacherServlet", value = "/TeacherServlet")
public class TeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("page");
        System.out.println(action);
        System.out.println("welcome to teacher controller");
        if (action.equalsIgnoreCase("teacher")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + " " + password + " ");
            TeacherService ss = new TeacherService();
            Teacher teacher = ss.getUser(username, password);
            //System.out.println(teacher.getTeacherUsername()+" "+teacher.getTeacherPass());
            if (teacher != null) {
                HttpSession session = request.getSession();
                session.setAttribute("teacher", teacher);
                //                    System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
//                session.setAttribute("page", "dashboard" );

                RequestDispatcher rd = request.getRequestDispatcher("WebPages/Dashboard/teacher.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }
        if (action.equalsIgnoreCase("register")) {
            Teacher teacher = new Teacher();
            System.out.println(request.getParameter("name"));
            teacher.setTeacherName(request.getParameter("name"));
            teacher.setTeacherMob(Integer.parseInt(request.getParameter("phone")));
            teacher.setTeacherEmail(request.getParameter("email"));
            teacher.setTeacherUsername(request.getParameter("username"));
            teacher.setFaculty(request.getParameter("faculty"));

            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            if(pass.equals(cpass))  {
                teacher.setTeacherPass(pass);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/teacherregister.jsp");
                rd.forward(request, response);
            }

            new TeacherService().insertTeacher(teacher);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

        if (action.equalsIgnoreCase("newTeacher")) {
            System.out.println("i was in newTeacher");
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/teacherregister.jsp");
            rd.forward(request, response);
        }
    }
}
