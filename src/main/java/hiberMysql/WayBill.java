package hiberMysql;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class WayBill {
	@Id
	private int idWayBill;

	// @Temporal(TemporalType.DATE)
	@CreationTimestamp
	// @UpdateTimestamp
	private Date dateWayBill;

	private String numberWayBill;

	@Enumerated(EnumType.STRING)
	private Week dayWayBill;

	private int suplierId;

	// Embeddable class
	private Storekeeper storekeeper;

	public WayBill() {

	}

	public WayBill(Date dateWayBill, String numberWayBill, int suplierId) {
		this.dateWayBill = dateWayBill;
		this.numberWayBill = numberWayBill;
		this.suplierId = suplierId;
	}

	public WayBill(Date dateWayBill, String numberWayBill, Week dayWayBill, int suplierId) {
		this.dateWayBill = dateWayBill;
		this.numberWayBill = numberWayBill;
		this.dayWayBill = dayWayBill;
		this.suplierId = suplierId;
	}

	public WayBill(int idWayBill, Date dateWayBill, String numberWayBill, Week dayWayBill, int suplierId) {
		this.idWayBill = idWayBill;
		this.dateWayBill = dateWayBill;
		this.numberWayBill = numberWayBill;
		this.dayWayBill = dayWayBill;
		this.suplierId = suplierId;
	}

	public WayBill(int idWayBill, Date dateWayBill, String numberWayBill, Week dayWayBill, int suplierId, Storekeeper storekeeper) {
		this.idWayBill = idWayBill;
		this.dateWayBill = dateWayBill;
		this.numberWayBill = numberWayBill;
		this.dayWayBill = dayWayBill;
		this.suplierId = suplierId;
		this.storekeeper = storekeeper;
	}

	public int getIdWayBill() {
		return idWayBill;
	}

	public void setIdWayBill(int idWayBill) {
		this.idWayBill = idWayBill;
	}

	public Date getDateWayBill() {
		return dateWayBill;
	}

	public void setDateWayBill(Date dateWayBill) {
		this.dateWayBill = dateWayBill;
	}

	public String getNumberWayBill() {
		return numberWayBill;
	}

	public void setNumberWayBill(String numberWayBill) {
		this.numberWayBill = numberWayBill;
	}

	public Week getDayWayBill() {
		return dayWayBill;
	}

	public void setDayWayBill(Week dayWayBill) {
		this.dayWayBill = dayWayBill;
	}

	public int getSuplierId() {
		return suplierId;
	}

	public void setSuplierId(int suplierId) {
		this.suplierId = suplierId;
	}

	public Storekeeper getStorekeeper() {
		return storekeeper;
	}

	public void setStorekeeper(Storekeeper storekeeper) {
		this.storekeeper = storekeeper;
	}

	@Override
	public String toString() {
		return "WayBill [idWayBill=" + idWayBill + ", dateWayBill=" + dateWayBill + ", numberWayBill=" + numberWayBill + ", dayWayBill=" + dayWayBill + ", suplierId=" + suplierId + ", storekeeper="
				+ storekeeper + "]";
	}

}
