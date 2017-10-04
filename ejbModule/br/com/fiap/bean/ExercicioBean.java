package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;

import br.com.fiap.interfaces.Exercicio;

@Stateful
@Local(Exercicio.class)
public class ExercicioBean implements Exercicio{

	private List<String> nomes;
	
	@Override
	public List<String> buscarNomes() {
		return nomes;
	}

	@Override
	public void incluirNome(String nome) {
		if(nomes == null){
			nomes = new ArrayList<String>();
		}
		
		nomes.add(nome);
	}
}
