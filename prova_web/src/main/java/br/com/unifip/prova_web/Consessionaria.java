package br.com.unifip.prova_web;

import java.util.List;


import java.util.ArrayList;

public class Consessionaria {

	private static List<Veiculos> lista_de_veiculos = new ArrayList<>();
	
	static {
		Veiculos v1 = new Veiculos();
		Veiculos v2 = new Veiculos();
		v1.setNome("COROLA");
		v1.setId("121");
		v1.setMarca("TOYTOTA");
		v2.setNome("GOL");
		v2.setId("123");
		v2.setMarca("VOLTSWAGEN");
		lista_de_veiculos.add(v1);
		lista_de_veiculos.add(v2);		
	}
	
	public void adicionarVeiculo(Veiculos veiculo) {
		lista_de_veiculos.add(veiculo);
	}
	
	public List<Veiculos> verLista(){
		return Consessionaria.lista_de_veiculos;
	}

	public void removerVeiculo(String id) {
		
			Veiculos veiculoRemover = null;
		    
			for (Veiculos veiculo : lista_de_veiculos) {
		        if (veiculo.getId() == id) {
		            veiculoRemover = veiculo;
		            break;
		        }
		    }
		    if (veiculoRemover != null) {
		        lista_de_veiculos.remove(veiculoRemover);
		    }
	}
}
