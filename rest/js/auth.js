function frmCheck(form){
	var item;
	item = form.name;
	if((item.value == "")||(item.value == null)){
		alert("名前を入力してください");
		item.focus();
		return false;
	}

	item = form.password
	if((item.value == "")||(item.value == null)){
		alert("パスワードを入力してください");
		item.focus();
		return false;
	}
}
