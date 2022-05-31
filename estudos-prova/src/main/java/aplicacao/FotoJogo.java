package aplicacao;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import dominio.GeneroJogo;
import dominio.Jogo;


public class FotoJogo {

	public static void main(String[] args) throws IOException {
		
		Path path = FileSystems.getDefault().getPath("foto/smash.jpg");
		byte[] foto = Files.readAllBytes(path);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		
		em.getTransaction().begin();
		
		Jogo jogo = new Jogo();
		jogo.setNomeJogo("Super Smash Bros. Ultimate");
		jogo.setCriadorJogo("Masahiro Sakurai");
		jogo.setEmpresaJogo("Nintendo");
		jogo.setGeneroJogo(GeneroJogo.LUTA);
		jogo.setPreco(new BigDecimal(332));
		
		em.persist(jogo);
		
		em.getTransaction().commit();
		
		em.detach(jogo);
		
		Jogo jogo2 = em.find(Jogo.class, jogo.getCodigoJogo());
		if (jogo2.getFoto() != null) {
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(jogo2.getFoto()));
			JOptionPane.showInternalMessageDialog(null, new JLabel(new ImageIcon(img)));
		} else {
			System.out.println("Jogo não possui foto");
		}
		
        System.out.println("Feito");
		
				
		em.close();
		emf.close();

	}

}
