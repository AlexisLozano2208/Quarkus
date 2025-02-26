package mx.com.chakray.backend.domain.data.dto.request;

public class FactorialRequest {

    private int numeroFactorial;

    public FactorialRequest(){}

    public int getNumeroFactorial(){
        return this.numeroFactorial;
    }
    public void setNumeroFactorial(int factorial){
        this.numeroFactorial= factorial;
    }
}
