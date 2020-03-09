package hiberMysql;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Suppliers {
	@Id
	private int idSuplier;

	@Basic(optional = false)
	private String nameSupllier;

	@Enumerated(EnumType.STRING)
	private Town town;

	private String adressSuplier;

	private String bankAccount;

	private String bankAdress;

	public Suppliers() {

	}

	public Suppliers(String nameSupllier, Town town, String adressSuplier, String bankAccount, String bankAdress) {
		this.nameSupllier = nameSupllier;
		this.town = town;
		this.adressSuplier = adressSuplier;
		this.bankAccount = bankAccount;
		this.bankAdress = bankAdress;
	}

	public Suppliers(String nameSupllier) {
		this.nameSupllier = nameSupllier;
	}

	public Suppliers(String nameSupllier, Town town) {
		this.nameSupllier = nameSupllier;
		this.town = town;
	}

	public Suppliers(int idSuplier, String nameSupllier, Town town, String adressSuplier, String bankAccount, String bankAdress) {
		this.idSuplier = idSuplier;
		this.nameSupllier = nameSupllier;
		this.town = town;
		this.adressSuplier = adressSuplier;
		this.bankAccount = bankAccount;
		this.bankAdress = bankAdress;
	}

	public int getIdSuplier() {
		return idSuplier;
	}

	public void setIdSuplier(int idSuplier) {
		this.idSuplier = idSuplier;
	}

	public String getNameSupllier() {
		return nameSupllier;
	}

	public void setNameSupllier(String nameSupllier) {
		this.nameSupllier = nameSupllier;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public String getAdressSuplier() {
		return adressSuplier;
	}

	public void setAdressSuplier(String adressSuplier) {
		this.adressSuplier = adressSuplier;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAdress() {
		return bankAdress;
	}

	public void setBankAdress(String bankAdress) {
		this.bankAdress = bankAdress;
	}

	@Override
	public String toString() {
		return "Suppliers [idSuplier=" + idSuplier + ", nameSupllier=" + nameSupllier + ", town=" + town + ", adressSuplier=" + adressSuplier + ", bankAccount=" + bankAccount + ", bankAdress="
				+ bankAdress + "]";
	}

}
