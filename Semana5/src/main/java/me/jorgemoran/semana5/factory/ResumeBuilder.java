package me.jorgemoran.semana5.factory;

public class ResumeBuilder extends Document.DocumentBuilder {
    @Override
    public Document build() {
        // Configuraciones específicas para un currículum
        document.setHeader("Curriculum Vitae");
        return document;
    }
}
