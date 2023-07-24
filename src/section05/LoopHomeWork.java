package section05;
/*
 
 	*
 	**
 	***
 	****
 	*****
 	******
 	*******
 	
 	반복문 조건문 연습
 	 주말숙제 2중for문 코드 분석하기
 	 
 2번
 		*
 	   **
 	  ***
 	 ****
 	*****
 
 3번
 		*
 	   ***
 	  *****
 	 *******
 
 4번
 					i			j 0~6
 		*			0			j > i+3
 	   ***			1			j < i+3
 	  *****			2			j < i+3
 	 *******		3			j < i+3
 	  *****			4			j > 1
 	   ***			5			j > 2
 	    *			6			j > 3
 
 
 5번		구구단
 			2 x 1 = 2	3 x 1 = 3	4 x 1 = 4
 			
 */
public class LoopHomeWork {
	public static void main(String[] args) {
		
/*		for (int i = 0; i < 7; i++)	{
			for(int j = 0; j < 7; j++) {
				if(i < 7/2 +1) {
					if(j < 3 - i) {
							System.out.print(" ");
					} else if (j > i + 3) {
							System.out.print(" ");
					} else { 
							System.out.print("*");
					}
				} else {
					if (j < i - 3) {
							System.out.print(" ");
					} else if (j > 9 - i) {
							System.out.print(" ");
					} else {
							System.out.print("*");
				}
					
			}
			System.out.println(); 		// 개행
			}
		}
	}
}
*/
		System.out.println("   ☆");
		for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 7; j++) {
						if(j < 3 - i) {
								System.out.print(" ");
						} else if (j > i +3) {
								System.out.print(" ");
						} else {
								System.out.print("*");
						}
					}
					System.out.println();
				}
				System.out.println("  | | Merry Christmas ~*");
			}
	}
		