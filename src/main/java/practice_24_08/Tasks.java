package practice_24_08;

public class Tasks {

    public static void main(String[] args) throws InterruptedException {
        // Задача 1:
        // Требуется создать поток, который будет писать сообщение на экран раз в секунду.
        // Поток Main должен стартануть этот поток, подождать 10 секунд, остановить созданный поток и подождать пока
        // он завершится.

        // Задача 2:
        // Требуется создать потокобезопасный класс, который отвечает за счётчик с суммой. Предложите две реализации.
        // Методы: increment()/decrement()/getOperationsCount()

        // Задача 3:
        // Рассмотрим такой код:
        // Thread t = new Thread(() -> {
        //     System.out.println("Another thread");
        // });

        // t.start();
        // System.out.println("Main thread");
        // t.join();

        // Как можно его изменить таким образом, чтобы гарантированно выводить сообщение на печать из потока до того,
        // как будет напечатано сообщение из Main треда?

    }
}