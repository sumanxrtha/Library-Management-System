package Controller;

import Hashing.HashingPassword;
import Model.Staff;
import Service.StaffService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StaffServlet", value = "/StaffServlet")
public class StaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("page");
        System.out.println(action);
        System.out.println("i am at "+ action);

        if (action.equalsIgnoreCase("loginStaff")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            System.out.println(username + " " + password + " ");
            System.out.println("this is staff");

            StaffService ss = new StaffService();
            Staff staff = ss.getUser(username, password);
            if (staff != null) {
                HttpSession session = request.getSession();
                session.setAttribute("staff", staff);
                //                    System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));

                RequestDispatcher rd = request.getRequestDispatcher("WebPages/Dashboard/staff.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }

        }
        if (action.equalsIgnoreCase("register")) {
            Staff staff = new Staff();
            System.out.println(request.getParameter("name"));
            staff.setStaffName(request.getParameter("name"));
            staff.setStaffMob(Integer.parseInt(request.getParameter("phone")));
            staff.setStaffEmail(request.getParameter("email"));
            staff.setStaffUsername(request.getParameter("username"));

            String pass = request.getParameter("password");
            String cpass = request.getParameter("cpassword");
            if(pass.equals(cpass))  {
                staff.setStaffPass(HashingPassword.hashPassword(pass));
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/staffregister.jsp");
                rd.forward(request, response);
            }

            new StaffService().insertStaff(staff);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        if (action.equalsIgnoreCase("newStaff")) {
            System.out.println("i am in newStaff");
            RequestDispatcher rd = request.getRequestDispatcher("WebPages/RegisterPages/staffregistration.jsp");
            rd.forward(request, response);
        }
    }
}
