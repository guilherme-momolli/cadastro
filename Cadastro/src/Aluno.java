import java.util.ArrayList;

public class Aluno extends Pessoa{
    private String serie;
    private int ra;

    ArrayList<Aluno> alunoArrayList = new ArrayList<>();
    public Aluno(String nome, String cpf, int idade, String serie, int ra) {
        super(nome, cpf, idade);
        this.serie = serie;
        this.ra = ra;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public ArrayList<Aluno> getAlunoArrayList() {
        return alunoArrayList;
    }

    public void setAlunoArrayList(ArrayList<Aluno> alunoArrayList) {
        this.alunoArrayList = alunoArrayList;
    }
}
