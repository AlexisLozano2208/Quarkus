package mx.com.chakray.backend.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import mx.com.chakray.backend.domain.data.dto.request.LadosRequest;
import mx.com.chakray.backend.domain.data.dto.request.RequestDto;
import mx.com.chakray.backend.domain.data.dto.response.LadosResponse;
import mx.com.chakray.backend.domain.data.dto.response.responseDTO;
import mx.com.chakray.backend.domain.ports.services.FactorialSvcPort;
import mx.com.chakray.backend.domain.ports.services.LadosSvcPort;
import mx.com.chakray.backend.domain.ports.services.divisionSvcPort;
import mx.com.chakray.backend.domain.data.dto.request.FactorialRequest;
import mx.com.chakray.backend.domain.data.dto.response.FactorialResponse;
import mx.com.chakray.backend.domain.ports.services.FactorialSvcPort;

@Path("/hello")
@ApplicationScoped
public class ExampleResource {

    @Inject divisionSvcPort divisionSvcPort;
    @Inject LadosSvcPort ladosSvcPort;
    @Inject FactorialSvcPort factorialSvcPort;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    @Path("/division")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public responseDTO division(RequestDto numero) {
        return divisionSvcPort.resultDivision(numero);
    }

    @POST
    @Path("/triangulo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LadosResponse triangulos(LadosRequest numero) {
        return ladosSvcPort.ladosTriangulos(numero);
    }

    @POST
    @Path("/factorial")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public FactorialResponse calcFact(FactorialRequest numero) {
        return factorialSvcPort.calcularFactorial(numero);
    }
}
