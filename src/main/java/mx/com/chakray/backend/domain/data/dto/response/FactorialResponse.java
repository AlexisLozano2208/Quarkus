package mx.com.chakray.backend.domain.data.dto.response;

import mx.com.chakray.backend.domain.data.dto.request.FactorialRequest;

public class FactorialResponse {
    private long factorialResult;
    private String message;

    public FactorialResponse(){}
    public FactorialResponse(long resultado, String mensaje){
        this.message=mensaje;
        this.factorialResult=resultado;
    }


    public long getFactorialResult(){
        return this.factorialResult;
    }
    public String getMessage(){
        return this.message;
    }
    public void setFactorialResult(long numeroFactorial){
        this.factorialResult = numeroFactorial;
    }
    public void setMessage(String msj){
        this.message = msj;
    }
}
