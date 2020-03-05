package hiberMysql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductType {

	@Id
	private int idProductType;

	private String productTypeName;

	private int parentIdProductType;

	public ProductType() {

	}

	public ProductType(int idProductType, String productTypeName) {
		this.idProductType = idProductType;
		this.productTypeName = productTypeName;

	}

	public ProductType(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public ProductType(String productTypeName, int parentIdProductType) {
		this.productTypeName = productTypeName;
		this.parentIdProductType = parentIdProductType;
	}

	public ProductType(int idProductType, String productTypeName, int parentIdProductType) {
		this.idProductType = idProductType;
		this.productTypeName = productTypeName;
		this.parentIdProductType = parentIdProductType;
	}

	public int getIdProductType() {
		return idProductType;
	}

	public void setIdProductType(int idProductType) {
		if (idProductType > 0) {
			this.idProductType = idProductType;
		}
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		if (productTypeName != null) {
			this.productTypeName = productTypeName;
		}
	}

	public int getParentIdProductType() {
		return parentIdProductType;
	}

	public void setParentIdProductType(int parentIdProductType) {
		if (parentIdProductType > 0) {
			this.parentIdProductType = parentIdProductType;
		}
	}

	@Override
	public String toString() {
		return "ProductType [idProductType=" + idProductType + ", productTypeName=" + productTypeName + ", parentIdProductType=" + parentIdProductType + "]";
	}

}
