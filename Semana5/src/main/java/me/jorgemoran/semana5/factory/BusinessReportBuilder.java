package me.jorgemoran.semana5.factory;

public class BusinessReportBuilder extends Document.DocumentBuilder {
    @Override
    public Document build() {
        // Configuraciones específicas para un informe de negocio
        document.setHeader("Confidential Business Report Header");
        return document;
    }
}
