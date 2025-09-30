package datos;

import java.io.*;
import java.util.*;

import entidades.Medico;

public class MedicoDAO{
	private final String FILE = "medicos.txt";
	
	public List<Medico> getAll(){
		List<Medico> lista = new ArrayList<>();
		
		File file = new File(FILE);
		if (!file.exists()) return lista;
		
		try(BufferedReader br =  new BufferedReader(new FileReader(file))) {
			String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Medico.fromString(linea));
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void saveAll(List<Medico> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE))) {
            for (Medico m : lista) {
                pw.println(m.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}