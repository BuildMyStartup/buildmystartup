package com.bms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bms.service.vo.Creator;
import com.bms.service.vo.HibernateUtil;
import com.bms.service.vo.UserProfile;

public class CreatorDao {

	private final SessionFactory sessionFactory = getSessionFactory();
	
	protected SessionFactory getSessionFactory() {
		try {
			return HibernateUtil.getSessionFactory();
		} catch (Exception e) {
			//TODO: Will be logged at error level later
			System.out.println("Could not locate SessionFactory in JNDI" + e);
			
			throw new IllegalStateException(
			"Could not locate SessionFactory in JNDI");
		}
	}
	
	public void persist(Creator transientInstance) {
		//TODO: Will be logged at debug level later
		System.out.println("persisting GafContext instance");
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(transientInstance);
			transaction.commit();
			//TODO: Will be logged at debug level later
			System.out.println("persist successful");
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("persist failed" + re);
			
			if(transaction != null){
				transaction.rollback();
			}
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
	
	public Creator findCreatorByUserId(Long id) {
		System.out.println("getting Creator instance with id: " + id);
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Creator instance = (Creator) session.get(
							"com.bms.service.vo.Creator",
							id);
			if (instance == null) {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, no instance found");
			} else {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, instance found");
			}			
			return instance;
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("get failed" + re);
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
	
	public Creator findCreatorByUserName(String userName) {
		System.out.println("getting Creator instance with userName: " + userName);
		Session session = null;
		try {
			session = sessionFactory.openSession();
			
//			Creator instance = (Creator) session.get(
//							"com.bms.service.vo.Creator",
//							userName);
			List creatorList = session.createQuery(" from Creator c where c.userName = '" + userName + "'").list();
			
			Creator instance = (Creator)creatorList.get(0);
			if (instance == null) {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, no instance found");
			} else {
				//TODO: Will be logged at debug level later
				System.out.println("get successful, instance found");
			}			
			return instance;
		} catch (RuntimeException re) {
			//TODO: Will be logged at error level later
			System.out.println("get failed" + re);
			throw re;
		}finally {
			if(session != null && session.isOpen()){
				session.close();
			}
		}
	}
}
