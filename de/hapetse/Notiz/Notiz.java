import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notiz {
	@OneToMany
	private String inhalt;
	@OneToOne
	private String titel;

	public Notiz(String t, String i){
		this.inhalt = i;
		this.titel = t;
	}

	public void setInhalt(String i){
		this.inhalt = i;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setTitel(String t){
		this.titel = t;
	}

	public String getTitel(){
		return titel;
	}

	public String toText(){
		return getTitel() + ": " + getInhalt();
	}
}