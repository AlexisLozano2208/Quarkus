package mx.com.chakray.backend.services;


import jakarta.enterprise.context.ApplicationScoped;
import mx.com.chakray.backend.domain.data.dto.request.FactorialRequest;
import mx.com.chakray.backend.domain.data.dto.response.FactorialResponse;
import mx.com.chakray.backend.domain.ports.services.FactorialSvcPort;


@ApplicationScoped
public class FactorialSvc implements FactorialSvcPort {
    @Override
    public FactorialResponse calcularFactorial( FactorialRequest numeroF){
        int numeroAFactorizar = numeroF.getNumeroFactorial();
        long numeroFac=Factorial(numeroAFactorizar);
        String msj = esPrimo(numeroFac,2);
        return new FactorialResponse(numeroFac,msj);
    }

    public long Factorial(int cifra){
        long factorial =1;
        if(cifra==0 || cifra==1){
            return 1;
        }
        factorial = (cifra * Factorial(cifra-1));
        return factorial;
    }

    public String esPrimo(long factorialResult, int divisor){
        String mensaje= "no es primo";
        if (factorialResult<2){
            return  mensaje;
        }
        if ((long) divisor * divisor>factorialResult){
            mensaje="Es primo";
            return mensaje;
        }
        if (factorialResult % divisor == 0){
            return mensaje;
        }
        return(esPrimo(factorialResult, divisor));
    }
}
