package hiberMysql;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID id;

	private String name;

	public Poty() {
		super();
	}

	public Poty(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Poty(String name) {
		super();
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Poty [id=" + id + ", name=" + name + "]";
	}

}
