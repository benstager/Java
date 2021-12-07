import java.util.Arrays;

class removeDuplicates{
  public static void main(String[] args){

    // create tester array
    int [] arr = {1,2,3,3,3,4,5,5,6,7,7,7,7,8,9};

    int j = 0;

    // iterate through array to find when element equals next element, besides last one
    for (int i = 0; i < arr.length(); i++){
      if (i < arr.length - 1 && arr[i] == arr[i + 1]){
        continue;
      }

      //increment j to equal whenever arr[i];
      arr[j++] = arr[i];

    }

    // unit test
    System.out.println("The code should produce: 9");
    System.out.println("The code actually produced: " + j);
}
}
