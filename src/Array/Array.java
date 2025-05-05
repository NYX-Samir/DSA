package Array;

public class Array {
    int[] arr;
    int Size;
    int index;

    public Array(int Size) {
        this.Size = Size;
        this.arr = new int[Size];
        this.index = 0;
    }

    public void Insert(int value) {
        if (index == Size - 1) {
            System.out.println("Array is OverFlow");
            return;
        }
        arr[index] = value;
        index++;
    }

    public void Delete(int delPositon) {
        if (delPositon < 0 || delPositon >= Size) {
            System.out.println("Invalid Index");
            return;
        }
        for (int i = delPositon; i <= index - 1; i++) {
            arr[i] = arr[i + 1];
        }
        index--;
    }

    public void Traverse() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }

    public void getSize() {
        System.out.println(Size);
    }

    public int Search(int Value){
        int indexResult=-1;
        for(int i=0;i<index;i++){
            indexResult++;
            if(arr[i]==Value){
                indexResult=i;
                break;
            }

        }
        return indexResult;
    }

    public static class Main {
        public static void main(String[] args) {
                Array arr= new Array(10);
                arr.Insert(10);
                arr.Insert(20);
                arr.Insert(30);
                arr.Insert(40);
                arr.Traverse();
                arr.Delete(2);
                arr.Traverse();
                arr.getSize();
                int Result=arr.Search(40);
                System.out.println(Result);
            }
        }
}
