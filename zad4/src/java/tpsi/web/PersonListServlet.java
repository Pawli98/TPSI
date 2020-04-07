/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.web;
/**
 *
 * @author gp41370
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet 
{

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
        
         response.setContentType("text/html;charset=UTF-8");
        List<Person> osoby = new ArrayList<>();
        Person a1,a2,a3,a4,a5;
        a1 = new Person("Marek","Kazlik","asdasasd@zut.edu.pl");
        a2=new Person("Kasia ","Wolis","asfasf@zut.edu.pl");
        a3 = new Person("Paweł","Gawel","wqwfs@zut.edu.pl");
        a4 = new Person("weronika","kusik","sdsds@zut.edu.pl");
        a5 = new Person("Maciek","Dobrych","sdafs@zut.edu.pl");
        
        osoby.add(a1);
        osoby.add(a2);
        osoby.add(a3);
        osoby.add(a4);
        osoby.add(a5);
        
         request.setAttribute("osoby", osoby);
         request.getRequestDispatcher("personList.jsp").forward(request, response);
    }
}
