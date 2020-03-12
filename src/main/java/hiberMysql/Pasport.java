package hiberMysql;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Pasport implements Serializable {
	private String pasportCod;
	private String pasportNumber;

	public Pasport() {
		super();
	}

	public Pasport(String kod, String number) {
		super();
		this.pasportCod = kod;
		this.pasportNumber = number;
	}

	public String getKod() {
		return pasportCod;
	}

	public void setKod(String kod) {
		this.pasportCod = kod;
	}

	public String getNumber() {
		return pasportNumber;
	}

	public void setNumber(String number) {
		this.pasportNumber = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pasportCod == null) ? 0 : pasportCod.hashCode());
		result = prime * result + ((pasportNumber == null) ? 0 : pasportNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasport other = (Pasport) obj;
		if (pasportCod == null) {
			if (other.pasportCod != null)
				return false;
		} else if (!pasportCod.equals(other.pasportCod))
			return false;
		if (pasportNumber == null) {
			if (other.pasportNumber != null)
				return false;
		} else if (!pasportNumber.equals(other.pasportNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pasport [kod=" + pasportCod + ", number=" + pasportNumber + "]";
	}

}
