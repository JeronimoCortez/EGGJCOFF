/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Tienda {
    private String productos;
    private Integer precios;

    public Tienda() {
    }

    public Tienda(String productos, Integer precios) {
        this.productos = productos;
        this.precios = precios;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Integer getPrecios() {
        return precios;
    }

    public void setPrecios(Integer precios) {
        this.precios = precios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.productos);
        hash = 67 * hash + Objects.hashCode(this.precios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        if (!Objects.equals(this.precios, other.precios)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tienda{" + "productos=" + productos + ", precios=" + precios + '}';
    }
    
}
