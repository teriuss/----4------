package com.example.tables;
import com.example.tables.models.Post;
import com.example.tables.utils.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_RESET = "\u001b[0m";

    public static void main(String[] args) {
        //сразу получаем готовый SessionFactory и сразу создаем сессию
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Open transaction
//        session.getTransaction();
//        Post post = session.get(Post.class, 1);
//        System.out.println("\u001b[32m"+post+"\u001b[0m");

//        Post post = new Post();
//        post.setPost("manager");
//        post.setSalary(38000);
//
//        session.save(post);
//        //Save changes
//        session.getTransaction().commit();


        session.close();
        HibernateUtil.shutdown();
    }



}
