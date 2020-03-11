package sai.learn.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class BeanConfig {

//	@Autowired
//	private EntityManagerFactory entityManagerFactory;
//
//	@Bean
//	public DataSource dataSource() {
//		HikariDataSource ds = new HikariDataSource();
//		ds.setMaximumPoolSize(100);
//		ds.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
//		ds.addDataSourceProperty("url", "jdbc:mysql://localhost:3306/test");
//		ds.addDataSourceProperty("user", "root");
//		ds.addDataSourceProperty("password", "password");
//		ds.addDataSourceProperty("cachePrepStmts", true);
//		ds.addDataSourceProperty("prepStmtCacheSize", 250);
//		ds.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
//		ds.addDataSourceProperty("useServerPrepStmts", true);
//		return ds;
//	}
//
//	@Bean(name = "entityManagerFactory")
//	public EntityManagerFactory entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//		emf.setDataSource(dataSource());
//		emf.setJpaVendorAdapter(jpaVendorAdapter);
//		emf.setPackagesToScan("com.mysource.model");
//		emf.setPersistenceUnitName("default");
//		emf.afterPropertiesSet();
//		return emf.getObject();
//	}
//
//	@Bean
//	public SessionFactory getSessionFactory() {
//	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
//	        throw new NullPointerException("factory is not a hibernate factory");
//	    }
//	    return entityManagerFactory.unwrap(SessionFactory.class);
//	}

}