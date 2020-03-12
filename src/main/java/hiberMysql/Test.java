package hiberMysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		Shopping sh;

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from hibernate.cfg.xml
				.build();
		try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()) {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			session.save(new Shopping(2, 7, 400, 0.8));

			session.getTransaction().commit();
			session.close();

		}
		// System.out.println(suppliers);

	}
}