package br.unitins.topicos1.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.ws.rs.NotFoundException;

import br.unitins.topicos1.dto.CompraDTO;
import br.unitins.topicos1.dto.CompraResponseDTO;
import br.unitins.topicos1.model.Compra;
import br.unitins.topicos1.model.Endereco;
import br.unitins.topicos1.repository.EstadoRepository;
import br.unitins.topicos1.repository.CompraRepository;

@ApplicationScoped
public class CompraServiceImpl implements CompraService {

    @Inject
    CompraRepository pessoaFisicaRepository;

    @Inject
    Validator validator;

    @Override
    public List<CompraResponseDTO> getAll() {
        List<Compra> list = pessoaFisicaRepository.listAll();
        return list.stream().map(CompraResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public CompraResponseDTO findById(Long id) {
        Compra pessoafisica = pessoaFisicaRepository.findById(id);
        if (pessoafisica == null)
            throw new NotFoundException("Pessoa Física não encontrada.");
        return new CompraResponseDTO(pessoafisica);
    }

    @Override
    @Transactional
    public CompraResponseDTO create(CompraDTO pessoaFisicaDTO) throws ConstraintViolationException {
        validar(pessoaFisicaDTO);

        Compra entity = new Compra();
        entity.setCpf(pessoaFisicaDTO.cpf());
        entity.setNome(pessoaFisicaDTO.nome());
        entity.setSexo(Endereco.valueOf(pessoaFisicaDTO.sexo()));

        pessoaFisicaRepository.persist(entity);

        return new CompraResponseDTO(entity);
    }

    @Override
    @Transactional
    public CompraResponseDTO update(Long id, CompraDTO pessoaFisicaDTO) throws ConstraintViolationException{
        validar(pessoaFisicaDTO);
   
        Compra entity = pessoaFisicaRepository.findById(id);
        entity.setCpf(pessoaFisicaDTO.cpf());
        entity.setNome(pessoaFisicaDTO.nome());
        entity.setSexo(Endereco.valueOf(pessoaFisicaDTO.sexo()));

        return new CompraResponseDTO(entity);
    }

    private void validar(CompraDTO pessoaFisicaDTO) throws ConstraintViolationException {
        Set<ConstraintViolation<CompraDTO>> violations = validator.validate(pessoaFisicaDTO);
        if (!violations.isEmpty())
            throw new ConstraintViolationException(violations);


    }

    @Override
    @Transactional
    public void delete(Long id) {
        pessoaFisicaRepository.deleteById(id);
    }

    @Override
    public List<CompraResponseDTO> findByNome(String nome) {
        List<Compra> list = pessoaFisicaRepository.findByNome(nome);
        return list.stream().map(CompraResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public long count() {
        return pessoaFisicaRepository.count();
    }

}
