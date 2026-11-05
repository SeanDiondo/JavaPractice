package MachineProblem1Abstraction;

public class Main {

    public static void main(String[] args) {

        //View object
        LazadaView view = new LazadaView();

        //Controller object
        LazadaController controller = new LazadaController(view);

        // Start ordering
        controller.startOrdering();
    }
}