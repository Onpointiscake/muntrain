package muntrain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import muntrain.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User x = new User(0, "usuario124", "fjkdf32K","email@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("muntrain_orienteering_game");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(x);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
