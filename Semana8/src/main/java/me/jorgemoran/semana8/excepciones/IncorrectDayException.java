package me.jorgemoran.semana8.excepciones;

public class IncorrectDayException extends Exception{

    public IncorrectDayException(String elDiaEnviadoNoExiste) {
        super(elDiaEnviadoNoExiste);
    }
}
