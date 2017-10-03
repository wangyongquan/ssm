<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8">		
    <title>后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
    <meta name="author" content="Muhammad Usman">

	<!--CSS 样式 -->

	<style>
		  body{
			background:url(/ssm/images/111.jpg) top left no-repeat;
			background-size:cover;
			text-align: center;
		  }
		  .info input{
		  	height:50px;
    		width:260px;
		  }
	</style>	
	
	
<!-- 	<link href="/ssm/resources/css/charisma-app.css" rel="stylesheet"> -->
<!-- 	<link id="bs-css" href="/ssm/resources/css/bootstrap-cerulean.min.css" rel="stylesheet"> -->
	<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- JS库 -->
	
    <script type="text/javascript" src="/ssm/thirdparts/jquery-easyui-1.5/jquery.min.js"></script>
    

    <script type="text/javascript">
	    function reloadcode() {  
	        var verify = document.getElementById('safeCode');  
	        /*Math.random()点击验证码图片随机生成  */  
	       	verify.setAttribute('src', 'makePicture.jsp?it=' + Math.random());
	        return false; 
	    } 
    	$(function(){
    		$("#faildiv").hide();
    		var fail =$("#fail").val();
			if(fail!=null&&fail!=""){
				
				$("#faildiv").show();
			}
			$("#faildivyzm").hide();
    		var fail =$("#fail").val();
			if(fail!=null&&fail!=""){
				
				$("#faildivyzm").show();
			}
    		
    	})	
    
		/* alert("时间太久了，请重新登录！"); */
      if (window != top)
	    top.location.href = location.href;	
	</script>
	

</head>

<body>
<div class="info">
	<input type="text" name="username" placeholder="请在这里输入用户名" maxlength="10">
</div>

</body>
</html>