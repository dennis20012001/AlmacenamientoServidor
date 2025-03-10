package Objects;
// Generated 5 mar 2025, 18:19:58 by Hibernate Tools 6.5.1.Final

/**
 * InvoiceDetails generated by hbm2java
 */
public class InvoiceDetails implements java.io.Serializable {

	private Integer detailId;
	private Invoices invoices;
	private Products products;
	private int quantity;
	private boolean paid;

	public InvoiceDetails() {
	}

	public InvoiceDetails(Invoices invoices, Products products, int quantity, boolean paid) {
		this.invoices = invoices;
		this.products = products;
		this.quantity = quantity;
		this.paid = paid;
	}

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Invoices getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isPaid() {
		return this.paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

}
