package hiberMysql;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Product {
	@Id
	private int idProduct;

	@Basic(fetch = FetchType.LAZY)
	@Type(type = "string")
	private String nameProduct;

	@Column(name = "unitProduct")
	private String unit;

	private int idProductType;

	public Product() {

	}

	public Product(String nameProduct, String unit, int idParentProductType) {
		this.nameProduct = nameProduct;
		this.unit = unit;
		this.idProductType = idParentProductType;
	}

	public Product(int idProduct, String nameProduct, String unit, int idParentProductType) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.unit = unit;
		this.idProductType = idParentProductType;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getIdParentProductType() {
		return idProductType;
	}

	public void setIdParentProductType(int idParentProductType) {
		this.idProductType = idParentProductType;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", idParentProductType=" + idProductType + "]";
	}

}
