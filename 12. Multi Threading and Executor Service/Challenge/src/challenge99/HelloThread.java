package challenge99;

class HelloThread extends Thread {
    private final int printNum;

    public HelloThread(int printNum) {
        this.printNum = printNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread: " + printNum);
        }
    }
}
