/**
 * Created by DAM on 21/9/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguridadSocialHashMaps {

    private List<Persona> personasList;
    private HashMap<String, Persona> personaMapDni = new HashMap<>();
    private HashMap<String, Persona> personaMapNumero = new HashMap<>();

    public SeguridadSocialHashMaps() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {
        if(!personaMapDni.containsKey(persona.getDNI())
                &&
                !personaMapNumero.containsKey(persona.getSs()));
    }

    public void bajaPersona(String dni) {
        personaMapNumero.remove(personaMapDni.get(dni).getSs());

    }
    //public int obtener
    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDni.get(dni);

    }

    public Persona obtenerPersonaPorNumSS(String ss) {

        return personaMapNumero.get(ss);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> aux= new ArrayList<>();
        for(Persona persona:personaMapDni.values()){
            if(persona.getSalario()>=min && persona.getSalario()<=max){
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return null;

    }

    public List<Persona> obtenerTodas(){
        return new ArrayList<>(personaMapDni.values());
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}
