public class BoomerSooner{
	
	public static void main (String[] args){
		
		System.out.println("Forget those Cowboys, let's go Sooners!");
		System.out.println("Let's count to 1000, Sooner Style");
		
		for (int i=1;i<=1000;i++){
			boolean printNumb = true;
			if ((i % 3) == 0){
			System.out.print("Boomer");
			printNumb = false;
			}
			if (( i % 5) == 0){
			System.out.print("Sooner");
			printNumb = false;
			}
			if(printNumb){
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}
