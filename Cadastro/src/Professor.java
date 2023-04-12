import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Professor extends Pessoa {
    private int registro;
    private double salario;

    ArrayList<Professor> professorArrayList = new ArrayList<>();
    public Professor(String nome, String cpf, int idade, int registro, double salario) {
        super(nome, cpf, idade);
        this.registro = registro;
        this.salario = salario;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Professor> getProfessorArrayList() {
        return professorArrayList;
    }

    public void setProfessorArrayList(ArrayList<Professor> professorArrayList) {
        this.professorArrayList = professorArrayList;
    }
}
