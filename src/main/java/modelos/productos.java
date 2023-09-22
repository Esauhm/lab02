/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Esau
 */
public class productos {
    private int idProducto;
    private int idCategoria;
    private int idProveedor;
    private String nombreProducto;
    private double precioNormal;
    private boolean ofertado;
    private double precioOfertado;
    private int existencias;
    private String descripcion;
    private String imagen;

    // Constructor, getters y setters aquí

    public productos() {
    }
    

    public productos(int idProducto, int idCategoria, int idProveedor, String nombreProducto, double precioNormal, boolean ofertado, double precioOfertado, int existencias, String descripcion, String imagen) {
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
        this.nombreProducto = nombreProducto;
        this.precioNormal = precioNormal;
        this.ofertado = ofertado;
        this.precioOfertado = precioOfertado;
        this.existencias = existencias;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public boolean isOfertado() {
        return ofertado;
    }

    public void setOfertado(boolean ofertado) {
        this.ofertado = ofertado;
    }

    public double getPrecioOfertado() {
        return precioOfertado;
    }

    public void setPrecioOfertado(double precioOfertado) {
        this.precioOfertado = precioOfertado;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}


