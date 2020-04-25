package com.PedroPedroVitor;

public class TesteContaMagica {

    @Test
    public void silverToGold(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(50000);
        assertEquals(1, cm.getStatus());
    }

    @Test
    public void silverToPlatinum(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(200000);
        cm.deposito(100000);
        assertEquals(2, cm.getStatus());
    }

    @Test
    public void platinumToGold(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(200000);
        cm.deposito(1);
        cm.retirada(150001);
        assertEquals(1, cm.getStatus());
    }

    @Test
    public void platinumToSilver(){
        ContaMagica cm = new ContaMagica();
        cm.deposito(200000);
        cm.deposito(1);
        cm.retirada(150001);
        cm.retirada(40000);
        assertEquals(0, cm.getStatus());
    }
}