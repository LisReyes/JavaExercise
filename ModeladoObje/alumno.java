/* Para el modelado si es - privado # protected */

class alumno {
    private String nombre, apellidos,DNI,telefono;

    public alumno(){
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getApellidos(){return apellidos;}
    public void setApellidos(String apellido){this.apellidos=apellido;}
    public String getDNI(){return DNI;}
    public void setDNI(String DNI){this.DNI = DNI;}
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono=telefono;}
}
