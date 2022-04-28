package com.castelar.agenda.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Objects;

public class Persona {
    private final StringProperty nombre = new SimpleStringProperty("nombre");
    private final StringProperty apellidos = new SimpleStringProperty("apellido1");
    private final IntegerProperty telefono = new SimpleIntegerProperty(666);

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int telefono) {
        this.nombre.set(nombre);
        this.apellidos.set(apellidos);
        this.telefono.set(telefono);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public StringProperty apellidosProperty() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }

    public int getTelefono() {
        return telefono.get();
    }

    public IntegerProperty telefonoProperty() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono.set(telefono);
    }

    @Override
    public String toString() {
        return nombre.get() + " " + apellidos.get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos) && Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, telefono);
    }
}
