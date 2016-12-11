function insertCheck() {
	if ( document.boardForm.gb_name.value=="" ) {
		alert("�̸��� �Է��� �ּ���.");
		document.boardForm.gb_name.focus();
		return;
	}
	if ( document.boardForm.gb_passwd.value=="" ) {
		alert("��ȣ�� �Է��� �ּ���.");
		document.boardForm.gb_passwd.focus();
		return;
	}
	document.boardForm.menu.value='insert';
	document.boardForm.submit();
}

function updateCheck() {
	if ( document.boardForm.gb_name.value=="" ) {
		alert("�̸��� �Է��� �ּ���.");
		document.boardForm.gb_name.focus();
		return;
	}
	if ( document.boardForm.gb_passwd.value=="" ) {
		alert("��ȣ�� �Է��� �ּ���.");
		document.boardForm.gb_passwd.focus();
		return;
	}
	document.boardForm.menu.value='update';
	document.boardForm.submit();			
}

function deleteConfirm(count){
	if (document.boardForm.gb_num.value=="" ) {
		alert("��ȣ�� �Է��� �ּ���.");
		return;
	}
	document.boardForm.menu.value='delete';
	document.boardForm.submit();	
}