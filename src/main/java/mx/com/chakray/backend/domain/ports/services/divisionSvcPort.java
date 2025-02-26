package mx.com.chakray.backend.domain.ports.services;

import mx.com.chakray.backend.domain.data.dto.request.RequestDto;
import mx.com.chakray.backend.domain.data.dto.response.responseDTO;


public interface divisionSvcPort {
    responseDTO resultDivision(RequestDto numero);
}
