package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.CompraDTO;
import br.unitins.topicos1.dto.CompraResponseDTO;

public interface CompraService {

    // recursos basicos
    List<CompraResponseDTO> getAll();

    CompraResponseDTO findById(Long id);

    CompraResponseDTO create(CompraDTO pessoaFisicaDTO);

    CompraResponseDTO update(Long id, CompraDTO pessoaFisicaDTO);

    void delete(Long id);

    // recursos extras

    List<CompraResponseDTO> findByNome(String nome);

    long count();

}
