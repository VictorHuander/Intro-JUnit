package com.PedroPedroVitor;

public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    public double saldo;
    public int status;

    public ContaMagica(){
        this.status = SILVER;
        this.saldo = 0;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
	
    public int getStatus(){
        return this.status;
    }
	
    public void deposito(int valor) throws INVALID_OPER_EXCEPTION{

    }

    public void retirada(int valor) throws INVALID_OPER_EXCEPTION{
        
    }
}
