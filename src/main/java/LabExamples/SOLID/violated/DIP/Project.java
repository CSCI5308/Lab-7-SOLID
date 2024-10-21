package LabExamples.SOLID.violated.DIP;

public class Project {

    public static void main(String[] args) {
        BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
