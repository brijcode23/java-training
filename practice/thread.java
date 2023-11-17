package practice;

class MyThread extends Thread {
public void run() {
for (int i = 0; i < 20; i++) {
System.out.println("child Thread");
}
}
}

class ThreadDemo {
public static void main(String[] args) {
MyThread t = new MyThread();
t.start();
for (int i = 0; i < 20; i++) {
System.out.println("main thread");
}
}
}


