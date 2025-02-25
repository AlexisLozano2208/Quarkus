package mx.com.chakray.backend.domain.data.dto.request;

public class LadosRequest {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public LadosRequest(){}

    public int getLadoA(){
        return this.ladoA;
    }
    public int getLadoB(){
        return this.ladoB;
    }
    public int getLadoC(){
        return this.ladoC;
    }
    public void setLadoA(int ladoA){
        this.ladoA = ladoA;

    }
    public void setLadoB(int ladoB){
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
}
