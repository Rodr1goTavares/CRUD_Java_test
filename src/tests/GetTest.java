package tests;

public class GetTest {
    public static void main(String[] args) {
        Computer myPc = new Computer();
        myPc.getGPU("Intel HD 4600");
        myPc.getGPU("I5 4590");
        myPc.getRAM(8);

        myPc.showPC();
    }

    public static class Computer{
        private String GPU;
        private String CPU;
        private int RAM;

        public void showPC(){
            System.out.println("PC info: \n CPU: " + this.CPU + "\n GPU: " + this.GPU + "\n RAM: " + this.RAM + "Gb");
        }

        public void getGPU(String gpu){
            this.GPU = gpu;
        }

        public void getCPU(String cpu){
            this.CPU = cpu;
        }

        public void getRAM(int ram){
            this.RAM = ram;
        }
    }
}
