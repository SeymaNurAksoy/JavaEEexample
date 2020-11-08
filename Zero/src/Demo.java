import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	@GeneratedValue
	Long id;
	String ad;
	String soyad;
	Integer yas;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public Integer getYas() {
		return yas;
	}
	public void setYas(Integer yas) {
		this.yas = yas;
	}

}
