package LabExamples.SOLID.solved.ISP;

public class Main {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            document.addDocument("Offer");
            document.addDocument("Invoice");

            // Create instances of devices
            PrinterHP printerHP = new PrinterHP();
            ScannerSony scannerSony = new ScannerSony();  
            PhotocopierHP photocopierHP = new PhotocopierHP();
            FaxPanasonic faxPanasonic = new FaxPanasonic();

            // Use the single-function printer
            System.out.println("Single-function HP Printer:");
            printerHP.Print(document);

            // Use the single-function scanner
            System.out.println("\nSingle-function Sony Scanner:");
            scannerSony.Scan(document);

            // Use the photocopier (which is both printer and scanner)
            System.out.println("\nHP Photocopier:");
            photocopierHP.Print(document);
            photocopierHP.Scan(document);

            // Multi-function machine integration
            MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine(printerHP, scannerSony, faxPanasonic);
            System.out.println("\nMulti-Function Machine:");
            multiFunctionMachine.Print(document);
            multiFunctionMachine.Scan(document);
            multiFunctionMachine.InternetFax(document);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}