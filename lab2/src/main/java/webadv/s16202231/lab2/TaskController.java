package webadv.s16202231.lab2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {	
	
	List<String> tasks = Arrays.asList("Bootstrap������Twitter��˾�����ʦMark Otto��Jacob Thornton��������HTML��CSS��JavaScript �����ļ�ࡢֱ�ۡ�ǿ����ǰ�˿�����ܣ�ʹ�� Web �������ӿ�ݡ�Bootstrap�ṩ�����ŵ�HTML��CSS�淶���������ɶ�̬CSS����Lessд�ɡ�",
			"MyBatis ����apache��һ����Դ��ĿiBatis, 2010�������Ŀ��apache software foundation Ǩ�Ƶ���google code�����Ҹ���ΪMyBatis ��2013��11��Ǩ�Ƶ�Github��",
			"Maven��Ŀ����ģ��(POM)������ͨ��һС��������Ϣ��������Ŀ�Ĺ�����������ĵ�����Ŀ�����������",
			"Gradle��һ������Apache Ant��Apache Maven�������Ŀ�Զ���������Դ���ߡ���ʹ��һ�ֻ���Groovy���ض���������(DSL)��������Ŀ���ã������˻���XML�ĸ��ַ������á�", 
			"Spring�����������������ĸ����Զ������ġ�Springʹ�õ��ǻ�����JavaBean�������ǰֻ������EJB��ɵ����顣Ȼ����Spring����;���������ڷ������˵Ŀ������Ӽ��ԡ��ɲ����Ժ�������ԽǶȶ��ԣ����󲿷�JavaӦ�ö����Դ�Spring�����档",
			"jQuery��һ�����١�����JavaScript��ܣ��Ǽ�Prototype֮����һ�������JavaScript����⣨��JavaScript��ܣ���jQuery��Ƶ���ּ�ǡ�write Less��Do More����������д���ٵĴ��룬����������顣����װJavaScript���õĹ��ܴ��룬�ṩһ�ּ���JavaScript���ģʽ���Ż�HTML�ĵ��������¼�����������ƺ�Ajax������");
	
	@GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
	
}
