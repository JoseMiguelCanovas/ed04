package org.example;

import java.util.*;

public class agendaContactos {

    private List<Contacto> contacts; // Lista de Contacto

    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
    /**
     * Método que permite borrar un contacto de la agenda a partir de su nombre
     * @param name Nombre del contacto a borrar
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
    /**
     * Método que permite modificar el número de teléfono asociado a un contacto
     * @param name Nombre del contacto al que queremos modificar el número de teléfono
     * @param oldPhone Numero de teléfono antiguo.
     * @param newPhone Numero de teléfono nuevo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}