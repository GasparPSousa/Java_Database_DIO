package ExercicioFinal;

public class Curso {

    private int id;
    private String nome;
    private String duracao_horas;

    public Curso(int id, String nome, String duracaoHoras) {
        this.id = id;
        this.nome = nome;
        this.duracao_horas = duracaoHoras;

    }

    public Curso(String nome, String duracaoHoras) {
        this.nome = nome;
        this.duracao_horas = duracaoHoras;
    }

    public Curso() { }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracaoHoras() {
        return duracao_horas;
    }

    public void setDuracaoHoras(String duracaoHoras) {
        this.duracao_horas = duracaoHoras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", duracaoHoras=").append(duracao_horas);
        sb.append('}');
        return sb.toString();
    }

}
