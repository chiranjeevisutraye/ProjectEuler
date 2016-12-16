import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadWriteFile {
	public static File f = new File("C:\\My Documents\\CRM_logs\\2015\\Evry_Jan\\workbench-admin-services-server1\\output.log");
	String names[] = {"JOB_GZF_D_SK_HEND_K_DK_TR","JOB_GZI_F_ERST_ENDR_K_DK_TR","JOB_GZI_F_ERST_KNYTN_STR_K_DK_TR_L1"};
	
	public void readFile(File inputFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		while(br.readLine()!=null) {
			String tmp = br.readLine();
			if(!((tmp.contains(names[0]))||(tmp.contains(names[1]))||(tmp.contains(names[2])))){
				System.out.println(tmp);
			}
		}
	}
	
	public void writeFile(String line) throws IOException {
		FileWriter fw = new FileWriter(new File("C:\\My Documents\\CRM_logs\\2015\\Evry_Jan\\workbench-admin-services-server1\\filter.log"));
		fw.write(line);
	}
	public static void main(String[] args) throws IOException {
		ReadWriteFile rwf = new ReadWriteFile();
		rwf.readFile(f);

	}

}
