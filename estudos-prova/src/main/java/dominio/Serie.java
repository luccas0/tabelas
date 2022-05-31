package dominio;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "serie")
public class Serie {
	
	//@EmbeddedId
	//private SerieId codigo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoSerie;
	@Column(length = 60, nullable = false)
	private String nomeSerie;
	@Column(length = 60, nullable = false)
	private String producaoSerie;
	@Column(length = 60, nullable = false)
	private Integer numeroTemporadas;
	@Column(name="genero_serie", nullable = false)
	@Enumerated(EnumType.STRING)
	private GeneroSerie generoSerie;
	
	//@ManyToOne
	//@JoinColumn(name = "usuario_codigo")
	//private Usuario usuario;
	public Serie() {
		
	}

	public Serie(Long codigoSerie, String nomeSerie, String producaoSerie, Integer numeroTemporadas,
			GeneroSerie generoSerie) {
		super();
		this.codigoSerie = codigoSerie;
		this.nomeSerie = nomeSerie;
		this.producaoSerie = producaoSerie;
		this.numeroTemporadas = numeroTemporadas;
		this.generoSerie = generoSerie;
	}

	public Long getCodigoSerie() {
		return codigoSerie;
	}

	public void setCodigoSerie(Long codigoSerie) {
		this.codigoSerie = codigoSerie;
	}

	public String getNomeSerie() {
		return nomeSerie;
	}

	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}

	public String getProducaoSerie() {
		return producaoSerie;
	}

	public void setProducaoSerie(String producaoSerie) {
		this.producaoSerie = producaoSerie;
	}

	public Integer getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(Integer numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public GeneroSerie getGeneroSerie() {
		return generoSerie;
	}

	public void setGeneroSerie(GeneroSerie generoSerie) {
		this.generoSerie = generoSerie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoSerie, generoSerie, nomeSerie, numeroTemporadas, producaoSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(codigoSerie, other.codigoSerie) && generoSerie == other.generoSerie
				&& Objects.equals(nomeSerie, other.nomeSerie)
				&& Objects.equals(numeroTemporadas, other.numeroTemporadas)
				&& Objects.equals(producaoSerie, other.producaoSerie);
	}

	
	
	

	
	

}
