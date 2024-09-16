public class Dependency {
    // Kelas Engine yang merepresentasikan mesin mobil
    static class Engine {
        public void start() {
            System.out.println("Engine is starting...");
        }

        public void stop() {
            System.out.println("Engine is stopping...");
        }
    }

    // Kelas Wheel yang merepresentasikan roda mobil
    static class Wheel {
        private String position;

        public Wheel(String position) {
            this.position = position;
        }

        public void rotate() {
            System.out.println(position + " wheel is rotating.");
        }

        public void stopRotation() {
            System.out.println(position + " wheel has stopped rotating.");
        }
    }

    // Kelas Car yang bergantung langsung pada Engine dan Wheel
    static class Car {
        private Engine engine;  // Dependency pada Engine
        private Wheel frontLeftWheel;  // Dependency pada Wheel
        private Wheel frontRightWheel; // Dependency pada Wheel
        private Wheel rearLeftWheel;   // Dependency pada Wheel
        private Wheel rearRightWheel;  // Dependency pada Wheel

        public Car() {
            // Membuat dependency di dalam class Car
            engine = new Engine();
            frontLeftWheel = new Wheel("Front Left");
            frontRightWheel = new Wheel("Front Right");
            rearLeftWheel = new Wheel("Rear Left");
            rearRightWheel = new Wheel("Rear Right");
        }

        public void startCar() {
            System.out.println("Car is starting...");
            engine.start();
            frontLeftWheel.rotate();
            frontRightWheel.rotate();
            rearLeftWheel.rotate();
            rearRightWheel.rotate();
            System.out.println("Car has started.\n");
        }

        public void stopCar() {
            System.out.println("Car is stopping...");
            frontLeftWheel.stopRotation();
            frontRightWheel.stopRotation();
            rearLeftWheel.stopRotation();
            rearRightWheel.stopRotation();
            engine.stop();
            System.out.println("Car has stopped.\n");
        }
    }

    // Program utama untuk menjalankan simulasi
    public static void main(String[] args) {
        // Membuat objek Car
        Car myCar = new Car();

        // Memulai mobil
        myCar.startCar();

        // Menghentikan mobil
        myCar.stopCar();
    }
}
