public class Computer {
    static class Processor {
        void displayDetails() {
            System.out.println("Brand: " + "Intel");
            System.out.println("Speed: " + 3.5);
        }
    }

    void showProcessorDetails() {
        Processor processor = new Processor();
        processor.displayDetails();
    }
}