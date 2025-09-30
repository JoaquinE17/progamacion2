package negocio;

import datos.MedicoDAO;
import entidades.Medico;

import java.util.*;

public class MedicoService {
    private MedicoDAO dao;

    public MedicoService() {
        dao = new MedicoDAO();
    }

    public List<Medico> listarPacientes() {
        return dao.getAll();
    }

    public boolean agregarPaciente(String nombre, String id, String especialidad, String telefono) {
        if (nombre.isBlank() || id.isBlank()) return false; // validación básica
        List<Medico> lista = dao.getAll();
        for (Medico m : lista) {
            if (m.getId().equals(id)) return false; // evitar duplicados por DNI
        }
        lista.add(new Medico(nombre, id, especialidad, telefono));
        dao.saveAll(lista);
        return true;
    }

    public boolean eliminarPaciente(String id) {
        List<Medico> lista = dao.getAll();
        boolean removed = lista.removeIf(p -> p.getId().equals(id));
        if (removed) dao.saveAll(lista);
        return removed;
    }
}