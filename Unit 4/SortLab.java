//Jackson Clayton
//Pd 7
public class SortLab{
   public static void main(String[] args){
      int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 10 numbers of your  choice
     
     //for testing with random numbers
     // for (int i = 0; i<array.length; i++)
      //   array[i] = (int)((Math.random() * 16) - 8);
     
      System.out.print("Original: ");
      printArray(array);
         
      System.out.print("Scrambled: ");
      scramble(array);
      printArray(array);
         
      System.out.print("Insertion Sort: ");
      insertionSort(array);
      printArray(array);
      System.out.print("Scrambled: ");
      scramble(array);
      printArray(array);
         
      System.out.print("Selection Sort: ");
      selectionSort(array);
      printArray(array);
         
      System.out.print("Scrambled: ");
      scramble(array);
      printArray(array);
         
      System.out.print("Merge Sort: ");
      mergeSort(array);
      printArray(array);
   }
   public static void printArray(int[] a){
      System.out.println();
      for (int i = 0; i<a.length; i++)
         System.out.print(a[i] + " ");
      System.out.println();
   }
   
      public static String printArrayString(int[] a){
      String x = "";
      for (int i = 0; i<a.length; i++)
         x+=(a[i] + " ");
      return x;
   }
   
   public static void mergeSort(int[] a){
      mergeSort_srt(a, 0, a.length-1);
   }
   
     public static void mergeSort_srt(int array[],int lo, int n){
     int low = lo;
     int high = n;
     if (low >= high) {
        return;
     }
     int middle = (low + high) / 2;
     mergeSort_srt(array, low, middle);
     mergeSort_srt(array, middle + 1, high);
     int end_low = middle;
     int start_high = middle + 1;
    while ((lo <= end_low) && (start_high <= high)) {
       if (array[low] < array[start_high]) {
          low++;
       } 
       else {
           int Temp = array[start_high];
           for (int k = start_high- 1; k >= low; k--) {
              array[k+1] = array[k];
           }
          array[low] = Temp;
          low++;
          end_low++;
          start_high++;
       }
     }
  }


   public static void insertionSort(int[] array){
      int j, index, key;
      for (j = 1; j < array.length; j++){
         key = array[j];
         for (index = j - 1; (index >= 0) && (array[index] > key); index--){
             array[index + 1] = array[index];
         }
         array[index + 1] = key; // insert key into proper position
      }

   }
   /*
      public static void selectionSort(int[] nums){
    
     for (int k = 0; k < nums.length-1; k++){
     for (int s = k; s < nums.length-1; s++){
        if (nums[s] < min){
            System.out.println("Swapped " + min + " with " + nums[s] + " " + printArrayString(nums));
            minIndex = s;
            int temp = nums[s];
            nums[s] = min;
            min = nums[s];
            nums[minIndex] = temp;
            minIndex = s;
            //k = 0;
            System.out.println("Swapped Outcome: " + min + " and " + nums[s] + " " + printArrayString(nums));
        }
        }
     }
   }
   */
   
   public static void selectionSort(int[] nums){
   int index, j, temp, min, minIndex;
     for (index = 0; index < nums.length; index++){
        min = nums[index];
        minIndex = index;
        for (j = index + 1; j < nums.length; j++)
           if (nums[j] < min){
              min = nums[j];
              minIndex = j;
           }
     // perform the swap
        if (min < nums[index]){
           temp = nums[index];
           nums[index] = min;
           nums[minIndex] = temp;
        }

   }
   }
   public static void scramble(int[] a){
      for (int i = 0; i<a.length; i++){
         int temp = a[i];
         int r = (int)(Math.random()*(a.length-1));
         a[i] = a[r];
         a[r] = temp;
      }
   
   }
}
