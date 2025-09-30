package negocio;

import datos.Paciente;
import datos.PacienteDAO;
import java.util.*;

public class PacienteService {
    private PacienteDAO dao;

    public PacienteService() {
        dao = new PacienteDAO();
    }

    public List<Paciente> listarPacientes() {
        return dao.getAll();
    }

    public boolean agregarPaciente(String id, String nombre, String dni, String telefono) {
        if (nombre.isBlank() || dni.isBlank()) return false; // validación básica
        List<Paciente> lista = dao.getAll();
        for (Paciente p : lista) {
            if (p.getDni().equals(dni)) return false; // evitar duplicados por DNI
        }
        lista.add(new Paciente(id, nombre, dni, telefono));
        dao.saveAll(lista);
        return true;
    }

    public boolean eliminarPaciente(String dni) {
        List<Paciente> lista = dao.getAll();
        boolean removed = lista.removeIf(p -> p.getDni().equals(dni));
        if (removed) dao.saveAll(lista);
        return removed;
    }
}
