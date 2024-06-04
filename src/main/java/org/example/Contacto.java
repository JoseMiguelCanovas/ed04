package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Jose5
 * @version 1.0 04/06/2024
 * Una clase Contacto que almacena el nombre y una lista de teléfonos para cada contacto.
 */
class Contacto {
    /**
     * Atributo que almacena el nombre del contacto
     */
    private String name;
    private List<String> phones;
    /**
     * Método constructor de la clase Contacto al que hay que pasarle los dos atributos clase
     * @param name Nombre del contacto
     * @param phone Lista de teléfonos del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}