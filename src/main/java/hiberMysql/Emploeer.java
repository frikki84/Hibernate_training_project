package hiberMysql;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Emploeer {
	@EmbeddedId
	private Pasport pasport;

	private String name;

	private String surname;

	public Emploeer() {

	}

	public Emploeer(Pasport pasport, String name, String surname) {
		super();
		this.pasport = pasport;
		this.name = name;
		this.surname = surname;
	}

	public Pasport getPasport() {
		return pasport;
	}

	public void setPasport(Pasport pasport) {
		this.pasport = pasport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Emploer [pasport=" + pasport + ", name=" + name + ", surname=" + surname + "]";
	}

}
