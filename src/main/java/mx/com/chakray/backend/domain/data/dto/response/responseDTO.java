package mx.com.chakray.backend.domain.data.dto.response;

public class responseDTO {
    private int resultado;
    private String Mensaje;
    public responseDTO(){

    }
    public responseDTO(int resultado, String msj){
        this.resultado = resultado;
        this.Mensaje=msj;
    }

    public int getResultado(){
    return this.resultado;
    }

    public void setResultado( int resultado, String msj){
        this.resultado=resultado;
        this.Mensaje = msj;
    }
    public String getMessage(){
        return this.Mensaje;
    }
}
