package com.PedroPedroVitor;

public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    private int saldo;
    private int status;

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
        if(valor <= 0){
            throw new INVALID_OPER_EXCEPTION("nao eh possivel depositar valores nulos ou negativos");
        }

        if(status == SILVER){
            this.saldo += valor;
            if(this.saldo >= 50000){
                this.status = 1;
            }
        }
        else if(status == GOLD){
            this.saldo += valor + valor/100;
            if(this.saldo >= 200000){
                this.status = 2;
            }
        }
        else if(status == PLATINUM){
            this.saldo += valor + 2.5*(valor/100);
        }
    }

    public void retirada(int valor) throws INVALID_OPER_EXCEPTION{
        
    }
}
