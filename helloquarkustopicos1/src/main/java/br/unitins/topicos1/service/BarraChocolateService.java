package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.BarraChocolateDTO;
import br.unitins.topicos1.dto.BarraChocolateResponseDTO;

public interface BarraChocolateService {

    List<BarraChocolateResponseDTO> getAll();

    BarraChocolateResponseDTO findById(Long id);

    BarraChocolateResponseDTO create(BarraChocolateDTO barraDTO);

    BarraChocolateResponseDTO update(Long id, BarraChocolateDTO barraDTO);

    void delete(Long id);
   
}