public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
        
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < data.length ; i++){
          // int value = data[i];
           if(data[i] > max){ 
               max = data[i];
			}
		}
        return max;
		
	}
    
    //2.计算数组中最小值
    public static int arrayMinElement(int[] data){
        
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < data.length ; i++){
          // int value = data[i];
           if(data[i] < min){ 
               min = data[i];
           }
		}
        return min;
		
    }
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
       
		int sum = 0;
		for(int i = 0; i < data.length ; i++){	
			sum = sum + data[i];	
		}
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		//新数组的长度 = a.length + b.length
		int[] c = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++){
			c[i] = a[i];
		}
		for(int j = a.length; j < c.length; j++){
			c[j] = b[j-a.length];
		}
        return c;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
        
		int[] abc= new int[end-start];
		for(int i = 0;i < end-start; i++){
			abc[i] = data[start + i];
		}	
        return abc;
    }
    
    //6.数组打印
    public static void printArray(int[] data){
      
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
    }
    
    //7.数组反转
    // 比如：[1,2,3,4] => [4,3,2,1]
    public static void printReversal(int[] data){
		int start = 0;
		int end = data.length;
		while(end > start){
			//数组的第一个元素与最后一个交换，以此类推
			data[start] = data[start]^data[end-1];
			data[end-1] = data[start]^data[end-1];
			data[start] = data[start]^data[end-1];
			end--;
			start++;
		}    
		
    }
    
    public static void main(String[] args){
        int[] data =new int[] {8,7,6,5,4,3,2,1};
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {5,6,7,8};
	    int max = arrayMaxElement(data);
		int min = arrayMinElement(data);
		int sum = arrayElementSum(data);
		int[] abc = arraySub(data,2,5);
		
		printArray(data);
		System.out.println("最大值 = " + max);
		System.out.println("最小值 = " + min);
		System.out.println("总和 = "  + sum);
		
		System.out.print("拼接: ");
		printArray(arrayJoin(a,b));
		
		System.out.print("截取前:");
		printArray(data);
		System.out.print("截取后:" );
		printArray(arraySub(data,2,5));
		
		System.out.print("打印:" );
		printArray(data);
		
		System.out.print("反转前:");
		printArray(a);
		printReversal(a);
		System.out.print("反转后:");
		printArray(a);
    }
}
