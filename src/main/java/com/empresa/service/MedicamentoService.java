package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public Medicamento insertarActualizarMedicamento(Medicamento obj);
	public List<Medicamento> listaMedicamento();
	
}
