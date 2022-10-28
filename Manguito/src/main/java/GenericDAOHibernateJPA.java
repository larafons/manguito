import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T>{

	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class<T> clase) {
		this.persistentClass = clase;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	@Override
	public void borrar(Object entity) {
		 EntityManager em = EMF.getEMF().createEntityManager();
		 EntityTransaction tx = null;
		 try {
		 tx = em.getTransaction();
		 tx.begin();
		 em.remove(em.merge(entity));
		 tx.commit();
		 }
		 catch (RuntimeException e) {
		 if ( tx != null && tx.isActive() ) tx.rollback();
		 throw e; // escribir en un log o mostrar un mensaje
		 } finally {
		 em.close();
		 }
	}

	@Override
	public T borrar(Serializable id) {
		 EntityManager em = EMF.getEMF().createEntityManager();
		 T entity=em.find(this.getPersistentClass(), id);
		 if (entity != null) {
		 em.remove(entity);
		 }
		 em.close();
		 return entity;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		 EntityManager em = EMF.getEMF().createEntityManager();
		 EntityTransaction tx = null;
		 try {
		 tx = em.getTransaction();
		 tx.begin();
		 em.persist(entity);
		 tx.commit();
		 }
		 catch (RuntimeException e) {
		 if ( tx != null && tx.isActive() ) tx.rollback();
		 throw e; // escribir en un log o mostrar un mensaje
		 }
		 finally {
		 em.close();
		 }
		 return entity;
	}

	@Override
	public T recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> recuperarTodos(String column) {
		Query consulta=
				 EMF.getEMF().createEntityManager().createQuery("select e from "+ getPersistentClass().
						 getSimpleName()+" e order by e."+column);
				 List<T> resultado = (List<T>)consulta.getResultList();
				 return resultado;
	}

	@Override
	public void actualizar(T entity) {
		EntityManager em= EMF.getEMF().createEntityManager();
		 EntityTransaction etx= em.getTransaction();
		 etx.begin();
		 T e = em.merge(entity);
		 etx.commit();
		 em.close();
	}

}
