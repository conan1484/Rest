package jp.struts.rest;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

public class IndexForm extends ValidatorForm{
	private static final long serialVersionUID = 2L;
	private int mode = -1;

	public IndexForm(){ super(); }
	public int getMode(){ return mode; }
	public void setMode(int mode){ this.mode = mode; }

	public void reset(ActionMapping map, HttpServletRequest req){
		super.reset(map, req);
		try{
			req.setCharacterEncoding("utf-8");
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
	}
}