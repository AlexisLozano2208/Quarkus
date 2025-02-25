package mx.com.chakray.backend.domain.ports.services;

import mx.com.chakray.backend.domain.data.dto.request.LadosRequest;
import mx.com.chakray.backend.domain.data.dto.response.LadosResponse;

public interface LadosSvcPort{
    LadosResponse ladosTriangulos(LadosRequest lados);
}
