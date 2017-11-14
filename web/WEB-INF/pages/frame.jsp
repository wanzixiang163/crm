<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
  <head>    
    <title>CRM管理系统</title>
    <!--<link rel="stylesheet" href="css/style.css" type="text/css"/>-->
    <!--<script type="text/javascript" src="js/my.js"></script> -->
        
  </head>
  <frameset rows="90,*" framespacing="0px" frameborder="no">
    <frame src="${pageContext.request.contextPath}/uiAction_frame_top.action" scrolling="no"/>
    <frameset id="main" cols="170,9,*" framespacing="0px" frameborder="no" >
      <frameset rows="30,*,40" framespacing="0px" frameborder="no" >
        <frame src="${pageContext.request.contextPath}/uiAction_frame_left1.action" scrolling="no"/>
        <frame src="${pageContext.request.contextPath}/uiAction_frame_left.action" scrolling="no"/>
        <frame src="${pageContext.request.contextPath}/uiAction_frame_left2.action" scrolling="no"/>
      </frameset>
      <frame src="${pageContext.request.contextPath}/uiAction_frame_control.action" scrolling="no"/>
      <frame src="${pageContext.request.contextPath}/uiAction_frame_right.action" name="right" scrolling="yes"/>
    </frameset>
  </frameset>
</html>
