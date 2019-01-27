package pl.clockworkjava.advanced.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAApp {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClockworkPersistence");
        EntityManager entityManager = factory.createEntityManager();
    }
}
