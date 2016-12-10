function insertCheck() {
	if ( document.form1.gb_name.value=="" ) {
		alert("�̸��� �Է��� �ּ���.");
		document.form1.gb_name.focus();
		return;
	}
	if ( document.form1.gb_passwd.value=="" ) {
		alert("��ȣ�� �Է��� �ּ���.");
		document.form1.gb_passwd.focus();
		return;
	}

	document.form1.menu.value='insert';
	document.form1.submit();
}

function updateCheck() {
	if ( document.form1.gb_name.value=="" ) {
		alert("�̸��� �Է��� �ּ���.");
		document.form1.gb_name.focus();
		return;
	}
	if ( document.form1.gb_passwd.value=="" ) {
		alert("��ȣ�� �Է��� �ּ���.");
		document.form1.gb_passwd.focus();
		return;
	}

	document.form1.menu.value='update';
	document.form1.submit();			
}