public class ContaBancaria {
    private String nome;
    private String tipo;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, String tipo, double saldo) {
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "***********************" +
                "\nDados iniciais do cliente:\n" +
                "\nNome: " + nome +
                "\nTipo conta: " + tipo +
                "\nSaldo: R$" + saldo +
                "\n***********************\n";
    }
}


