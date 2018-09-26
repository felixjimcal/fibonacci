public class Fibo {

    int Fib(int number) {

        if (number == 1 || number == 2)
        {
            return 1;
        }
        return Fib(number - 1) + Fib(number - 2);
    }
}
