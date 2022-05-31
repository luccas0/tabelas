package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="filme")
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoFilme;
	@Column(length = 60, nullable = false)
	private String nomeFilme;
	@Column(length = 60, nullable = false)
	private String diretorFilme;
	//@Temporal(TemporalType.DATE)
	@Column(length = 60, nullable = false)
	private String dataEstreia;
	@Column(name="genero_filme", nullable = false)
	@Enumerated(EnumType.STRING)
	private GeneroFilme generoFilme;
	@Column(name="classificacao_filme", nullable = false)
	private Integer classificacaoFilme;
	
	public Filme() {
		
	}

	public Filme(Long codigoFilme, String nomeFilme, String diretorFilme, String dataEstreia, GeneroFilme generoFilme,
			Integer classificacaoFilme) {
		super();
		this.codigoFilme = codigoFilme;
		this.nomeFilme = nomeFilme;
		this.diretorFilme = diretorFilme;
		this.dataEstreia = dataEstreia;
		this.generoFilme = generoFilme;
		this.classificacaoFilme = classificacaoFilme;
	}

	public Long getCodigoFilme() {
		return codigoFilme;
	}

	public void setCodigoFilme(Long codigoFilme) {
		this.codigoFilme = codigoFilme;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getDiretorFilme() {
		return diretorFilme;
	}

	public void setDiretorFilme(String diretorFilme) {
		this.diretorFilme = diretorFilme;
	}

	public String getDataEstreia() {
		return dataEstreia;
	}

	public void setDataEstreia(String dataEstreia) {
		this.dataEstreia = dataEstreia;
	}

	public GeneroFilme getGeneroFilme() {
		return generoFilme;
	}

	public void setGeneroFilme(GeneroFilme generoFilme) {
		this.generoFilme = generoFilme;
	}

	public Integer getClassificacaoFilme() {
		return classificacaoFilme;
	}

	public void setClassificacaoFilme(Integer classificacaoFilme) {
		this.classificacaoFilme = classificacaoFilme;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificacaoFilme == null) ? 0 : classificacaoFilme.hashCode());
		result = prime * result + ((codigoFilme == null) ? 0 : codigoFilme.hashCode());
		result = prime * result + ((dataEstreia == null) ? 0 : dataEstreia.hashCode());
		result = prime * result + ((diretorFilme == null) ? 0 : diretorFilme.hashCode());
		result = prime * result + ((generoFilme == null) ? 0 : generoFilme.hashCode());
		result = prime * result + ((nomeFilme == null) ? 0 : nomeFilme.hashCode());
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
		Filme other = (Filme) obj;
		if (classificacaoFilme == null) {
			if (other.classificacaoFilme != null)
				return false;
		} else if (!classificacaoFilme.equals(other.classificacaoFilme))
			return false;
		if (codigoFilme == null) {
			if (other.codigoFilme != null)
				return false;
		} else if (!codigoFilme.equals(other.codigoFilme))
			return false;
		if (dataEstreia == null) {
			if (other.dataEstreia != null)
				return false;
		} else if (!dataEstreia.equals(other.dataEstreia))
			return false;
		if (diretorFilme == null) {
			if (other.diretorFilme != null)
				return false;
		} else if (!diretorFilme.equals(other.diretorFilme))
			return false;
		if (generoFilme != other.generoFilme)
			return false;
		if (nomeFilme == null) {
			if (other.nomeFilme != null)
				return false;
		} else if (!nomeFilme.equals(other.nomeFilme))
			return false;
		return true;
	}

	

	
	
	

}
