package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IO01Lambda {
	public static void main(String[] args) {
		// File 객체 생성
		File f = new File("C:\\");	//	\\ -> \
		
		// C 드라이브 하위에 있는 모든 디렉토리 및 파일 리스트 반환
		String[] list = f.list();
		
//		List files = Arrays.asList(list);	// Java8 이하버전
		List files = List.of(list);
		
		
		List<File> fileList =
				(List<File>) files.stream()
			.map(e -> new File(f, (String) e))
			.collect(Collectors.toList());
		
		Stream<File> fileStream = fileList.stream();
		
		fileStream.forEach(file -> {
			System.out.println(file.getName());
		});
	}
}

