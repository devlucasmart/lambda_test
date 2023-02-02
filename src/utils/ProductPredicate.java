package utils;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	/* 1º forma de fazer Função de exluir numeros que são maiores ou igual a 100*/
	@Override
	public boolean test(Product p) {		
		return p.getPrice() >= 100.0;
	}
	
	

}
