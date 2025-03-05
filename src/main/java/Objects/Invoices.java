package Objects;
// Generated 5 mar 2025, 18:19:58 by Hibernate Tools 6.5.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Invoices generated by hbm2java
 */
public class Invoices implements java.io.Serializable {

	private Integer invoiceId;
	private Users users;
	private Set invoiceDetailses = new HashSet(0);

	public Invoices() {
	}

	public Invoices(Users users) {
		this.users = users;
	}

	public Invoices(Users users, Set invoiceDetailses) {
		this.users = users;
		this.invoiceDetailses = invoiceDetailses;
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Set getInvoiceDetailses() {
		return this.invoiceDetailses;
	}

	public void setInvoiceDetailses(Set invoiceDetailses) {
		this.invoiceDetailses = invoiceDetailses;
	}

}
