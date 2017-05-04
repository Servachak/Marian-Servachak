package DaoImplements;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.flover_shop.entity.Orders;
import com.flover_shop.entity.User;
import com.flower_shop.dao.UserDao;

public class UserDaoImplement implements UserDao {

	private final EntityManager manager;
	
	
	
	public UserDaoImplement(EntityManager manager) {
		super();
		this.manager = manager;
	}

	public void save(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
	}

	public List<User> findAll() {
		
		manager.getTransaction().begin();
		List<User> users = manager.createQuery("from User").getResultList();
		manager.getTransaction().commit();
		return users;
	}

	public User findOne(String name) {
		manager.getTransaction().begin();
		User user = null;
		try{
			user = (User) manager.createQuery("select u from CUSTOMER where u.name =: value ").setParameter("value", name).getSingleResult();
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}catch(NonUniqueResultException e){
			System.out.println(e.getMessage());
		}
		manager.getTransaction().commit();
		return user;
	}

	public void removeUser(String name, String email) {
		manager.getTransaction().begin();
		
		User user = null;
		
		try{
			user = (User) manager.createQuery("select u from CUSTOMER u where u.name =: value1 and u.email =:value2 ")
					.setParameter("value1", name)
					.setParameter("value2", email)
					.getSingleResult();
			List<Orders> orders = user.getOrders();
			for (Orders o : orders) {
				o.setUser(null);
				manager.merge(o);
			}
			manager.remove(user);
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}catch(NonUniqueResultException e){
			System.out.println(e.getMessage());
		}
		manager.getTransaction().commit();
	}

	public void update(User user) {
		manager.getTransaction().begin();
		manager.merge(user);
		manager.getTransaction().commit();
		
	}

	public void addOrderToUser(User user, Orders orders) {
		manager.getTransaction().begin();
		orders.setUser(user);
		manager.getTransaction().commit();
		
	}

}
