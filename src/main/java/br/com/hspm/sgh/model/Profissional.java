package br.com.hspm.sgh.model;

public class Profissional {

	private Long matricula;
	private Integer vin_codigo;
	private String nome;
	private String sigla;
	private String nro_reg_conselho;
	private String ind_situacao;
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public Integer getVin_codigo() {
		return vin_codigo;
	}
	public void setVin_codigo(Integer vin_codigo) {
		this.vin_codigo = vin_codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNro_reg_conselho() {
		return nro_reg_conselho;
	}
	public void setNro_reg_conselho(String nro_reg_conselho) {
		this.nro_reg_conselho = nro_reg_conselho;
	}
	public String getInd_situacao() {
		return ind_situacao;
	}
	public void setInd_situacao(String ind_situacao) {
		this.ind_situacao = ind_situacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ind_situacao == null) ? 0 : ind_situacao.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nro_reg_conselho == null) ? 0 : nro_reg_conselho.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((vin_codigo == null) ? 0 : vin_codigo.hashCode());
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
		Profissional other = (Profissional) obj;
		if (ind_situacao == null) {
			if (other.ind_situacao != null)
				return false;
		} else if (!ind_situacao.equals(other.ind_situacao))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nro_reg_conselho == null) {
			if (other.nro_reg_conselho != null)
				return false;
		} else if (!nro_reg_conselho.equals(other.nro_reg_conselho))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		if (vin_codigo == null) {
			if (other.vin_codigo != null)
				return false;
		} else if (!vin_codigo.equals(other.vin_codigo))
			return false;
		return true;
	}
}
