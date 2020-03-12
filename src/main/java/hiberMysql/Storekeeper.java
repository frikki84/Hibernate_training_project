package hiberMysql;

import javax.persistence.Embeddable;

@Embeddable
public class Storekeeper {
	private String secondName;
	private String firstName;

	public Storekeeper() {
	}

	public Storekeeper(String secondName, String firstName) {
		this.secondName = secondName;
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Storekeeper [secondName=" + secondName + ", firstName=" + firstName + "]";
	}

}
