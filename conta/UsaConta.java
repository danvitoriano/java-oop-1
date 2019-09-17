class UsaConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta c1 = new Conta();
        
        c.titular = "Dan";
        c.saldo = 1000;
        
        c1 = c;
        
        System.out.println(c.titular + " - " + c.saldo);
        System.out.println(c1.titular + " - " + c1.saldo);
        System.out.println(c1);
    }
}
