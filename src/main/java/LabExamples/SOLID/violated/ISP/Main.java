package LabExamples.SOLID.violated.ISP;

public class Main {
    public static void main(String[] args) {
        // Create a new document and add some text to it
        Document document = new Document();
        document.addDocument("This is a test document.");

        // Create an instance of OldFashionedPrinter
        OldFashionedPrinter oldFashionedPrinter = new OldFashionedPrinter();

        // Print using the old fashioned printer
        System.out.println("Using OldFashionedPrinter:");
        oldFashionedPrinter.print(document);

        // Attempt to fax and scan using the old fashioned printer (expect exceptions)
        try {
            oldFashionedPrinter.fax(document);
        } catch (Exception e) {
            System.out.println("Faxing failed on OldFashionedPrinter: " + e.getMessage());
        }

        try {
            oldFashionedPrinter.scan(document);
        } catch (Exception e) {
            System.out.println("Scanning failed on OldFashionedPrinter: " + e.getMessage());
        }

        // Create an instance of MultiFunctionPrinter
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();

        // Print, fax, and scan using the multi-function printer
        System.out.println("\nUsing MultiFunctionPrinter:");
        multiFunctionPrinter.print(document);

        try {
            multiFunctionPrinter.fax(document);
        } catch (Exception e) {
            System.out.println("Faxing failed on MultiFunctionPrinter: " + e.getMessage());
        }

        try {
            multiFunctionPrinter.scan(document);
        } catch (Exception e) {
            System.out.println("Scanning failed on MultiFunctionPrinter: " + e.getMessage());
        }
    }
}