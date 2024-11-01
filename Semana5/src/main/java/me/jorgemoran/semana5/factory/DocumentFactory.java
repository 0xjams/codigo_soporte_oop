package me.jorgemoran.semana5.factory;

public class DocumentFactory {

    public static Document createBusinessReport(String title, String content) {
        return new BusinessReportBuilder()
                .setTitle(title)
                .setContent(content)
                .build();
    }

    public static Document createResume(String name, String content) {
        return new ResumeBuilder()
                .setTitle("Resume - " + name)
                .setContent(content)
                .build();
    }

    public static Document createDocument(String type, String content){
        if(type.equals("report")){
            return DocumentFactory.createBusinessReport("Titulo por defecto",content);
        }
        if(type.equals("daily")){
            Document.DocumentBuilder reporteDiario = new BusinessReportBuilder();
            reporteDiario.setTitle("Reporte Diario").setContent(content);
            return reporteDiario.build();
        }
        if(type.equals("resume")){
            return DocumentFactory.createResume("Nombre por defecto",content);
        }
        return null;
    }
}
