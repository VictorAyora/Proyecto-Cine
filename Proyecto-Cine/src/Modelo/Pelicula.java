package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
@Entity
public class Pelicula {

    private int id_pelicula;
    public String external_id_pelicula;
    public String titulo;
    public String sinopsis;
    public Boolean subtitulos;
    public String proveedor;
    public String genero;
    public String formato;
    public int anio;
    public String idioma;
    public int duracion;
    public String portada;
    public String actores;
    public String director;
    private Boolean estado_pelicula;

    private Cartelera carte;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getExternal_id_pelicula() {
        return external_id_pelicula;
    }

    public void setExternal_id_pelicula(String external_id_pelicula) {
        this.external_id_pelicula = external_id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getEstado_pelicula() {
        return estado_pelicula;
    }

    public void setEstado_pelicula(Boolean estado_pelicula) {
        this.estado_pelicula = estado_pelicula;
    }

    public Cartelera getCarte() {
        return carte;
    }

    public void setCarte(Cartelera carte) {
        this.carte = carte;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Boolean getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(Boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Boolean getEstado() {
        return estado_pelicula;
    }

    public void setEstado(Boolean estado) {
        this.estado_pelicula = estado;
    }

}
