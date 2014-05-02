package pt.meistre.soft.i18n.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="\"key\"")
public class Key extends BaseEntity{
    
	private static final long serialVersionUID = 1L;

	@Column
    private String name;
    
    @Column
    private Date added;
    
    @Column
    private User createdBy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
  
}
