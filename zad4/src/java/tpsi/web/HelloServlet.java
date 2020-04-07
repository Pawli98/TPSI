package tpsi.web;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String imie,nazwisko,email;
        imie = request.getParameter("imie");
        nazwisko = request.getParameter("nazwisko");
        email = request.getParameter("email");
        response.setContentType("text/html;charset=UTF-8");

        
        Person a1=new Person(imie,nazwisko,email);
        request.setAttribute("obiekt", a1);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}