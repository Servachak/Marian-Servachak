package DaoImplements;

import java.util.List;

import javax.persistence.EntityManager;

import com.flover_shop.entity.Country;
import com.flover_shop.entity.Flower;
import com.flower_shop.dao.CountryDao;

public class CountyDaoImplemrnt implements CountryDao{
	
	private EntityManager entityManager;
	

	public CountyDaoImplemrnt(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Country country) {
		entityManager.getTransaction().begin();
		entityManager.persist(country);
		entityManager.getTransaction().commit();
		
	}

	public List<Country> findAll() {


		entityManager.getTransaction().begin();
		List<Country> countrys = entityManager.createQuery("from Country").getResultList();
		entityManager.getTransaction().commit();
		return countrys;
	}

	public Country fineOne(String name) {
		entityManager.getTransaction().begin();
		Country country = null;
		
		try{
		 country = (Country) entityManager.createQuery("select c from Country c where c.name =:value");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return country;
	}

	public void remove(String name) {
	    Country country = fineOne(name); 
		entityManager.getTransaction().begin();
	     entityManager.remove(country);
	     entityManager.getTransaction().commit();
		
	}

	public void update(Country country) {
		entityManager.getTransaction().begin();
		entityManager.merge(country);
		entityManager.getTransaction().commit();
		
		
	}

	public void addFlowerToCountry(Flower flower, Country country) {
	       entityManager.getTransaction().begin();
	       
	       flower.getCountrys().add(country);
	       entityManager.merge(flower);
	       entityManager.getTransaction().commit();
		
	}

}
