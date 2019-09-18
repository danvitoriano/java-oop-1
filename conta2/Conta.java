class Conta {

    /*
    ATRIBUTOS
    */
    private String agencia;
    private int numero;
    private String titular;
    private double saldo;
    private String dataDeAbertura;
    
    /*
    CONSTRUTORES
    */
    
    public Conta(){
        // construtor sem argumentos
    }
    
    // construtor passando titular
    public Conta(String titular){
        this.titular = titular;
    }
    
    /*
    MÉTODOS
    */
    
    void saca(double valor){
        this.saldo -= valor;
    };
    
    void deposita(double valor){
        this.saldo += valor;
    };
    
    double getRendimento(){
        return this.saldo *= 0.1;
    };
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        return dados;
    }
    
    /*
    GETTERS AND SETTERS
    */
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getDataDeAbertura() {
        return this.dataDeAbertura;
    }
    
    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
