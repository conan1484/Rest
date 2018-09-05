package jp.struts.rest;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class IndexAction extends Action{

	public ActionForward execute(ActionMapping map, ActionForm frm,
			HttpServletRequest req, HttpServletResponse res){

		String pass = "success";
		if(frm != null){
			IndexForm i = (IndexForm)frm;
			int mode = i.getMode();
			req.setAttribute("mode", mode);
			if(mode == ini.AuthIn)   { pass = "authIn";    }
			if(mode == ini.AuthNew)  { pass = "authNew";   }
			if(mode == ini.ReserveIn){ pass = "reserveIn"; }
			if(mode == ini.ShowMenu) { pass = "showMenu";  }
			if(mode == ini.BbsIn)    { pass = "bbsIn";     }
			if(mode == ini.LogOff)   { pass = "logOff";    }
		}
		return map.findForward(pass);
	}

}
