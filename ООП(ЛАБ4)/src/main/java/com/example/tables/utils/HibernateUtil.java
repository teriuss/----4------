package com.example.tables.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

//Специальный Java class для инициализации Hibernate
public class HibernateUtil {
    private static final SessionFactory sessionFactory = init();
    // этот метод вызывается автоматически, т.к он вызывается из статичной переменной
    private static SessionFactory init(){
        try{
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Какая-то херня вылезла " + ex);
            //что делает эта строка
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null)
            init();
        return sessionFactory;}
    public static void shutdown(){
        getSessionFactory().close();
    }
}
