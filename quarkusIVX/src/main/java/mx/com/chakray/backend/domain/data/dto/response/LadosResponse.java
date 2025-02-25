package mx.com.chakray.backend.domain.data.dto.response;

public class LadosResponse {
    private String mensaje;

    public LadosResponse(){}

    public LadosResponse(String msj){
        this.mensaje = msj;
    }
    public String getMensaje(){return this.mensaje;}
    public void setMensaje(String msj){this.mensaje=msj;}
}
