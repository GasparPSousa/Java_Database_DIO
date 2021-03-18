package ExercicioFinal;

public class Curso {

    private int id;
    private String nome;
    private String duracao_horas;

    public Curso(int id, String nome, String duracao_horas) {
        this.id = id;
        this.nome = nome;
        this.duracao_horas = duracao_horas;

    }

    public Curso(String nome, String duracao_horas) {
        this.nome = nome;
        this.duracao_horas = duracao_horas;
    }

    public Curso() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = this.id;
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

    public void setDuracaoHoras(String duracao_horas) {
        this.duracao_horas = duracao_horas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", duracao_horas=").append(duracao_horas);
        sb.append('}');
        return sb.toString();
    }

}
