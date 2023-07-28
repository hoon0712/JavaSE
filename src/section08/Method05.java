package section08;
/*
 * VO(Value Object), DTO(Date Transfer Object)
 * 	값 오브젝트로써 목적의 맞는 변수의 집합.
 * 	Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고
 * 					외부로부터 내부를 감싸 숨겨 은닉한다
 * 
 * strName -> 낙타표기법(cameCase
 * str_name -> 스네이크표기법(snakeVase
 *
 * this
 * 	자기자신을 참조하는 연산자
 * 
 */
public class Method05 {
	public static void main(String[] args) {
		MenberVO menberVO = new MenberVO();
		
		menberVO.setId("025");
		menberVO.setName("피카츄");
		menberVO.setAge(29);
		
		String id = menberVO.getId();
		String name = menberVO.getName();
		int age = menberVO.getAge();
		
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
				
		
				
		
//		System.out.println("id: " + MenberVO.id);
	}
	
}
