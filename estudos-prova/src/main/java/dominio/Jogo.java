package dominio;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoJogo;
	@Column(length = 60, nullable = false)
	private String nomeJogo;
	@Column(length = 60, nullable = false)
	private String criadorJogo;
	@Column(length = 60, nullable = false)
	private String empresaJogo;
	@Column(name="genero_jogo", nullable = false)
	@Enumerated(EnumType.STRING)
	private GeneroJogo generoJogo;
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal preco;
	@Lob
	private byte[] foto;
	
	//@OneToOne
	//@JoinColumn(name="cod_ususario")
	//private Usuario usuario;
	
	//@ManyToMany
	//@JoinTable(name="jogo_dlc",
	//joinColumns = @JoinColumn(name="jogo_codigo"),
	//inverseJoinColumns = @JoinColumn(name="dlc_codigo"))
	
	//private Set <Dlc> dlc = new HashSet<>();
	
	
	public Jogo() {

}

	public Jogo(Long codigoJogo, String nomeJogo, String criadorJogo, String empresaJogo, GeneroJogo generoJogo,
			BigDecimal preco, byte[] foto) {
		super();
		this.codigoJogo = codigoJogo;
		this.nomeJogo = nomeJogo;
		this.criadorJogo = criadorJogo;
		this.empresaJogo = empresaJogo;
		this.generoJogo = generoJogo;
		this.preco = preco;
		this.foto = foto;
	}

	public Long getCodigoJogo() {
		return codigoJogo;
	}

	public void setCodigoJogo(Long codigoJogo) {
		this.codigoJogo = codigoJogo;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getCriadorJogo() {
		return criadorJogo;
	}

	public void setCriadorJogo(String criadorJogo) {
		this.criadorJogo = criadorJogo;
	}

	public String getEmpresaJogo() {
		return empresaJogo;
	}

	public void setEmpresaJogo(String empresaJogo) {
		this.empresaJogo = empresaJogo;
	}

	public GeneroJogo getGeneroJogo() {
		return generoJogo;
	}

	public void setGeneroJogo(GeneroJogo generoJogo) {
		this.generoJogo = generoJogo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Objects.hash(codigoJogo, criadorJogo, empresaJogo, generoJogo, nomeJogo, preco);
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
		Jogo other = (Jogo) obj;
		return Objects.equals(codigoJogo, other.codigoJogo) && Objects.equals(criadorJogo, other.criadorJogo)
				&& Objects.equals(empresaJogo, other.empresaJogo) && Arrays.equals(foto, other.foto)
				&& generoJogo == other.generoJogo && Objects.equals(nomeJogo, other.nomeJogo)
				&& Objects.equals(preco, other.preco);
	}

	
	

	

	

	
	
	

	

	
	

	

	
	
}
