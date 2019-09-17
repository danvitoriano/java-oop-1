class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.titular = "Dan";
        c1.agencia = "Centro";
        c1.numero = 123;
        c1.saldo = 1000.0;
        c1.dataDeAbertura = "10/01/1994";
        
        
        c1.deposita(100.0);
        
        System.out.println("saldo atual: " + c1.saldo);
        System.out.println("rendimento mensal: " + c1.calculaRendimento());
        System.out.println(c1.recuperaDadosParaImpressao());
        
        
        Conta c2 = new Conta();
        c2.titular = "Dan";
        c2.saldo = 1000.0;
        
        c1.titular = "Hugo";
        c1.saldo = 200.0;
        
        c2 = c1;
        
        if(c1 == c2){
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        
    }
}
