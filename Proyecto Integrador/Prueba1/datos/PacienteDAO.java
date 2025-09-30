package datos;

import java.io.*;
import java.util.*;

public class PacienteDAO {
    private final String FILE = "pacientes.txt";

    public List<Paciente> getAll() {
        List<Paciente> lista = new ArrayList<>();
        File f = new File(FILE);
        if (!f.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Paciente.fromString(linea));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void saveAll(List<Paciente> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Paciente p : lista) {
                pw.println(p.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
