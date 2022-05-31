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
@Table(name="anime")
public class Anime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoAnime;
	@Column(length = 60, nullable = false)
	private String nomeAnime;
	@Column(length = 60, nullable = false)
	private String AutorManga;
	@Column(length = 60, nullable = false)
	private String EstudioAnime;
	@Column(name="genero_anime", nullable = false)
	@Enumerated(EnumType.STRING)
	private GeneroAnime generoAnime;
	
	public Anime() {
		
	}

	public Anime(String nomeAnime, String autorManga, String estudioAnime, GeneroAnime generoAnime) {
		super();
		this.nomeAnime = nomeAnime;
		AutorManga = autorManga;
		EstudioAnime = estudioAnime;
		this.generoAnime = generoAnime;
	}

	public Long getCodigoAnime() {
		return codigoAnime;
	}

	public void setCodigoAnime(Long codigoAnime) {
		this.codigoAnime = codigoAnime;
	}

	public String getNomeAnime() {
		return nomeAnime;
	}

	public void setNomeAnime(String nomeAnime) {
		this.nomeAnime = nomeAnime;
	}

	public String getAutorManga() {
		return AutorManga;
	}

	public void setAutorManga(String autorManga) {
		AutorManga = autorManga;
	}

	public String getEstudioAnime() {
		return EstudioAnime;
	}

	public void setEstudioAnime(String estudioAnime) {
		EstudioAnime = estudioAnime;
	}

	public GeneroAnime getGeneroAnime() {
		return generoAnime;
	}

	public void setGeneroAnime(GeneroAnime generoAnime) {
		this.generoAnime = generoAnime;
	}
	
	

	
	

}
