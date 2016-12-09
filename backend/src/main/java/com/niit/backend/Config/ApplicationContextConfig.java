package com.niit.backend.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backend.DAO.BillingAddressDao;
import com.niit.backend.DAO.BillingAddressDaoimpl;
import com.niit.backend.DAO.CreditCardDao;
import com.niit.backend.DAO.CreditCardDaoImpl;
import com.niit.backend.DAO.CartDao;
import com.niit.backend.DAO.CartDaoImpl;
import com.niit.backend.DAO.CartItemDaoimpl;
import com.niit.backend.DAO.CartitemDao;
import com.niit.backend.DAO.CategoryDao;
import com.niit.backend.DAO.CategoryDaoimpl;
import com.niit.backend.DAO.CustomerDao;
import com.niit.backend.DAO.CustomerDaoimpl;
import com.niit.backend.DAO.ProductDao;
import com.niit.backend.DAO.ProductDaoimpl;
import com.niit.backend.DAO.SupplierDao;
import com.niit.backend.DAO.SupplierDaoimpl;
import com.niit.backend.DAO.UserDao;
import com.niit.backend.DAO.UserDaoimpl;
import com.niit.backend.model.BillingAddress;
import com.niit.backend.model.CreditCard;
import com.niit.backend.model.Cart;
import com.niit.backend.model.CartItem;
import com.niit.backend.model.Category;
import com.niit.backend.model.Customer;
import com.niit.backend.model.Product;
import com.niit.backend.model.ShippingAddress;
import com.niit.backend.model.Supplier;
import com.niit.backend.model.User;


@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class ApplicationContextConfig {	
	@Autowired
	@Bean(name="dataSource")
		    public DataSource getH2DataSource() {
			 DriverManagerDataSource dataSource=new DriverManagerDataSource();
			 dataSource.setDriverClassName("org.h2.Driver");
		    	dataSource.setUrl("jdbc:h2:tcp://localhost/~/testvino");
		    	dataSource.setUsername("sa");
		    	dataSource.setPassword("");
		    	return dataSource;
		    }
		    

	private Properties getHibernateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
		}
		   
		    
		    @Autowired
		    @Bean(name = "sessionFactory")
		    public SessionFactory getSessionFactory(DataSource dataSource) {
		    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		    	sessionBuilder.addProperties(getHibernateProperties());
		    	sessionBuilder.addAnnotatedClasses(Category.class);
		    	sessionBuilder.addAnnotatedClasses(Supplier.class);
		    	sessionBuilder.addAnnotatedClasses(Product.class);
		    	sessionBuilder.addAnnotatedClasses(Cart.class);
		    	sessionBuilder.addAnnotatedClasses(User.class);
		    
		    	sessionBuilder.addAnnotatedClasses(CreditCard.class);
		    	sessionBuilder.addAnnotatedClasses(ShippingAddress.class);
		    	

				return sessionBuilder.buildSessionFactory();
		    }
		 
			@Autowired
			@Bean(name = "transactionManager")
			public HibernateTransactionManager getTransactionManager(
					SessionFactory sessionFactory) {
				HibernateTransactionManager transactionManager = new HibernateTransactionManager(
						sessionFactory);

				return transactionManager;
			}
				
			
		    
		 
@Autowired
@Bean(name="categoryDao")
public CategoryDao getCategoryDao(SessionFactory sessionFactory){
	return new CategoryDaoimpl(sessionFactory);
}
@Autowired
@Bean(name="supplierDao")
public SupplierDao getSupplierDao(SessionFactory sessionFactory){
	return new SupplierDaoimpl(sessionFactory);
}
@Autowired
@Bean(name="productDao")
public ProductDao getProductDao(SessionFactory sessionFactory)
{
	return new ProductDaoimpl(sessionFactory);
}
@Autowired(required=true)
@Bean(name="userDao")
public UserDao getUserDao(SessionFactory sessionFactory)
{
	return new UserDaoimpl(sessionFactory);
	
}
@Autowired(required=true)
@Bean(name="cartDao")
public CartDao getCartDao(SessionFactory sessionFactory){
	return new CartDaoImpl(sessionFactory);
}
}