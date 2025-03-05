package gestorPrueba;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Objects.Products;
import Objects.Users;
import almacenamiento.hibernate.utils.HibernateUtil;


public class GestorUsuarios {

	public List<Products> getAll() {
		    List<Products> ret = null;
		    String hql = "from Products";
		    Session session = null;
		    Transaction transaction = null;

		    try {
		        session = HibernateUtil.getSessionFactory().openSession();
		        
		        transaction = session.beginTransaction();

		        Query query = session.createQuery(hql);
		        ret = query.list();  
		        
		        transaction.commit();
		    } catch (Exception e) {
		        if (transaction != null) {
		            transaction.rollback();
		        }
		        System.out.println("Error: " + e.getMessage());
		    } finally {
		        if (session != null) {
		            session.close();  
		        }
		    }

		    return ret;
		}

}
