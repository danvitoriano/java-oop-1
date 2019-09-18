class TestaConta {
    public static void main(String[] args) {
    
        // usando construtor com parametro titular
        Conta c1 = new Conta("Maria"); 
        
        // imprime titular
        System.out.println(c1.getTitular()); 
        
        // setters
        c1.setTitular("Dan");
        c1.setAgencia("Centro");
        c1.setNumero(123);
        c1.setSaldo(1000.0);
        c1.setDataDeAbertura("10/01/1994");
        
        // deposita
        c1.deposita(100.0);
        
        // imprime
        System.out.println("saldo atual: " + c1.getSaldo());
        System.out.println("rendimento mensal: " + c1.getRendimento());
        System.out.println(c1.recuperaDadosParaImpressao());
        
        // retorna identificador estático da conta 2
        System.out.println("id1: " + Conta.getIdentificador());
        
        // cria nova conta 
        Conta c2 = new Conta();
        c2.setTitular("Dan");
        c2.setSaldo(1000.0);
        
        // retorna identificador estático da conta 2
        System.out.println("id2: " + Conta.getIdentificador());
        
        // setters
        c1.setTitular("Hugo");
        c1.setSaldo(200.0);
        
        // agora c2 recebe a mesma referencia que c1
        c2 = c1; 
        
        // checa se objetos são iguais
        if(c1 == c2){
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        
    }
}
