package arrays;

class startPattern {
	  public static void main(String[] args) {
	    int arr_2d [][] = new int [4][];
			arr_2d[0] = new int [1]; 
			arr_2d[1] = new int [2]; 
			arr_2d[2] = new int [3]; 
			arr_2d[3] = new int [4]; 
			for(int i=0; i<arr_2d.length; i++){
				for(int j=0; j<arr_2d[i].length; j++){
					System.out.print(" * ");
				}
				System.out.println();
			}
	  }
}