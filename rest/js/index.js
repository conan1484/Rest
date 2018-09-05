function frm(mode){
	var frm = document.forms[0];
	frm.action     = "IndexAction.do"
	frm.mode.value = mode;
	frm.submit();
}