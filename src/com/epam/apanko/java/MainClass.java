public class MainClass {
    public static void main(String[] args) {
        // Пример переопределения статических и обычных методов
        // и затенения полей

        B b = new B();  // Создать новый объект типа B
        System.out.println(b.i);   // Ссылается на B.i; выводит 2
        System.out.println(b.j);   // Ссылается на B.j; выводит 2.0
        System.out.println(b.f()); // Ссылается на B.f(); выводит -2
        System.out.println(b.g()); // Ссылается на B.g(); выводит B
        System.out.println(B.g()); // Лучше вызывать B.g()

        A a = b;    // Привести b к экземпляру класса A
        System.out.println(a.i);   // Теперь ссылается на A.i; выводит 1
        System.out.println(a.j);   // Теперь ссылается на A.j; выводит 1.0
        System.out.println(a.f()); // instance на B.f(); выводит -2
        System.out.println(a.g()); // static на A.g(); выводит A
        System.out.println(A.g()); // Лучше вызывать A.g()

    }
}
