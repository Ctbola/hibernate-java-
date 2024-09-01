/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
@WebServlet(name = "SerchUser", urlPatterns = {"/SerchUser"})
public class SerchUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
//        User user = (User)session.load(User.class, 2);
//        System.out.println(user.getid());
//        System.out.println(user.getName());
//        System.out.println(user.getMobile());

//SELECT * FROM `user`
        Criteria criteria = session.createCriteria(User.class);
      
//        criteria.add(Restrictions.like("mobile", "075", MatchMode.START));
        ArrayList<User> userList = (ArrayList<User>) criteria.list();
        
        
        
        for(User user : userList ){
            System.out.println(user.getid());
            System.out.println(user.getName());
            System.out.println(user.getMobile());
            System.out.println(user.getCountry().getName());
        }
        
       session.close();
    }
}
