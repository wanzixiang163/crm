<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
  <head>    
    <title>Title</title>
    <!--<link rel="stylesheet" href="css/style.css" type="text/css"/>-->
    <!--<script type="text/javascript" src="js/my.js"></script> -->
    <style type="text/css">
      .cacher {
        BEHAVIOR: url(#default#userdata);
      }
    </style>
    <script type="text/javascript">
	    var flag = false;
	    function shift_status() {
		    if (flag) {
			    parent.main.cols="170,9,*";
			    document.all.menuSwitch1.src = '${pageContext.request.contextPath}/images/ej1_30.gif';
		    } else {
			    parent.main.cols = "0,9,*";
			    document.all.menuSwitch1.src = '${pageContext.request.contextPath}/images/ej1_32.gif';
		    }
		    flag = !flag;
	    }
    </script>
  </head>
  <BODY onclick=shift_status() leftMargin=0 topMargin=0 style="margin: 0">
  <SPAN class=cacher id=cacheData name="cacheData"></SPAN>
  <TABLE height="100%" cellSpacing=0 cellPadding=0 border=0>
    <TBODY>
    <TR>
      <TD id=menuSwitch style="CURSOR: hand" vAlign=center bgColor=#3391CF>
        <IMG id=menuSwitch1 src="${pageContext.request.contextPath}/images/ej1_30.gif" width=9>
      </TD>
    </TR>
    </TBODY>
  </TABLE>
  </BODY>
</html>
