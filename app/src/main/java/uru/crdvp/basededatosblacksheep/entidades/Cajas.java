package uru.crdvp.basededatosblacksheep.entidades;

public class Cajas {
    private Integer idCaja;
    private Integer idPerfil;
    private String nombre;
    private Integer porcentaje;
    private Integer monto;
    private String descripcion;

    public Cajas(Integer idCaja, Integer idPerfil, String nombre, Integer porcentaje, Integer monto, String descripcion) {
        this.idCaja = idCaja;
        this.idPerfil = idPerfil;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
