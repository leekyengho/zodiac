function insertCheck() {
	if ( document.boardForm.name.value=="" ) {
		alert("이름을 입력해 주세요.");
		document.boardForm.name.focus();
		return;
	}
	if ( document.boardForm.passwd.value=="" ) {
		alert("암호를 입력해 주세요.");
		document.boardForm.passwd.focus();
		return;
	}
	if ( document.boardForm.title.value=="" ) {
		alert("제목을 입력해 주세요.");
		document.boardForm.passwd.focus();
		return;
	}
	document.boardForm.menu.value='insert';
	document.boardForm.submit();
}

function updateCheck() {
	if ( document.boardForm.name.value=="" ) {
		alert("이름을 입력해 주세요.");
		document.boardForm.name.focus();
		return;
	}
	if ( document.boardForm.passwd.value=="" ) {
		alert("암호를 입력해 주세요.");
		document.boardForm.passwd.focus();
		return;
	}
	if ( document.boardForm.title.value=="" ) {
		alert("제목을 입력해 주세요.");
		document.boardForm.passwd.focus();
		return;
	}
	document.boardForm.menu.value='update';
	document.boardForm.submit();			
}