class Conta {
    String agencia;
    int numero;
    String titular;
    double saldo;
    String dataDeAbertura;
    
    void saca(double valor){
        this.saldo -= valor;
    };
    
    void deposita(double valor){
        this.saldo += valor;
    };
    
    double calculaRendimento(){
        return this.saldo *= 0.1;
    };
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        return dados;
    }
    
}

class Data {
    int dia;
    int mes;
    int ano;
}
