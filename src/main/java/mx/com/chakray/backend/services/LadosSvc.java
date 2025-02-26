package mx.com.chakray.backend.services;


import jakarta.enterprise.context.ApplicationScoped;
import mx.com.chakray.backend.domain.data.dto.response.LadosResponse;
import mx.com.chakray.backend.domain.data.dto.request.LadosRequest;
import mx.com.chakray.backend.domain.ports.services.LadosSvcPort;

@ApplicationScoped
public class LadosSvc implements LadosSvcPort {
    @Override
    public LadosResponse ladosTriangulos(LadosRequest lados) {
        int a = lados.getLadoA();
        int b = lados.getLadoB();
        int c = lados.getLadoC();
        String mensaje= "Es equilatero";

        if(a != b && a!=c){
            mensaje = "Es escaleno";
            return new LadosResponse(mensaje);
        }else if((a == b && a != c) || (a==c && a !=b) || (b== c && b !=a )) {
            mensaje = "Es isoseles";
            return new LadosResponse(mensaje);
        }else{return new LadosResponse(mensaje);}
    }
}
