/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fillers;

import tabacaria.models.Estoque;
import tabacaria.models.Item;

/**
 * @author pedro
 */
public class EstoqueFiller {

	private final Estoque estoque = new Estoque();

	public EstoqueFiller() {

		this.estoque.incluir(
				new Item("Paiero Paulistinha", "Cigarro de Palha Artesanal", 9, 15, 25)
		);
		this.estoque.incluir(
				new Item("Paiero Coiote", "Cigarro de Palha Artesanal", 7, 13, 25)
		);
		this.estoque.incluir(
				new Item("Cachimbo de Madeira", "Cachimbo", 30, 50, 5)
		);
		this.estoque.incluir(
				new Item("Bong de Vidro", "Bong", 50, 80, 3)
		);

	}

	public Estoque getEstoque() {

		return this.estoque;
	}

}
