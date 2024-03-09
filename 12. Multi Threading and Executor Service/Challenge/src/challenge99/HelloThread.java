package challenge99;

class HelloThread extends Thread {
    public Print print;

    HelloThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread: " + print.getPrintNum());
        }
    }
}
