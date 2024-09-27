package DATOS.DAO;
        
        
import NEGOCIOS.EventoDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO {
    private Connection connection;

    // Constructor que establece la conexión a la base de datos
    public EventoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para agregar un nuevo evento
    public void agregarEvento(EventoDTO evento) throws SQLException {
        String sql = "INSERT INTO Eventos (nombre_evento, fecha_evento, venue, ciudad, estado, descripcion) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, evento.getNombreEvento());
            statement.setDate(2, new java.sql.Date(evento.getFechaEvento().getTime()));
            statement.setString(3, evento.getVenue());
            statement.setString(4, evento.getCiudad());
            statement.setString(5, evento.getEstado());
            statement.setString(6, evento.getDescripcion());
            statement.executeUpdate();
        }
    }

    // Método para obtener todos los eventos
    public List<EventoDTO> obtenerEventos() throws SQLException {
        List<EventoDTO> eventos = new ArrayList<>();
        String sql = "SELECT * FROM Eventos";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                EventoDTO evento = new EventoDTO(
                        resultSet.getInt("id_evento"),
                        resultSet.getString("nombre_evento"),
                        resultSet.getDate("fecha_evento"),
                        resultSet.getString("venue"),
                        resultSet.getString("ciudad"),
                        resultSet.getString("estado"),
                        resultSet.getString("descripcion")
                );
                eventos.add(evento);
            }
        }
        return eventos;
    }

    // Método para actualizar un evento
    public void actualizarEvento(EventoDTO evento) throws SQLException {
        String sql = "UPDATE Eventos SET nombre_evento = ?, fecha_evento = ?, venue = ?, ciudad = ?, estado = ?, descripcion = ? WHERE id_evento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, evento.getNombreEvento());
            statement.setDate(2, new java.sql.Date(evento.getFechaEvento().getTime()));
            statement.setString(3, evento.getVenue());
            statement.setString(4, evento.getCiudad());
            statement.setString(5, evento.getEstado());
            statement.setString(6, evento.getDescripcion());
            statement.setInt(7, evento.getIdEvento());
            statement.executeUpdate();
        }
    }

    // Método para eliminar un evento
    public void eliminarEvento(int idEvento) throws SQLException {
        String sql = "DELETE FROM Eventos WHERE id_evento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idEvento);
            statement.executeUpdate();
        }
    }

    // Método para obtener un evento por ID
    public EventoDTO obtenerEventoPorId(int idEvento) throws SQLException {
        EventoDTO evento = null;
        String sql = "SELECT * FROM Eventos WHERE id_evento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idEvento);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                evento = new EventoDTO(
                        resultSet.getInt("id_evento"),
                        resultSet.getString("nombre_evento"),
                        resultSet.getDate("fecha_evento"),
                        resultSet.getString("venue"),
                        resultSet.getString("ciudad"),
                        resultSet.getString("estado"),
                        resultSet.getString("descripcion")
                );
            }
        }
        return evento;
    }
}
