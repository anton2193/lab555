package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab2 {

	 /**
     * метод создает случаное простое число 
     *@return возвращает rand, если переданное число простое; 
     *возвращает 0, если переданное число не является простым
     */
	public static int getRandomPrime()
	{
	 
		 
		
	final int a=(int) Math.pow(10, 9);
	final int rand = (int) (Math.random() * (a-2) + 2);
	 
	for (int i = 2; i < rand; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
	 
	{
	if   (rand % i == 0) 
	            //если остаток от деления числа на значение шага цикла равен нулю, то
	{
	return 0;  //вернуть false, переданное число простым не является
	}
	 
	 
	}
	//если же ни одного значения, удовлетворяющего условию выше, не было найдено, то
	//вернуть true, переданное число простое   
	return rand;
	}
	 
	 
	
	  /**
     * метод создает упорядоченный по возрастанию массив из простых чисел 
     *@return возвращает  список ms с простыми числами размерностью length 
     
     */
	
	public static List<Integer> getRandomArray(int length)  {
	 
	boolean[] isPrime = new boolean[length];
	Arrays.fill(isPrime, true);
	 
	for (int i = 2; i * i < length; i++) {
	if (isPrime[i]) {
	for (int j = 2 * i; j < length; j += i) {
	isPrime[j] = false;
	}
	}
	}

	 
	ArrayList<Integer> ms = new ArrayList<>();
	for (int i = 2; i < length; i++) {
	if (isPrime[i]) {
	ms.add(i);
	}
	}
	return ms;
	}
	 
	 
	
	  /**
     * метод создает простое число  после Prime
     *@return rand  если число простое, вернуть 0 если не является простым 
     
     */
	public  static int getNext(int prime) {
	 
	 
	int a=(int) Math.pow(10, 9);
	int rand = (int) (Math.random() * (a-prime) + prime+1);
	 
	 
	 
	for (int i = prime+1; i < rand; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
	{
	    
	if   (rand % i == 0) 
	            //если остаток от деления числа на значение шага цикла равен нулю, то
	{
	return 0;  //вернуть 0, переданное число простым не является
	}
	 
	}
	//если же ни одного значения, удовлетворяющего условию выше, не было найдено, то
	//вернуть rand, переданное число простое   
	return rand;
	}
	 
	 
	  /**
     * метод определения простоты числа
     *@return возвращает true, если переданное число простое; 
     *возвращает false, если переданное число не является простым
     */
	public  static boolean isPrime(int arg0)    
	{
	 
	if (arg0 == 1)
	{
	return false;  //вернуть false, переданное число простым не является
	
	}
	 
	for (int i = 2; i < arg0; i++)  //бежим по циклу начиная от 2 и до самого числа не включительно
	{
	if   (arg0 % i == 0) 
	            //если остаток от деления числа на значение шага цикла равен нулю, то
	{
	return false;  //вернуть false, переданное число простым не является
	}
	}
	//если же ни одного значения, удовлетворяющего условию выше, не было найдено, то
	return true;  //вернуть true, переданное число простое
	
	}		
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
