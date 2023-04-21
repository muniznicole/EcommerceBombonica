package br.unitins.topicos1.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.oracle.svm.core.annotate.Delete;

import br.unitins.topicos1.application.Result;
import br.unitins.topicos1.dto.CompraDTO;
import br.unitins.topicos1.dto.CompraResponseDTO;
import br.unitins.topicos1.service.CompraService;

@Path("/pessoasfisicas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CompraResource {
    
    @Inject
    CompraService pessoaFisicaService;

    @GET
    public List<CompraResponseDTO> getAll() {
        return pessoaFisicaService.getAll();
    }

    @GET
    @Path("/{id}")
    public CompraResponseDTO findById(@PathParam("id") Long id) {
        return pessoaFisicaService.findById(id);
    }

    @POST
    public Response insert(CompraDTO dto) {
        try {
            CompraResponseDTO pessoafisica = pessoaFisicaService.create(dto);
            return Response.status(Status.CREATED).entity(pessoafisica).build();
        } catch(ConstraintViolationException e) {
            Result result = new Result(e.getConstraintViolations());
            return Response.status(Status.NOT_FOUND).entity(result).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, CompraDTO dto) {
        try {
            CompraResponseDTO pessoafisica = pessoaFisicaService.update(id, dto);
            return Response.ok(pessoafisica).build();
        } catch(ConstraintViolationException e) {
            Result result = new Result(e.getConstraintViolations());
            return Response.status(Status.NOT_FOUND).entity(result).build();
        }      
    }

    @Delete
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        pessoaFisicaService.delete(id);
        return Response.status(Status.NO_CONTENT).build();
    }


    @GET
    @Path("/count")
    public long count(){
        return pessoaFisicaService.count();
    }

    @GET
    @Path("/search/{nome}")
    public List<CompraResponseDTO> search(@PathParam("nome") String nome){
        return pessoaFisicaService.findByNome(nome);
        
    }
}

