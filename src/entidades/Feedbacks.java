package entidades;

import java.time.LocalDate;

public class Feedbacks {

    public int id;
    public LocalDate dataEntrada;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataEntrada() {
        return this.dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "\nID='" + getId() + "'" +
                "\nData Entrada='" + getDataEntrada();
    }

}
