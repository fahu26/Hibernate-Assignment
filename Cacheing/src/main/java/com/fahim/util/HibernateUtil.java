package com.fahim.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.fahim.model.Users123;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties properties = new Properties();
				properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/sampledb?useSSL=false");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "root@123");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.SHOW_SQL, "true");
				properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				//properties.put("hibernate.cache.provider_class", "org.hibernate.cache.EhCacheProvider");
				//properties.put("hibernate.cache.use_structured_entries", "true");
				//properties.put("hibernate.cache.use_query_cache", "true");
				//properties.put("hibernate.cache.use_second_level_cache", "true");
				//properties.put(Environment.HBM2DDL_AUTO, "create-drop");
				properties.put(Environment.USE_QUERY_CACHE, "true");
				  properties.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
				  properties.put(Environment.USE_STRUCTURED_CACHE,"true");
				  properties.put(Environment.CACHE_PROVIDER_CONFIG,"org.hibernate.cache.ehcache.EhCacheProvider");
				 
				properties.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(properties);
				configuration.addAnnotatedClass(Users123.class);
				
				
				ServiceRegistry registry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(registry);

			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
