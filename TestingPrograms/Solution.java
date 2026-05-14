package TestingPrograms;
class Box<t1> {
    t1 value;

    void set(t1 value) {
        this.value = value;
    }

    t1 get() {
        return value;
    }
}
    class Solution {

        public static void main(String[] args) {
       Box<Integer> bx = new Box<>();
       bx.set(12);
            System.out.println(bx.get() );
        }
    }