package br.com.tairoroberto.camposdechecagem;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PerfilUsuarioBean {
	private String sexo;
	private boolean receberNovidades;
	private String[] linguagens;
	
	public String enviar() {
		return "Confirmacao";
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isReceberNovidades() {
		return receberNovidades;
	}
	public void setReceberNovidades(boolean receberNovidades) {
		this.receberNovidades = receberNovidades;
	}
	public String[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(String[] linguagens) {
		this.linguagens = linguagens;
	}
	
	
}
