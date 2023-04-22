package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.dto.EnderecoResponseDTO;

public interface EnderecoService {

    // recursos basicos
    List<EnderecoResponseDTO> getAll();

    EnderecoResponseDTO findById(Long id);

    EnderecoResponseDTO create(EnderecoDTO enderecoDTO);

    EnderecoDTO update(Long id, EnderecoDTO enderecoDTO);

    void delete(Long id);

}
