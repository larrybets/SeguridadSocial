/**
 * Created by DAM on 21/9/16.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        personasList.add(persona);
    }

    public void bajaPersona(String dni) {
        personasList.remove(obtenerIndexPersonaPorDNI(dni));

    }

    //public int obtener
    public Persona obtenerPersonaPorDNI(String dni) {
        return personasList.get(obtenerIndexPersonaPorDNI(dni));

    }

    // num_seguridadsocial es Ss
    public Persona obtenerPersonaPorNumSS(String ss) {

        boolean encontrado = false;
        int contador = 0;
        Persona persona_aux;
        do {
            persona_aux = personasList.get(contador);
            if (persona_aux.getSs().equals(ss)) {
                encontrado = true;
            } else {
                contador++;
            }
        } while (!encontrado && contador < personasList.size());
        if (encontrado) {
            return persona_aux;
        } else {
            return null;
        }
    }

    public int obtenerIndexPersonaPorDNI(String dni) {
        boolean encontrado = false;
        int contador = 0;
        do {
            Persona persona_nueva = personasList.get(contador);
            if (persona_nueva.getDNI().equals(dni)) {
                encontrado = true;
            } else {
                contador++;
            }
        } while (!encontrado && contador < personasList.size());

        if (encontrado) {
            return contador;
        } else {
            return -1;
        }
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona> aux = new ArrayList<>();
        for (int i = 0; i < personasList.size(); i++) {
            Persona persona = personasList.get(i);
            if (persona.getSalario() >= min || persona.getSalario() <= max) {
                aux.add(personasList.get(i));

            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad) {
        List<Persona> personaListMayor = new ArrayList<>();
        for (int i = 0; i < personasList.size(); i++) {
            Persona persona = personasList.get(i);
            if (persona.getEdad() > edad) {
                personaListMayor.add(personasList.get(i));
            }
        }
        return personaListMayor;
    }

    public List<Persona> obtenerTodas() {
        return personasList;
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
