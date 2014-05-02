package pt.meistre.soft.i18n.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Project extends BaseEntity{

	private static final long serialVersionUID = 1L;
	@Column	
	private String name;
	@Column
	private User createdBy;

	@ManyToMany
	private List<User> authorizedUsers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public List<User> getAuthorizedUsers() {
		return authorizedUsers;
	}

	public void setAuthorizedUsers(List<User> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}

}
