package Controller;

import Model.*;
import Service.AdminService;
import Service.CommonService;
import Service.LibrarianService;
import Service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("page");
        System.out.println(action);

        if (action.equalsIgnoreCase("admin")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + " " + password + " ");
            AdminService ss = new AdminService();
            Admin admin = ss.getUser(username, password);
//            System.out.println(user.getUsername()+" "+user.getPassword());
            if (admin != null) {
                HttpSession session = request.getSession();
                session.setAttribute("admin", admin);
                //                    System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
                session.setAttribute("user", "admin" );

                RequestDispatcher rd = request.getRequestDispatcher("WebPages/Dashboard/admin.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }
        if (action.equalsIgnoreCase("aregister")) {
            Admin admin = new Admin();
            System.out.println(request.getParameter("name"));
            admin.setAdminName(request.getParameter("name"));
            admin.setAdminMob(Integer.parseInt(request.getParameter("phone")));
            admin.setAdminEmail(request.getParameter("email"));
            admin.setAdminUsername(request.getParameter("username"));
            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            if(pass.equals(cpass))  {
                admin.setAdminPass(pass);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/adminregister.jsp");
                rd.forward(request, response);
            }

            new AdminService().insertAdmin(admin);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("lregister")) {
            Librarian librarian = new Librarian();
            System.out.println(request.getParameter("name"));
            librarian.setLibrarianName(request.getParameter("name"));
            librarian.setLibrarianMob(Integer.parseInt(request.getParameter("phone")));
            librarian.setLibrarianEmail(request.getParameter("email"));
            librarian.setLibrarianUsername(request.getParameter("username"));

            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            if(pass.equals(cpass))  {
                librarian.setLibrarianPass(pass);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/librarianregister.jsp");
                rd.forward(request, response);
            }
            new AdminService().insertLibrarian(librarian);
            RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("newAdmin")) {
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/adminregister.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("newLibrarian")) {
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/librarianregister.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("logout")) {
            HttpSession session = request.getSession(false);
            session.invalidate();
            request.setAttribute("msg", "Logout Success");
            System.out.println(request.getAttribute("msg"));
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

        if (action.equalsIgnoreCase("listAdmin")) {
            Admin user = new Admin();
            List<Admin> userList = new CommonService().getAdminList();
            request.setAttribute("adminList", userList);
            request.setAttribute("admin", user);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/adminList.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("listLibrarian")) {
            Librarian user = new Librarian();
            List<Librarian> userList = new CommonService().getLibrarianList();
            request.setAttribute("librarianList", userList);
            request.setAttribute("librarian", user);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/librarianList.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("listStaff")) {
            Staff user = new Staff();
            List<Staff> userList = new CommonService().getStaffList();
            request.setAttribute("staffList", userList);
            request.setAttribute("staff", user);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/staffList.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("listTeacher")) {
            Teacher user = new Teacher();
            List<Teacher> userList = new CommonService().getTeacherList();
            request.setAttribute("teacherList", userList);
            request.setAttribute("teacher", user);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/teacherList.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("listStudent")) {
            Student user = new Student();
            List<Student> userList = new CommonService().getStudentList();
            request.setAttribute("studentList", userList);
            request.setAttribute("student", user);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/studentList.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("listBook")) {
            Book book = new Book();
            List<Book> bookList = new CommonService().getBookList();
            request.setAttribute("bookList", bookList);
            request.setAttribute("book", book);
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/List/bookList.jsp");
            rd.forward(request, response);
        }

    }
}
