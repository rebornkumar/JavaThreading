
void receiveAndExecuteClientOrdersBetter() {
    while(true) {
        final Order order = waitForNextOrder();
        Thread thread = new Thread(new Runnable()) {
            public void run() {
                order.execute();
            }
        });
        thread.start();
    }
}