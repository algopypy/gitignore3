import java.util.Scanner;
//백준 for문
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		//1. N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 
		 for(int i=1; i<10; i++) {
			 System.out.println(N+ "*"+ i + "=" + N*i);
		 }
		 
		 //2. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
			int len = scan.nextInt();
			
			for(int i = 0; i < len; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println(a+b);
			}
		 
		
		  //3. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		  int n=100;
		  
		  int y=0;
		  for( int i =1 ; i<=n; i++) {
			  y= y+i;
		  }
		  System.out.println( y );
	  
		  
		  //9.첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		  Scanner scan = new Scanner(System.in);
		  int N = scan.nextInt();
		  
		  for (int i=1; i<=N ; i++) {
			  for ( int j=1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  
		  //10.첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		  Scanner scan = new Scanner(System.in);
		  int N = scan.nextInt();
		  
		  for (int i=1; i<=N; i++) {
			  
			  //i가 1일때 N-i만큼의 공백 , i만큼의 별
			  for ( int j=1; j<=N-i; j++) {  
			      System.out.print(" ");
			  }
			  for(int j=1; j<=i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
*/			
		
		
		//정렬 https://www.acmicpc.net/step/9
		//1. 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr= new int[N]; 
		
		for(int i=0; i<N ; i++) {
			arr[i]= scan.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		

		
		int temp;
		
		for(int i= arr.length; i>0; i-- ) {
			for(int j=0; j<i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		
		//정렬한 수들
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}
	
	public class Fibonacci {
		 
	    public static void main(String[] args) {
	        
	        int a1 = 1;
	        int a2 = 1;
	        int a3;
	        
	        System.out.println(a1);
	        System.out.println(a2);
	        
	        for(int i=1; i<=8; i++){
	            a3=a1+a2;
	            System.out.println(a3);
	            a1=a2;
	            a2=a3;
	        }        
	    }
	    int sumResult=0;
	    int sum(int n) {
	    	while(n>=0) {
	    		sumResult+=n--;
	    	}
	    	return sumResult;
	    }
	}


	출처: https://hunit.tistory.com/228 [HunIT Blog]

}
