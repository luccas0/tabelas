package dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//@Entity
@Table(name = "dlc")
public class Dlc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoDlc;
	@Column(length = 60, nullable = false)
	private String novoPersonagem;
	
	@ManyToMany(mappedBy =  "dlc")
	private Set<Jogo>  jogos = new HashSet<>();
	
	public Dlc() {
		
	}

	public Dlc(Long codigoDlc, String novoPersonagem, Set<Jogo> jogos) {
		super();
		this.codigoDlc = codigoDlc;
		this.novoPersonagem = novoPersonagem;
		this.jogos = jogos;
	}

	public Long getCodigoDlc() {
		return codigoDlc;
	}

	public void setCodigoDlc(Long codigoDlc) {
		this.codigoDlc = codigoDlc;
	}

	public String getNovoPersonagem() {
		return novoPersonagem;
	}

	public void setNovoPersonagem(String novoPersonagem) {
		this.novoPersonagem = novoPersonagem;
	}

	public Set<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(Set<Jogo> jogos) {
		this.jogos = jogos;
	}

	
	
	
	
	

	
	
	

}
