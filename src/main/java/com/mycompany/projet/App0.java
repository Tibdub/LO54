/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet;

import com.mycompagny.projet.dao.HibernateDAO;
import com.mycompagny.projet.util.HibernateUtil;
import java.sql.SQLException;
import org.hibernate.Session;

/**
 *
 * @author thiba
 */
public class App0 {
        public static void main(String[] args) throws SQLException {
         
            HibernateDAO hibdao = new HibernateDAO();
            hibdao.clientlist();
            
        }
}