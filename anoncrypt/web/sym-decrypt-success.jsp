<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Symmetric Encryption by ANONCRYPT</title>


<style type="text/css">
#container {
	width: 1000px;
	height: 644px;
	margin: 19px 140px 50px;
	padding: 12px;
	left: 17px;
	top: 20px;
	right: 20px;
	bottom: 20px;
	border-collapse: separate;
	border: thick solid #0F0101;
	border-top-left-radius: 0px;
}
body {
	background-image: url(img/bg.PNG);
}
#header {
	border-collapse: separate;
	border-color: #F7F7F7;
	border-width: thick medium medium thick;
	border-style: solid;
	height: 130px;
	padding: 0px;
	left: -403px;
	background-image: url(img/acbg.PNG);
}
#SymE {
	border-collapse: separate;
	border-color: #FFF3F3;
	border-style: solid;
	margin: 45px 45px 45px 256px;
	height: 323px;
	width: 725px;
}
#side {
	width: 227px;
	border-collapse: separate;
	border-color: #F1F1F1;
	border-style: solid;
	top: 0px;
	margin: -370px 0px 0px 10px;
	height: 318px;
	color:#fff;
}
#side p{
margin-left:15px;
}
#side a:hover
{
	margin-left:2px;
	
}
#foot {
	border-collapse: separate;
	border-color: #F4EEEE;
	border-style: solid;
	height: 221px;
	margin: 16px;
}
#container #foot h2 {
	color: #FCF8F8;
	font-family: aclonica;
	font-style: normal;
	font-weight: 400;
	text-align: center;
}
.center {
	margin: 0px;
	height: auto;
	color: #F3F3F3;
	font-family: aclonica;
	font-style: normal;
	font-weight: 400;
	text-align: center;
}
h1 {
	color: #F8F4F4;
	font-family: aclonica;
	font-style: normal;
	font-weight: 400;
	font-variant: normal;
	text-align: center;
	text-decoration: underline;
	text-indent: 0px;
	text-shadow: 0px 0px;
	text-transform: none;
	border-color: #000000;
}
textarea {
}
#container #SymE .center form h2 #Enter the Text {
}
</style>
<!--The following script tag downloads a font from the Adobe Edge Web Fonts server for use within the web page. We recommend that you do not modify it.--><script>var __adobewebfontsappname__="dreamweaver"</script><script src="http://use.edgefonts.net/aclonica:n4:default.js" type="text/javascript"></script>
</head>

<body>
<div id="container">
  <div id="header"></div>
  <div id="SymE">
    <div class="center">
      <h1>Password based Encryption Service</h1>
      
     <h3> The Decrypted Message</h3> 
	 <s:textarea name="Send" value="%{decrypted}" readonly="true"
   					 cols="65" 
						rows="8" 
           				  />  
      
      
    </div>
         
  </div>
  <div id="side">
   <p>
      <strong><center>Services We Offer</center><hr/></strong>
    </p>
	<p><a href="index.jsp" title="Home Page" style="color: #DEFD00">Home</a></p>
    <p><a href="sym-encrypt.jsp" title="Symetrical Encryption" style="font-family: aclonica; font-style: normal; font-weight: 400;color: #DEFD00">Password Based Encryption</a></p>
    <p><a href="sym-decrypt.jsp" title="Password Based Decryption" style="font-family: aclonica; font-style: normal; font-weight: 400;color: #DDFB06">Password Based Decryption</a></p>
    <p><a href="sdms-encrypt.jsp" title="SDMS" style="font-family: aclonica; font-style: normal; font-weight: 400; color: #70F802;">Self-Destructible Message Encryption</a></p>
    <p><a href="sdms-decrypt.jsp" title="SDMS" style="font-family: aclonica; font-style: normal; font-weight: 400; color: #6EF701;">Self-Destructible Message Decryption</a></p>
    <p>&nbsp;</p>
  </div>
  <div id="foot">
  <h2>Developed By: </h2>
   <center>
  <a href="https://www.facebook.com/rishabh.u "><img src="img/rishabh.png" alt="Rishabh Upadhyay" onmouseover="focus()" /></a>

<a href="https://www.facebook.com/Mrrr.ajay "><img src="img/ajay.png" alt="Ajay Raj Singh" onmouseover="focus()" /></a>

<a href="https://www.facebook.com/sauid "><img src="img/sauid.png" alt="Sauid Alam" onmouseover="focus()" /></a>
 </center>
  </div>
  <p>&nbsp;</p>
</div>
</body>
</html>
