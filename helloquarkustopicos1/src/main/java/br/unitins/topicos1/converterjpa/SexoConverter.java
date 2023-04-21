package br.unitins.topicos1.converterjpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.unitins.topicos1.model.Endereco;

@Converter(autoApply = true)
public class SexoConverter implements AttributeConverter<Endereco, Integer>{

    @Override
    public Integer convertToDatabaseColumn(Endereco sexo) {
        return sexo == null ? null : sexo.getId();
    }

    @Override
    public Endereco convertToEntityAttribute(Integer id) {
        return Endereco.valueOf(id);
    }
    
}
