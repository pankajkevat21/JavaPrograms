package TestingPrograms;
class Box<T>
{
    T  value;// T is a placeholder for any data type
    void set(T value){
        this.value = value;
}
T get() {
        return value;
}

}
class Solution{
    public static void main(String[] args) {
        Box<String> bx = new Box<>();
        bx.set("pankaj");
        System.out.println("value:"+bx.get());
        Box<Integer> it = new Box<>();
        it.set(50);
        System.out.println("value:"+it.get());
    }
}