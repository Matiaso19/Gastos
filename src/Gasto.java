import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gasto {
    private LocalDate fecha;
    private Double monto;
    private Categoria categoria;

    public Gasto() {
    }

    public Gasto(String fechaString, Double monto, Categoria categoria) {
        this.monto = monto;
        this.categoria = categoria;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fecha = LocalDate.parse(fechaString, formatter);

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
