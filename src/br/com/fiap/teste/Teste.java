package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class Teste {
	public static void main(String[] args) {

		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario gustavo = new Usuario("Gustavo", "gustavoemiliano2014@gmail.com");
		Usuario janiely = new Usuario("Janiely", "janiely2014@gmail.com");
		Usuario julio = new Usuario("Julio", "julio@gmail.com");
		
		
		// Inserir usuários no banco
		dao.insert(gustavo);
		dao.insert(julio);
		dao.insert(janiely);
		dao.delete(2);
		dao.update(julio);
	
		
		// Buscar todos os usuários
		List<Usuario> lista = new ArrayList<Usuario>();
		lista = dao.selectAll();
		
		for(Usuario usuario: lista) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Email: " + usuario.getEmail());
		}
		
		
	}
}
