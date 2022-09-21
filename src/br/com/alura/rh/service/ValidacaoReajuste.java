package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento);

}
