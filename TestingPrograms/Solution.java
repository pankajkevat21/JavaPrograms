package TestingPrograms;
class Solution{
    public static <T> void printArray(T[] are)
    {
        for (T item: are)
        {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        String[] names = {"pankaj", "rohit"};
        Integer[] numbers = {10,20,30,40,50};
        printArray(names);
        printArray(numbers);
    }
}