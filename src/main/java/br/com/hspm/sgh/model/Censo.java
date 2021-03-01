package br.com.hspm.sgh.model;

public class Censo {
	private Long prontuario;
	private String nome;
	private String nascimento;
	private String quarto;
	private String data_internacao_data;
	private String data_internacao_hora;
	private String especialidade;
	private String medico;
	private String sexo;
	private String idade;
	private String cid;
	private String descricaoCid;
	private String tempo;
	private String unidade_funcional;
	private String vinculo;
	public Long getProntuario() {
		return prontuario;
	}
	public void setProntuario(Long prontuario) {
		this.prontuario = prontuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getQuarto() {
		return quarto;
	}
	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}
	public String getData_internacao_data() {
		return data_internacao_data;
	}
	public void setData_internacao_data(String data_internacao_data) {
		this.data_internacao_data = data_internacao_data;
	}
	public String getData_internacao_hora() {
		return data_internacao_hora;
	}
	public void setData_internacao_hora(String data_internacao_hora) {
		this.data_internacao_hora = data_internacao_hora;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getDescricaoCid() {
		return descricaoCid;
	}
	public void setDescricaoCid(String descricaoCid) {
		this.descricaoCid = descricaoCid;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getUnidade_funcional() {
		return unidade_funcional;
	}
	public void setUnidade_funcional(String unidade_funcional) {
		this.unidade_funcional = unidade_funcional;
	}
	public String getVinculo() {
		return vinculo;
	}
	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((data_internacao_data == null) ? 0 : data_internacao_data.hashCode());
		result = prime * result + ((data_internacao_hora == null) ? 0 : data_internacao_hora.hashCode());
		result = prime * result + ((descricaoCid == null) ? 0 : descricaoCid.hashCode());
		result = prime * result + ((especialidade == null) ? 0 : especialidade.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prontuario == null) ? 0 : prontuario.hashCode());
		result = prime * result + ((quarto == null) ? 0 : quarto.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tempo == null) ? 0 : tempo.hashCode());
		result = prime * result + ((unidade_funcional == null) ? 0 : unidade_funcional.hashCode());
		result = prime * result + ((vinculo == null) ? 0 : vinculo.hashCode());
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
		Censo other = (Censo) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (data_internacao_data == null) {
			if (other.data_internacao_data != null)
				return false;
		} else if (!data_internacao_data.equals(other.data_internacao_data))
			return false;
		if (data_internacao_hora == null) {
			if (other.data_internacao_hora != null)
				return false;
		} else if (!data_internacao_hora.equals(other.data_internacao_hora))
			return false;
		if (descricaoCid == null) {
			if (other.descricaoCid != null)
				return false;
		} else if (!descricaoCid.equals(other.descricaoCid))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prontuario == null) {
			if (other.prontuario != null)
				return false;
		} else if (!prontuario.equals(other.prontuario))
			return false;
		if (quarto == null) {
			if (other.quarto != null)
				return false;
		} else if (!quarto.equals(other.quarto))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tempo == null) {
			if (other.tempo != null)
				return false;
		} else if (!tempo.equals(other.tempo))
			return false;
		if (unidade_funcional == null) {
			if (other.unidade_funcional != null)
				return false;
		} else if (!unidade_funcional.equals(other.unidade_funcional))
			return false;
		if (vinculo == null) {
			if (other.vinculo != null)
				return false;
		} else if (!vinculo.equals(other.vinculo))
			return false;
		return true;
	}
	
	
}
