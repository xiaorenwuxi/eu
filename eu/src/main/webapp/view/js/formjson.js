/**
 * 将前台的所有标签名和值封装成json数据传到后台。
 */
function getFormData (obj) {
	var data = obj.find("input,select,textarea");
	var reData = '{';
	var tempName = "111";
	var tempName1 = "imgFile";
	$.each(data, function (i, item) {
		var name = $(item).attr("name");
		var val = $(item).val();
		if (name == tempName) {
			return;
		}
		if (name == tempName1) {
			return;
		}
		
		if($(item.parentNode.parentNode.parentNode.lastChild).attr("class") == "kindEditorTextareaClass"){
			tempName = $(item.parentNode.parentNode.parentNode.lastChild).attr("name");
			return;
		}
		if ($(item).attr("class").indexOf("combobox") > -1) {
			val = $(item).combobox("getValue");
		} else if ($(item).attr("type") == "radio") {
			if ($(item).is(":checked")) {
				val = $(item).val();
			} else {
				return;
			}
		} else if($(item).attr("class") == "ke-edit-textarea") {
			val = $($(item.parentNode).find("iframe")[0].contentWindow.document.body).html();
			name = $(item.parentNode.parentNode.parentNode.lastChild).attr("name");
			tempName = name;
		} else if ($(item).attr("type") == "checkbox") {
			if ($(item).is(":checked")) {
				val = $(item).val();
			} else {
				return;
			}
		}
		if (!name) {
			return;
		}
		if(name == "title" || name == "digest" || name == "source" || name == "title_simple"){
			val = replaceStr(val);
		}
		reData += "'" + name + "' : '" + val + "',";
	});
	reData = reData.substring(0, reData.length - 1);
	reData += '}';
	return reData;
}
