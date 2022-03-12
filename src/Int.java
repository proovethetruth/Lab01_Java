public class Int {
    int num = 0;

    Int() {};
    Int(int value) {
        num = value;
    }
    void increment() {
        num += 1;
    }
    void decrement() {
        num -= 1;
    }
    void add(Int n) {
        num += n.num;
    }
    void substract(Int n) {
        num -= n.num;
    }

    Int pow(int n) {
        int flag = 0;
        Int result = new Int(num);
        int origin = num;

        if(num < 0) {
            if(n % 2 != 0)
                flag = 1;
            result.num = 0 - result.num;
            origin = 0 - num;
        }

        if(n != 0) {
            for(int j = 1; j < n; j++) {
                int tmp = result.num;
                for(int i = 1; i < origin; i++)
                    result.num += tmp;
            }
        }
        else
            result.num = 1;
            
        if(flag == 1)
            result.num = 0 - result.num;
        return result;
    }

    public String toString() {
        return String.format("\n Your %s number is: %d", getClass().getName(), this.num);
    }
}
