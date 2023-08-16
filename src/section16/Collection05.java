package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
no	name	mobile			addr
1	홍길동	01011111111		서울특별시
2	짱구		01022222222		떡잎마을
3	둘리		01033333333		쌍문동
4	도라에몽	01044444444		오징어도시

 */
public class Collection05 {
	
	public static void main(String[] args) {
		
		List<Map<String, Object>> memberList = new ArrayList<>();
		
		Map<String, Object> member1 = new HashMap<String, Object>();
		Map<String, Object> member2 = new HashMap<String, Object>();
		Map<String, Object> member3 = new HashMap<String, Object>();
		Map<String, Object> member4 = new HashMap<String, Object>();
		
		member1.put("no", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "01011111111");
		member1.put("addr", "서울특별시");
		
		member2.put("no", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "01022222222");
		member2.put("addr", "떡잎마을");
		
		member3.put("no", 3);
		member3.put("name", "둘리");
		member3.put("mobile", "01033333333");
		member3.put("addr", "서울특별시");
		
		member4.put("no", 4);
		member4.put("name", "도라에몽");
		member4.put("mobile", "01044444444");
		member4.put("addr", "오징어도시");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		
		System.out.println("no\tname\tmobile\t\taddr");
		for(Map<String, Object> member : memberList) {
			int no = (int)member.get("no");
			String name = (String) member.get("name");
			String mobile = (String) member.get("mobile");
			String addr = (String) member.get("addr");
			
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+addr);
		}
		
		
	}
	
	

}
