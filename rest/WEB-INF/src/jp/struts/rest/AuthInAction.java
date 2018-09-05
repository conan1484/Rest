package jp.struts.rest;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class AuthInAction extends Action{

	public ActionForward execute(ActionMapping map, ActionForm frm,
			HttpServletRequest req, HttpServletResponse res){

System.out.println("Start");
		if(frm == null) {
			req.setAttribute("mode", ini.AuthIn);
			return map.findForward("AuthIn");
		}else{
			AuthInForm a    = (AuthInForm)frm;
			String name     = a.getName();
			String password = a.getPassword();
			Customer c = new Customer();
			c.setName    (name);
			c.setPassword(password);
			c.pickUpUser();
			if(c != null){
				req.setAttribute("mode",     ini.AuthIn);
				req.setAttribute("id",       c.getId());
				req.setAttribute("name",     c.getName());
				req.setAttribute("password", c.getPassword());
			}else {
				req.setAttribute("mode", ini.AuthRetry);
				return map.findForward("AuthIn");
			}
			return map.findForward("Success");
		}
	}
}
