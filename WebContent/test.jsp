<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
<script type="text/javascript" src="jquery/jquery-1.4.4.js"></script>  
<script type="text/javascript">  
    function GetWeather(a) {  
        var date = new Date();  
        var cDate = date.getFullYear() + "-" + (date.getMonth()) + "-"  
                + date.getDate();  
        $("#wPlace").text(a.value);  
        $.getScript("http://php.weather.sina.com.cn/js.php?" + $.param({  
            city : a.value,  
            day : cDate,  
            password : "DJOYnieT8234jlsK"  
        }), function(json) {//数据返回   
            $("#weather").text(status1 + " " + direction1);  
            $("#wd").text(temperature1 + "°~" + temperature2 + "°");  
            /*  
            需要传入city参数，就是要获取天气的城市名，直接写中文名称  
            status1:天气状况（多云，晴，小雨，雪等等）  
            temperature1：温度  
             */  
        });  
    }  
</script>  
</head>  
<body onload="">  
    <div>  
        <select id="selectInput" onchange="GetWeather(this);" name="TEMP"  
            style="width: 100px;">  
            <option value="成都">成都</option>  
            <option value="北京">北京</option>  
            <option value="上海">上海</option>  
            <option value="香港">香港</option>  
            <option value="长沙">长沙</option>  
        </select>  
    </div>  
    <div id="wPlace"></div>  
    <div id="weather"></div>  
    <div id="wd"></div>  
</body>  
</html>