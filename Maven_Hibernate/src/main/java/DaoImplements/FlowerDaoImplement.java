package DaoImplements;

import java.util.List;

import javax.persistence.EntityManager;

import com.flover_shop.entity.Flower;
import com.flover_shop.entity.Orders;
import com.flower_shop.dao.FlowerDao;

public class FlowerDaoImplement implements FlowerDao {

	private final EntityManager entityManager;
	
	
	public FlowerDaoImplement(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Flower flower) {
		entityManager.getTransaction().begin();
		entityManager.persist(flower);
		entityManager.getTransaction().commit();
		
	}

	public List<Flower> fineAll() {
		entityManager.getTransaction().begin();
		
		List<Flower> flowers = entityManager.createQuery("from Flower").getResultList();
		
		entityManager.getTransaction().commit();
		return flowers;
	}

	public Flower findOne(String name) {
		
		entityManager.getTransaction().begin();
		Flower flower = null;
		try{
		 flower = (Flower) entityManager.createQuery("select f from Flower f where f.name =:value").setParameter("value", name).getSingleResult();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		return flower;
	}

	public void remove(String name) {
		Flower flower = findOne(name);
		entityManager.getTransaction().begin();
		entityManager.remove(flower);
		entityManager.getTransaction().commit();
	}

	public void update(Flower flower) {
		entityManager.getTransaction().begin();
		entityManager.merge(flower);
		entityManager.getTransaction().commit();
		
	}

	public void addFloverToOrders(Flower flower, Orders orders) {
		 
		entityManager.getTransaction().begin();
		
		flower.getOrders().add(orders);
		
		entityManager.merge(flower);
		entityManager.getTransaction().commit();
	}

}
