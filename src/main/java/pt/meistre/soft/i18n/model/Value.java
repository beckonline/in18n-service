package pt.meistre.soft.i18n.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Value extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@OneToOne
	private Locale locale;
	
	@OneToOne
	private Key key;
	
	@OneToOne
	private User createdBy;
	
	@Column
	private String Description;

	@OneToOne
	private Value previousReference;
	
	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Value getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(Value previousReference) {
		this.previousReference = previousReference;
	}
			
}
