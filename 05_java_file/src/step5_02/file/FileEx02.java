package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// # 파일 출력 ( 파일에서 읽어오기 , 로드)

public class FileEx02 {

	public static void main(String[] args) {
	
		String fileName = "ex01.txt";
		
		File file 		  = new File(fileName);
		FileReader fr 	  = null;
		BufferedReader br = null;
		
		if (file.exists()) {			// 파일이 존재하면
			
			try {
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine();	// 파일을 한줄 읽어온다.
				System.out.println(data);
				data = br.readLine();			// 더 읽어올 라인이 없을 경우 null을 반환한다.
				System.out.println(data);
			
				while (true) {					// 전체 줄을 읽어오는 방법 예시
					
					data = br.readLine();
					if (data == null) {
						break;
					}
					System.out.println(data);
					
				}
			
				br.close();
				fr.close();			
				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		
		}	
		
	}

}
