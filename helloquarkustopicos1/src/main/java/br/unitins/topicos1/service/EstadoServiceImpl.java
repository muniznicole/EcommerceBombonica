package br.unitins.topicos1.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import javax.ws.rs.NotFoundException;

import br.unitins.topicos1.dto.EstadoDTO;
import br.unitins.topicos1.dto.EstadoResponseDTO;
import br.unitins.topicos1.model.Estado;
import br.unitins.topicos1.repository.EstadoRepository;

@ApplicationScoped
public class EstadoServiceImpl implements EstadoService {

    @Inject
    EstadoRepository estadoRepository;

    @Inject
    Validator validator;

    @Override
    public List<EstadoResponseDTO> getAll() {
        List<Estado> list = estadoRepository.listAll();
        return list.stream().map(EstadoResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public EstadoResponseDTO findById(Long id) {
        Estado estado = estadoRepository.findById(id);
        if (estado == null)
            throw new NotFoundException("Estado não encontrado.");
        return new EstadoResponseDTO(estado);
    }

    @Override
    @Transactional
    public EstadoResponseDTO create(EstadoDTO estadoDTO) throws ConstraintViolationException {
        validar(estadoDTO);

        Estado entity = new Estado();
        entity.setNome(estadoDTO.getNome());        
        estadoRepository.persist(entity);

        return new EstadoResponseDTO(entity);
    }

    @Override
    @Transactional
    public EstadoResponseDTO update(Long id, EstadoDTO estadoDTO) throws ConstraintViolationException{
        validar(estadoDTO);

        Estado entity = estadoRepository.findById(id);

        entity.setNome(estadoDTO.getNome());

        return new EstadoResponseDTO(entity);
    }

    private void validar(EstadoDTO estadoDTO) throws ConstraintViolationException {
        Set<ConstraintViolation<EstadoDTO>> violations = validator.validate(estadoDTO);
        if (!violations.isEmpty())
            throw new ConstraintViolationException(violations);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        estadoRepository.deleteById(id);
    }

    @Override
    public List<EstadoResponseDTO> findByNome(String nome) {
        List<Estado> list = estadoRepository.findByNome(nome);
        return list.stream().map(EstadoResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public long count() {
        return estadoRepository.count();
    }

}
