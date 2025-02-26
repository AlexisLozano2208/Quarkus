package mx.com.chakray.backend.domain.ports.services;

import mx.com.chakray.backend.domain.data.dto.request.FactorialRequest;
import mx.com.chakray.backend.domain.data.dto.response.FactorialResponse;

public interface FactorialSvcPort {

    FactorialResponse calcularFactorial(FactorialRequest numeroF);
}
