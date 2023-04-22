package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.ListaDesejoDTO;
import br.unitins.topicos1.dto.ListaDesejoResponseDTO;

public interface ListaDesejoService {

    List<ListaDesejoResponseDTO> getAll();

    ListaDesejoResponseDTO findById(Long id);

    ListaDesejoResponseDTO create(ListaDesejoDTO listaDesejoDTO);

    ListaDesejoResponseDTO update(Long id, ListaDesejoDTO listaDesejoDTO);

    void delete(Long id);
   
}