package pt.meistre.soft.i18n.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
