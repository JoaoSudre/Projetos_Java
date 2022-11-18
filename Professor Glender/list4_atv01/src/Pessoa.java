import java.util.Calendar;
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double IMC;
    private Data data_nascimento = new Data(idade, idade, idade);
    private String classificacao;

    public Pessoa (String nome, String sobrenome, int idade, double altura, double peso, double IMC, Data data_nascimento, String classificacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;
        this.data_nascimento = data_nascimento;
        this.classificacao = classificacao;
    }

    public double CalculaIMC(double peso, double altura) {
        return IMC = (peso/(Math.pow(altura, 2)));
    }

    public String InformaObesidade(double iMC) {
        if (IMC < 18.5){
            classificacao = "Abaixo do peso";
        } else if (IMC > 18.4 && IMC <= 24.9) {
            classificacao = "Peso normal";
        } else if (IMC > 24.9 && IMC <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (IMC > 29.9 && IMC <= 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (IMC > 34.9 && IMC <= 39.9) {
            classificacao = "Obesidade grau 2";
        } else if (IMC > 40) {
            classificacao = "Obesidade grau 3";
        }
        return classificacao;
    }

    public int CalculaIdade (Data data_nascimento) {
        Calendar atualdata = Calendar.getInstance();
        idade = (atualdata.get(Calendar.YEAR) - data_nascimento.getAno());
        return idade;
    }
    
    public Data getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }
    public void setIMC(double iMC) {
        IMC = iMC;
    }
    
}
