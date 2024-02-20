package dsa_problems;

public class HashMap {
    static int[] hashMap;
    public static void createHashMap(int size){
        hashMap = new int[size];
        for(int i = 0; i < size; i++){
            hashMap[i] = -1;
        }
        System.out.println("HashMap is created with size " + size);
    }
    public static void put(int ele){
        int index = ele % hashMap.length;
        if(hashMap[index] == -1){
            hashMap[index] = ele;
            System.out.println(ele + " had been inserted inside map with key: " + index);
        } else{
            System.out.println("key is already occupied");
        }
    }
    public static void delete(int ele){
        int index = ele % hashMap.length;
        if(hashMap[index] == ele){
            System.out.println(ele + " got deleted");
            hashMap[index] = -1;
        } else{
            System.out.println("Element not found");
        }
    }
    public static void display(int[] hashMap){
        System.out.println("====HashMap Element====");
        for (int i = 0; i < hashMap.length; i++){
            if(hashMap[i] != -1)
                System.out.println(hashMap[i]);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size ");
//        int size = sc.nextInt();
        createHashMap(6);
        put(5);
        put(9);
        put(10);
        put(24);
        put(98);
        put(30);
        put(50);
        delete(30);
        display(hashMap);
    }
}
