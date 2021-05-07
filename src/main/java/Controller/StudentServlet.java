package Controller;

import Model.Student;
import Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String action = request.getParameter("page");
        System.out.println(action);

        if (action.equalsIgnoreCase("student")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + " " + password + " ");
            StudentService ss = new StudentService();
            Student student = ss.getUser(username, password);
//            System.out.println(user.getUsername()+" "+user.getPassword());
            if (student != null) {
                HttpSession session = request.getSession();
                session.setAttribute("student", student);
                //                    System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
//                session.setAttribute("page", "dashboard" );

                RequestDispatcher rd = request.getRequestDispatcher("WebPages/student.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }
        if (action.equalsIgnoreCase("register")) {
            Student student = new Student();
            System.out.println(request.getParameter("name"));
            student.setStudentName(request.getParameter("name"));

            student.setStudentMob(Integer.parseInt(request.getParameter("phone")));

            student.setStudentEmail(request.getParameter("email"));
            student.setStudentUsername(request.getParameter("username"));
            student.setFaculty(request.getParameter("faculty"));

            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            if(pass.equals(cpass))  {
                student.setStudentPass(pass);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/studentregister.jsp");
                rd.forward(request, response);
            }

            student.setStudentRoll(Integer.parseInt(request.getParameter("roll")));
            student.setSemester(Integer.parseInt(request.getParameter("semester")));
/*
for date parser
            java.util.Date date = null;
            try {
                date = new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("date"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            student.setAdmissionDate(sqlDate);
*/

            java.sql.Date adDate=null;
            try {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
                System.out.println(date);
                adDate = new java.sql.Date(date.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(adDate);


            student.setAdmissionDate(adDate);

            new StudentService().insertStudent(student);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("newStudent")) {
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/studentregister.jsp");
            rd.forward(request, response);
        }
    }
}
