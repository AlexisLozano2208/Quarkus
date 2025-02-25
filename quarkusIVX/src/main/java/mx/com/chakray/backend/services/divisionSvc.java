package mx.com.chakray.backend.services;

import jakarta.enterprise.context.ApplicationScoped;
import mx.com.chakray.backend.domain.data.dto.request.RequestDto;
import mx.com.chakray.backend.domain.data.dto.response.responseDTO;
import mx.com.chakray.backend.domain.ports.services.divisionSvcPort;

@ApplicationScoped
public class divisionSvc implements divisionSvcPort{
    @Override
    public responseDTO resultDivision(RequestDto numero) {
        int numero1 = numero.getNumero();
        int numero2=20;
        int res;
        String msj;
        try {
            res= numero2 / numero1;
            msj="Todo bien";
            return new responseDTO(res,msj);

        } catch (Exception e) {
            System.out.println("no jala");
            res=0;
            msj="no es divisible";
            return new responseDTO(res,msj);
        }


    }


}
