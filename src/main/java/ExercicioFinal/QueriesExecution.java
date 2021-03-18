package ExercicioFinal;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        CursoDAO cursoDAO = new CursoDAO();

        //=========================== 1 - Consulta =========================

        //List<Curso> cursos = cursoDAO.list();

        //cursos.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Curso cursoParaConsulta = cursoDAO.getById(3);

        //System.out.println(cursoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Curso cursoParaInsercao = new Curso(
                "Git",
                "4"
        );

        //cursoDAO.create(cursoParaInsercao);


        // =========================== 3 - Delete ===================================================
//        cursoDAO.list().stream().forEach(System.out::println);
//
//        cursoDAO.delete(7);
//
//        cursoDAO.list().stream().forEach(System.out::println);


        // =========================== 4 - Atualizar ================================================

        cursoDAO.list().stream().forEach(System.out::println);
        
        Curso cursoParaAtualizar = cursoDAO.getById(6);
        cursoParaAtualizar.setNome("VIM");
        cursoParaAtualizar.setDuracaoHoras("3");


        cursoDAO.update(cursoParaAtualizar);

        cursoDAO.list().stream().forEach(System.out::println);
    }
}
