class lastWord{
  public static void main(String[] args){

    // make a test String that is a sentence
    String test = "Gonna be a long day if you watch the clock";
    // create an array of Strings that separates each word by space;
    String [] arrTest = test.split(" ");

    // initialize the lastWord string as the last word of the array of strings
    String lastWord = arrTest[arrTest.length - 1];

    // initialize length as the length of the last word
    int length = lastWord.length();


    // unit test
    System.out.println("The code should produce: 5");
    System.out.println("The code actually produced: " + length);

  }
}
