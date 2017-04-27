package edu.dmacc.erickson.suggestionbox;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SuggestionDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SuggestionBox");
	
	public void insertSuggestion(Suggestion suggestionToAdd){
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(suggestionToAdd);
		em.getTransaction().commit();
		em.close();
		//emfactory.close();
		
	}

	public List<Suggestion> getAllSuggestions() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select s from Suggestion s";
		TypedQuery<Suggestion> typedQuery = em.createQuery(q, Suggestion.class);
		List<Suggestion> all = typedQuery.getResultList();
		
		//em.getTransaction().commit();
		/*em.close();
		emfactory.close();*/
		
		return all;
	}
}
