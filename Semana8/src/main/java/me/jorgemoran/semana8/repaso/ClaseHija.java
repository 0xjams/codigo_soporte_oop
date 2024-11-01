package me.jorgemoran.semana8.repaso;

public class ClaseHija extends ClaseBase{

    @Override
    public void metodoASobreescribir() {
        super.metodoASobreescribir();
        System.out.println("Estoy en ClaseHija");
    }

    public static void main(String[] args){
        ClaseHija hija = new ClaseHija();
        hija.metodoASobreescribir();
        hija.metodoASobreescribir("prueba");
    }
}
