package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Welcome {
	
	public void bufferReader() throws IOException {
		FileReader fr = new FileReader(new File("C:\\igc.log"));
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(br.readLine());
		}
	}
	
	public void inputreader() throws IOException {
		
		InputStreamReader isr = new FileReader("C:\\igc.log");
		System.out.println(isr.read());
	}

	public static void main(String[] args) throws IOException {
		Welcome wl = new Welcome();
		wl.bufferReader();
		wl.inputreader();

	}


}
