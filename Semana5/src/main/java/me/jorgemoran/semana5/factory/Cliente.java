package me.jorgemoran.semana5.factory;

public class Cliente {
    public static void main(String[] args) {
        Document businessReport = DocumentFactory.createBusinessReport("Annual Report 2024", "Annual financial performance.");
        Document resume = DocumentFactory.createResume("John Doe", "Experienced software developer.");
        Document generico = DocumentFactory.createDocument("resume","Contenido de mi CV");
        Document daily = DocumentFactory.createDocument("daily","Contenido de reporte diario");
        businessReport.printDetails();
        resume.printDetails();
        generico.printDetails();
        daily.printDetails();
    }
}
