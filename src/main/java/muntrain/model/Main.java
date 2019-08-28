package muntrain.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	static EntityManagerFactory emf;
	static EntityManager manager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// manager (gestor de persistencia)
		
			emf = Persistence.createEntityManagerFactory("muntrain_orienteering_game");
			persistProductos();
	}
			
		private static void persistProductos() {
			initializeManager();
			
			User u1 = new User();
			
			try{
				manager.getTransaction().begin();   
				manager.persist(u1); 
				manager.getTransaction().commit();    
			}catch(Exception ex){
				ex.printStackTrace();
				manager.getTransaction().rollback();   
			}finally{
				closeManager();
			}		
		}

		
		
		private static void closeManager() {
			manager.close();
		}

		private static void initializeManager() {
			manager = emf.createEntityManager();
		}
		


}
