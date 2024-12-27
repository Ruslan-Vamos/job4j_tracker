package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        HtmlReport htmlReport = new HtmlReport();
        String text = htmlReport.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
