package Modelo;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
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

    public Pelicula(int id, String external_id, String titulo, String sinopsis, Boolean subtitulos, String proveedor, String genero, String formato, int anio, String idioma, int duracion, String portada, String actores, String director, Boolean estado) {
        this.id_pelicula = id;
        this.external_id_pelicula = external_id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.subtitulos = subtitulos;
        this.proveedor = proveedor;
        this.genero = genero;
        this.formato = formato;
        this.anio = anio;
        this.idioma = idioma;
        this.duracion = duracion;
        this.portada = portada;
        this.actores = actores;
        this.director = director;
        this.estado_pelicula = estado;
    }

    public int getId() {
        return id_pelicula;
    }

    public void setId(int id) {
        this.id_pelicula = id;
    }

    public String getExternal_id() {
        return external_id_pelicula;
    }

    public void setExternal_id(String external_id) {
        this.external_id_pelicula = external_id;
    }

    public String getTitulo() {
        return titulo;
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
