<%@ page language="java" pageEncoding="UTF-8"%>

<script type="text/javascript">
<!--
	var basePath = "${pageContext.request.contextPath}";
//-->
</script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/twitter/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/twitter/bootstrap-modal.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/twitter/bootstrap-tooltip.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/validate/jquery.metadata.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/validate/messages_cn.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/date/WdatePicker.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#validateForm").validate();
		$("button").filter(".historyBackClass").each(function(i){
			$(this).bind("click", function(){
				//window.history.go(-1);
				javascript:history.back(); 
			});
		});
	});
	
</script>
