package presentacion;

import negocio.MedicoService;
import entidades.Medico;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Principal extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private MedicoService service;
    private JTextArea area;

    public Principal() {
        service = new MedicoService();
        setTitle("Gestión de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        JButton btnListar = new JButton("Listar");
        btnListar.addActionListener(e -> mostrarPacientes());

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("ID:");
            String nombre = JOptionPane.showInputDialog("Nombre:");
            String esp = JOptionPane.showInputDialog("Especialidad:");
            String tel = JOptionPane.showInputDialog("Teléfono:");
            boolean ok = service.agregarPaciente(id, nombre, esp, tel);
            JOptionPane.showMessageDialog(this, ok ? "Medico agregado" : "Error al agregar");
        });

        JButton btnEliminar = new JButton("Eliminar por DNI");
        btnEliminar.addActionListener(e -> {
            String id = JOptionPane.showInputDialog("Ingrese ID a eliminar:");
            boolean ok = service.eliminarPaciente(id);
            JOptionPane.showMessageDialog(this, ok ? "Eliminado" : "No encontrado");
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnListar);
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);

        add(scroll, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void mostrarPacientes() {
        List<Medico> lista = service.listarPacientes();
        area.setText("");
        for (Medico p : lista) {
            area.append(p.getId() + " - " + p.getNombre() + " - " + p.getEspecialidadString() + " - " + p.getTelefonoString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Principal().setVisible(true));
    }
}
