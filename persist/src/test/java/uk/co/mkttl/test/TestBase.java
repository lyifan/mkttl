package uk.co.mkttl.test;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(value = {"classpath:spring-persist.xml", "classpath:spring-testContext.xml"})
@TransactionConfiguration(defaultRollback=false)
public abstract class TestBase extends AbstractTransactionalTestNGSpringContextTests {
	
	@Autowired
	private SessionFactory _sessionFactory;
	
	protected void persist(Object entity) {
		_sessionFactory.getCurrentSession().save(entity);
	}
}
