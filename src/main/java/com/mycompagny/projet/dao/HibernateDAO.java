/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompagny.projet.dao;

import com.mycompagny.projet.entity.Client;
import com.mycompagny.projet.util.HibernateUtil;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author thiba
 */ 


public class HibernateDAO {
    
    public HibernateDAO() {
    }

    public List<Client> clientlist(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Client");
        List<Client> clientList = query.list();
        
        for(int i =0; i<clientList.size(); i++){
            System.out.print(clientList.get(i).getClientId() + " / ");
            System.out.print(clientList.get(i).getFirstName() + " / ");
            System.out.print(clientList.get(i).getLastName() + " / ");
            System.out.print(clientList.get(i).getAddress() + " / ");
            System.out.print(clientList.get(i).getEmail() + " / ");
            System.out.print(clientList.get(i).getPhone() + " / ");
            System.out.print(clientList.get(i).getPhone() + " / ");
            System.out.print(clientList.get(i).getPassword() + " / ");
            System.out.println(clientList.get(i).getClientSessionId());
            
        }
        
        return clientList;
    }
    
    
    /*
    public void list() throws SQLException{
        
        Long lg = new Long(45);
        Long lg2 = new Long(05);
        
        Client cli = new Client(lg,"thibault", "dubois", "address", "0124547455", "email@@", lg2, "password");
        session.getCurrentSession().save(cli);

        
        List<Client> list = new ArrayList<Client>();
        Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetlo54", "root", "");
        Statement myStatement = myConnection.createStatement();

        ResultSet myResult = myStatement.executeQuery("select * from client");
        

       while(myResult.next()){
          
       }

        System.out.println("salut");
      /*  System.out.println(list.get(0).getFirstName());
        System.out.println(list.get(1).getFirstName());
        */
       // return list;

}

