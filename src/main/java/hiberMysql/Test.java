package hiberMysql;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		SellWayBill bill;

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from hibernate.cfg.xml
				.build();
		try (SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory()) {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			// session.save(new ProductType("Milk products", 1));
			// session.save(new ProductType("Goals&Pasta", 1));

			// session.save(new WayBill(new Date(), "1212", 2));
			// session.save(new Shopping(4, 3, 3, 2.5));

			// session.save(new SellWayBill(new GregorianCalendar(2020, 0, 23), "124579", 4,
			// new Storekeeper("Ivanov", "Pavel")));

			/*
			 * bill = session.get(SellWayBill.class, 5); bill.setStorekeeper(new
			 * Storekeeper("Kamil", "Petrov"));
			 */

			session.save(new SellWayBill(new GregorianCalendar(2020, 2, 15), "125454", 1));

			session.getTransaction().commit();
			session.close();

		}

		// System.out.println(bill);

	}
}