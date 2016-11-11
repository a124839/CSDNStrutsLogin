package action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Users;

public class UserAction extends ActionSupport implements ModelDriven<Users>,SessionAware,ApplicationAware {

	private static final long serialVersionUID = 1L;
	private Users users;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	
	public String logOut() {
		//1.��������-1
		Integer count = (Integer) application.get("count");
		if (count!=null&&count>0) {
			count = count-1;
			application.put("count",count);
		}
		
		//2.sessionʧЧ
		
		return "success";
	}
	
	@Override
	public String execute() throws Exception {
		//����Ϣ����session��
		//1.��ȡsession�ӿ�
		//2.��ȡ��¼��Ϣ
		//3.���û���Ϣ����session��
		session.put("name", users.getName());
		session.put("password", users.getPassword());
		//4.��������+1
		Integer count = (Integer) application.get("count");
		if (count==null) {
			count=0;
		}
		//5.ʹ��ǰ��������+1
		count++;
		application.put("count", count);
		return super.execute();
	}

	@Override
	public Users getModel() {
		users = new Users();
		return users;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	

	
	
	
}
