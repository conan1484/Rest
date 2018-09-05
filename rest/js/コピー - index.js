function frm(mode){
	var frm = document.forms[0];
	if(mode == AuthIn)   { frm.action = "authIn.jsp"; }
	if(mode == AuthNew)  { frm.action = "authNew.jsp"; }
	if(mode == ReserveIn){ frm.action = "ReserveAction"; }
	if(mode == ShowMenu) { frm.action = "MenuAction"; }
	if(mode == BbsIn)    { frm.action = "BbsAction"; }
	if(mode == LogOff)   { frm.action = "Logoff"; }
	frm.mode.value = mode;
	frm.submit();
}