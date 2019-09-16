class LojaDescontos {
    
    public static void main(String[] args) {
    
        int qtde = 3;
        double compra = 2000;
        double pgto = compra;
        
        if(compra > 1000 || qtde > 3){
            pgto = compra * 0.90;
            System.out.println("pgto = " + pgto);
        } else if(compra > 500) {
            pgto = compra * 0.95;
            System.out.println("pgto = " + pgto);
        } else {
            System.out.println("pgto = " + pgto);
        }
    }
}
