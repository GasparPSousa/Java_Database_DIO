package ExercicioFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {

    // 1- Consulta
    public List<Curso> list() {
        // Preparar a lista que irá retornar curso após consultar o BD.
        List<Curso> cursos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            // Preparar consulta SQL.
            String sql = "SELECT * FROM curso";

            //Preparar statement com os parâmetros recebidos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela curso)
            PreparedStatement stmt = conn.prepareStatement(sql);

            //Executa consulta e armazena o retorno da consulta no objeto "rs".
            ResultSet rs = stmt.executeQuery();

            //Criar um objeto curso e guardar na lista de cursos.
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String duracao_horas = rs.getString("duracao_horas");

                cursos.add(new Curso(
                        id,
                        nome,
                        duracao_horas
                        ));
            }

        } catch (SQLException e) {
            System.out.println("listam de cursos FALHOU!");
            e.printStackTrace();
        }
        //Retornar todos os cursos encontrados no BD.
        return cursos;
    }
}
