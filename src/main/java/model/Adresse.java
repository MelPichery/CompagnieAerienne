package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

			
	@Column(name="rue")
	private String rue;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="ville")
	private String ville;

	public Adresse() {
		
	}

	
	
	public Adresse(String rue, String cp, String ville) {
		super();
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}



	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", cp=" + cp + ", ville=" + ville + "]";
	}
		
}
