package ExercicioFinal;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

        //=========================== 1 - Consulta =========================

        List<Curso> cursos = cursoDAO.list();

        //cursos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Curso cursoParaConsulta = cursoDAO.getById(3);

        //System.out.println(cursoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Curso cursoParaInsercao = new Curso(
                "Linux",
                "15"
        );

        cursoDAO.create(cursoParaInsercao);
    }
}
