package webadv.s16202231.p02;

/*
 * 文件中存储了五个账号：a ,b , c,d ,e
 * 密码分别为：123，456，789，357，246
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
	static List datas = new <String>ArrayList();
    public static void main(String[] args) {
    	String password = null;
    	int i = 0;
    	String account = null;
    	String path = "C:\\Maven\\apache-maven-3.6.1-bin\\apache-maven-3.6.1\\repo\\lab1\\src\\main\\java\\webadv\\s16202231\\p02\\data.txt";
        if (args.length < 1) {
        	while(true) {
        		System.out.println("请输入账号：");
                Scanner in = new Scanner(System.in);
                account = in.next();
                System.out.println("请输入密码：");
                password = in.next();
//    	        try {
//    	        	Write(path,account+"#"+sha256hex(password));
//    	        } catch (Exception e) {
//    	        	// TODO Auto-generated catch block
//    	        	e.printStackTrace();
//    	        }
                try {
                	readF(path);
                } catch (Exception e) {
            		// TODO Auto-generated catch block
            		e.printStackTrace();
            	}
                //比较账号和密码
                while(i<datas.size()) {
                	String str = datas.get(i).toString();            	
                	String a = str.substring(0, str.indexOf("#"));
                	String p = str.substring(str.indexOf("#")+1, str.length());
                	if(a.equals(account)) {
                		if(p.equals(sha256hex(password))) {
                			System.out.println("登陆成功！");
                			break;
                		}else {
                			System.out.println("输入错误，请重新输入！");
                			break;
                		}
                	}
                	i++;
                }
        	}
        }
    }
    //从密码文件中读取密码
    public static final void readF(String filePath) throws IOException {  
    	BufferedReader br = new BufferedReader(new InputStreamReader(
        new FileInputStream(filePath)));
        for (String line = br.readLine(); line != null; line = br.readLine()) {
        	datas.add(line);
//        	System.out.println(line);          	
        }
        br.close();
    }
    
    //将密码加密保存进文件
    public static void Write(String file, String text) throws Exception
	{
    	FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
            String c = text+"\r\n";
            fw.write(c);
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("写入失败");
            System.exit(-1);
        }
	}
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

