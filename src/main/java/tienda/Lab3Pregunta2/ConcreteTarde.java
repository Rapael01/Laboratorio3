package tienda.Lab3Pregunta2;

public class ConcreteTarde extends AbstractHorarioEntrega{

    public ConcreteTarde() {
    }

    public ConcreteTarde(String horario) {
        super(horario);
    }

    @Override
    public void setHorario(String horario) {
        horario = "EL HORARIO DE ENTREGA ES EN LA TARDE DE 12pm A 3pm";
    }
}
