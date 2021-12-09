package ru.lashes.spring_project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.lashes.spring_project.entity.Client;


import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO{


    // SessionFactory используется для получения объектов Session, которые используются для операций с базами данных. (Hibernate)
    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Client> getAllClients() {

        Session session = sessionFactory.getCurrentSession();

//        List<Client> allClients = session.createQuery("from Client"
//        , Client.class).getResultList();

        Query<Client> query = session.createQuery("from Client"
                , Client.class);
        List <Client> allClients = query.getResultList();
        return allClients;
    }
}
