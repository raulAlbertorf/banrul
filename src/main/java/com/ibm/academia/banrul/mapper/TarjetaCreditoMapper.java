package com.ibm.academia.banrul.mapper;

import com.ibm.academia.banrul.models.dto.TarjetaCreditoDTO;
import com.ibm.academia.banrul.models.entities.TarjetaCredito;

public class TarjetaCreditoMapper {

	public static TarjetaCreditoDTO mapTarjetaCredito(TarjetaCredito tarjeta) {
		TarjetaCreditoDTO tarCreditoDTO = new TarjetaCreditoDTO();
		tarCreditoDTO.setId(tarjeta.getId());
		tarCreditoDTO.setNombre(tarjeta.getNombre());
		tarCreditoDTO.setSalarioMinimo(tarjeta.getSalarioMinimo());
		tarCreditoDTO.setSalarioMaximo(tarjeta.getSalarioMaximo());
		tarCreditoDTO.setEdadMinima(tarjeta.getEdadMinima());
		tarCreditoDTO.setEdadMaxima(tarjeta.getEdadMaxima());
		return tarCreditoDTO;
	}

}

