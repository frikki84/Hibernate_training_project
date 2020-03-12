package hiberMysql;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Formula;

@Entity(name = "Purchases")
public class Shopping {
	@Id
	private int idShopping;

	private int idWayBill;
	private int idProduct;

	private double quantityShopping;
	private double priceShopping;
	@Formula("quantityShopping * priceShopping")
	private double totalCost;

	public Shopping() {
		super();
	}

	public Shopping(int idShopping, int idWayBill, int idProduct, double quantityShopping, double priceShopping, double totalCost) {
		super();
		this.idShopping = idShopping;
		this.idWayBill = idWayBill;
		this.idProduct = idProduct;
		this.quantityShopping = quantityShopping;
		this.priceShopping = priceShopping;
		this.totalCost = totalCost;
	}

	public Shopping(int idWayBill, int idProduct, double quantityShopping, double priceShopping) {
		super();
		this.idWayBill = idWayBill;
		this.idProduct = idProduct;
		this.quantityShopping = quantityShopping;
		this.priceShopping = priceShopping;
	}

	public Shopping(int idWayBill, int idProduct, double quantityShopping, double priceShopping, double totalCost) {
		super();
		this.idWayBill = idWayBill;
		this.idProduct = idProduct;
		this.quantityShopping = quantityShopping;
		this.priceShopping = priceShopping;
		this.totalCost = totalCost;
	}

	public int getIdShopping() {
		return idShopping;
	}

	public void setIdShopping(int idShopping) {
		this.idShopping = idShopping;
	}

	public int getIdWayBill() {
		return idWayBill;
	}

	public void setIdWayBill(int idWayBill) {
		this.idWayBill = idWayBill;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public double getQuantityShopping() {
		return quantityShopping;
	}

	public void setQuantityShopping(double quantityShopping) {
		this.quantityShopping = quantityShopping;
	}

	public double getPriceShopping() {
		return priceShopping;
	}

	public void setPriceShopping(double priceShopping) {
		this.priceShopping = priceShopping;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Shopping [idShopping=" + idShopping + ", idWayBill=" + idWayBill + ", idProduct=" + idProduct + ", quantityShopping=" + quantityShopping + ", priceShopping=" + priceShopping
				+ ", totalCost=" + totalCost + "]";
	}

}
