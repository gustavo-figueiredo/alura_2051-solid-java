package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
	
	private BigDecimal valor;
	private LocalDate data;
	
	public Anuenio(BigDecimal valor) {
		super();
		this.valor = valor;
		data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	//Método não faz sentido para classe porém interface obriga implementação.
	@Override
	public BigDecimal valorImpostoDeRenda() {
		return BigDecimal.ZERO;
	}

	@Override
	public LocalDate data() {
		return data;
	}

}
