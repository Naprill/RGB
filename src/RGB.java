import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Скласти список RGB таким чином, щоб значення кожного кольору було
кратно 51. Вимоги до складання списку:
1) значення для "R" впорядковано за зростанням;
2)"B" - за спаданням;
3) "G" перемішати.
Вивести на екран таблицю перших 9 елементів списку.
 * @author ніна
 *
 */
public class RGB {
	
	public static List<Integer> indexes = new ArrayList<Integer>();
	
	public static int getRandomIndex(){
		Random random = new Random();
		if(indexes.size() == 5)indexes.clear();
		int r = random.nextInt(5);
		while(indexes.contains(r))r = random.nextInt(5);
		indexes.add(r);
		
		return r;
	}
	
	public static void main(String...args){
		Integer[] numbers = {51,102,153,204,255};
		int count = 0;
		
		for(int i=4,j=0; i>=0; i--,j++){
			for(int k=4; k>=0; k--){
					if(count < 10) System.out.println(numbers[j]+" "+numbers[getRandomIndex()]+" "+numbers[i]+" ");
					count++;				
			}
		}
		
	}
}
