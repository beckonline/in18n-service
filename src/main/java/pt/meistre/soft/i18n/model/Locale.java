package pt.meistre.soft.i18n.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Locale extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Column
	String country;
	@Column
	String language;
	@Column
	String variant;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
	}
}
