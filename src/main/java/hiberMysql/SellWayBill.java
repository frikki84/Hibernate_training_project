package hiberMysql;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()

public class SellWayBill {

	@Id
	@Column(name = "idSellBill")
	private int id;

	@Column(name = "date")
	// @Temporal(TemporalType.DATE)
	private GregorianCalendar calendar;

	// @Column(name = "Number")
	private String number;

	private int sellerId;

	private Storekeeper storekeeper;

	public SellWayBill() {

	}

	public SellWayBill(GregorianCalendar calendar, String numberSellWayBill, int sellerId) {
		super();
		this.calendar = calendar;
		this.number = numberSellWayBill;
		this.sellerId = sellerId;
	}

	public SellWayBill(GregorianCalendar calendar, String numberSellWayBill, int sellerId, Storekeeper storekeeper) {
		super();
		this.calendar = calendar;
		this.number = numberSellWayBill;
		this.sellerId = sellerId;
		this.storekeeper = storekeeper;
	}

	public SellWayBill(int id, GregorianCalendar calendar, String numberSellWayBill, int sellerId, Storekeeper storekeeper) {
		super();
		this.id = id;
		this.calendar = calendar;
		this.number = numberSellWayBill;
		this.sellerId = sellerId;
		this.storekeeper = storekeeper;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(GregorianCalendar calendar) {
		this.calendar = calendar;
	}

	public String getNumberSellWayBill() {
		return "Накладная " + number;
	}

	public void setNumberSellWayBill(String numberSellWayBill) {
		this.number = numberSellWayBill;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public Storekeeper getStorekeeper() {
		return storekeeper;
	}

	public void setStorekeeper(Storekeeper storekeeper) {
		this.storekeeper = storekeeper;
	}

	@Override
	public String toString() {
		return "SellWayBill [id=" + id + ", calendar=" + calendar + ", numberSellWayBill=" + number + ", sellerId=" + sellerId + ", storekeeper=" + storekeeper + "]";
	}

}
