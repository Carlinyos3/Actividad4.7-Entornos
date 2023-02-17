package alumno;

import java.util.Objects;

/**
 * En esta clase se crearan y gestionaran los atributos del objeto alumno.
 *
 * @author Carlos Arjona Badia
 */
public class Alumno {

    private String nombre;
    private double nota;
    
    /**
     * Construimos un Alumno con el Nombre y la Nota
     * @param nombre Es un dato tipo String
     * @param notaMedia Es un dato tipo Double
     */
    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.nota = notaMedia;
    }

    
    /**
     * Devolvemos el nombre del Alumno
     * @return Devolvemos un dato tipo String con el nombre del Alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Introducimos el nombre del Alumno
     * @param nombre Introducimos un dato tipo String que sera el nombre del Alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devolvemos la nota del Alumno
     * @return Devolvemos un dato tipo double con la nota del Alumno
     */
    public double getNota() {
        return nota;
    }

    /**
     * Introduce la nota del alumno
     * @param nota Introducimos un dato tipo double que sera la nota del Alumno
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    /**
     * El metodo hash por defecto muestra el hash de un objeto.<br>
     * Sirve para comparar dos objetos ya que tambien tienen que tener el mismo hash
     * @return Un dato tipo int que contiene el hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        return hash;
    }
    
    /**
     * El metodo equals por defecto compara solo los datos Sting de dos objetos<br>
     * El nuestro compara tanto el nombre del alumno como la nota
     * @param obj Es otro Alumno
     * @return Verdadero(Si son el mismo alumno) o Falso (Si no lo son)
     */
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
        final Alumno other = (Alumno) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    /**
     * El metodo toString por defecto muestra la posicion en memoria<br>
     * El nuestro al estar sobreescrito muestra los datos del Alumno
     * @return Un dato del tipo String que contiene los datos del Alumno
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notaMedia=" + nota + '}';
    }
    
    
}
