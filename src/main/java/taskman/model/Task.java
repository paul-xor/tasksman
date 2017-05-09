package taskman.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tab_task")
public class Task implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String details;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateClosure;
	private boolean closed;
	
	public Task(){}
	
	public Task(String name, String details, String status, Date dateCreation, Date dateClosure, boolean closed) {
		super();
		this.name = name;
		this.details = details;
		this.status = status;
		this.dateCreation = dateCreation;
		this.dateClosure = dateClosure;
		this.closed = closed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateClosure() {
		return dateClosure;
	}
	public void setDateClosure(Date dateClosure) {
		this.dateClosure = dateClosure;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", details=" + details + ", status=" + status + ", dateCreation="
				+ dateCreation + ", dateClosure=" + dateClosure + ", closed=" + closed + "]";
	}
	
	
}
