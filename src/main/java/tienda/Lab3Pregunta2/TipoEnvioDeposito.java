package tienda.Lab3Pregunta2;

public class TipoEnvioDeposito extends TipoReparto {
    public String definirTipoReparto() {
        this.setTipoR("ENVIO POR DEPOSITO AL CLIENTE");
        return this.getTipoR();
    }
    public void definirReparto(AbstractHorarioEntrega horarioEntrega){
        horarioEntrega.determinarHorarioEntrega();
        System.out.println("El tipo de reparto es " + definirTipoReparto() + " y con horario :" + horarioEntrega.getHorario());
    }
}