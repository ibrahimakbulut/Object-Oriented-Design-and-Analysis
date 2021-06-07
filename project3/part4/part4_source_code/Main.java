public class Main {

    public static void main(String[] args) {

        DCT_Transform dct_transform= new DCT_Transform();
        DFT_Transform dft_transform = new DFT_Transform();

        System.out.println("Transform input with DCT");
        dct_transform.transformProcessSteps(args[0]);

        System.out.println("Transform input with DFT");
        dft_transform.transformProcessSteps(args[0]);

    }
}
