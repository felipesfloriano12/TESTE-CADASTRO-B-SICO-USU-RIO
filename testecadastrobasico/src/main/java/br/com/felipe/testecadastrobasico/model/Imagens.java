package br.com.felipe.testecadastrobasico.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "imsgens",schema = "RHFcadastrobasico")
public class Imagens {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_img")
	private String nomeImg;
	@Column(name = "tipo_img")
	private String tipoImg;
	@Column(name = "img")
	@Type(type="org.hibernate.type.BinaryType")
	private  byte[] img;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeImg() {
		return nomeImg;
	}
	public void setNomeImg(String nomeImg) {
		this.nomeImg = nomeImg;
	}
	public String getTipoImg() {
		return tipoImg;
	}
	public void setTipoImg(String tipoImg) {
		this.tipoImg = tipoImg;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Arrays.hashCode(img);
		result = prime * result + ((nomeImg == null) ? 0 : nomeImg.hashCode());
		result = prime * result + ((tipoImg == null) ? 0 : tipoImg.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imagens other = (Imagens) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (!Arrays.equals(img, other.img))
			return false;
		if (nomeImg == null) {
			if (other.nomeImg != null)
				return false;
		} else if (!nomeImg.equals(other.nomeImg))
			return false;
		if (tipoImg == null) {
			if (other.tipoImg != null)
				return false;
		} else if (!tipoImg.equals(other.tipoImg))
			return false;
		return true;
	}
	
}
