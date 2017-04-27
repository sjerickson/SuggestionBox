package edu.dmacc.erickson.suggestionbox;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suggestions")
public class Suggestion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phoneNum;
	private boolean isAnonymous;
	private String suggestionText;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean isAnonymous() {
		return isAnonymous;
	}
	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	public String getSuggestionText() {
		return suggestionText;
	}
	public void setSuggestionText(String suggestionText) {
		this.suggestionText = suggestionText;
	}
	
	
	
}