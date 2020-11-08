import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class DemoBean {
	Demo demo=new Demo();
	List<Demo> liste=new ArrayList<Demo>();
	String kullan�c�Adi;
	String sifre;
	public String giris() {
		if(kullan�c�Adi.equalsIgnoreCase("seyma")&& sifre.equalsIgnoreCase("1234")) {
			return "dogru";
		}else {
			return "yanlis";
		}
	}
	public void kaydet() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(demo);
		en.getTransaction().commit();
		liste.add(demo);
		demo=new Demo();
	}
	public Demo getDemo() {
		return demo;
	}
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	public List<Demo> getListe() {
		return liste;
	}
	public void setListe(List<Demo> liste) {
		this.liste = liste;
	}
	public String getKullan�c�Adi() {
		return kullan�c�Adi;
	}
	public void setKullan�c�Adi(String kullan�c�Adi) {
		this.kullan�c�Adi = kullan�c�Adi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	

}
