package co.grandcircus.aVeryMehRPG.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.aVeryMehRPG.entity.SaveData;

@Repository
@Transactional
public class SaveDao {

	@PersistenceContext
	EntityManager em;
	
	public SaveData findbyId(Long id) {
		return em.find(SaveData.class,id);
	}
	
	public void create(SaveData SaveData) {
		em.persist(SaveData);
		
	}
	public void update(SaveData SaveData) {
		em.merge(SaveData);
	}
	
	public void delete(Long id) {
		SaveData SaveData = em.getReference(SaveData.class, id);
		em.remove(SaveData);
	}
	
	
	
	
	
	
}
