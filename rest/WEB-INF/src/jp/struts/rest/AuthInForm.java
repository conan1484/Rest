package jp.struts.rest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;

public class AuthInForm extends ValidatorForm{
	private static final long serialVersionUID = 1L;

	private int    mode     = -1;
	private String name     = null;
	private String password = null;

	public AuthInForm(){ super(); }
	public int    getMode()    { return mode; }
	public String getName()    { return name; }
	public String getPassword(){ return password; }

	public void setMode    (int     mode)   { this. mode    =  mode; }
	public void setName    (String name)    { this.name     = name; }
	public void setPassword(String password){ this.password = password; }

	public void reset(ActionMapping map, HttpServletRequest req){
		super.reset(map, req);
		try{
			req.setCharacterEncoding("utf-8");
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
	}
}