package ExercicioFinal;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

        //=========================== 1 - Consulta =========================

        List<Curso> cursos = cursoDAO.list();

        cursos.stream().forEach(System.out::println);
    }
}
