function ajax() {
    //<![CDATA[
    this.pURI = null;
    this.pMethod = "GET";
    this.pDate = null;
    this.pAsyn = true;
    //]]>
}
//创建xmlhttp对象,判断浏览器版本是否支持
ajax.prototype.xmlhttp = function() {
    var xmlhttp = null;
    if (window.ActiveXObject) {
        var arrayActive = ["Msxml2.XMLHTTP.6.0", "Msxml2.XMLHTTP.5.0", "Msxml2.XMLHTTP.4.0", "Msxml2.XMLHTTP.3.0", "Msxml2.XMLHTTP", "Microsoft.XMLHTTP"];
        for (var i = 0; i < arrayActive.length; i++) {
            try {
                xmlhttp = new ActiveXObject(arrayActive[i]);
                break;
            } catch (e) {
                continue;
            }
        }
    } else if (window.XMLHttpRequest) {
        try {
            xmlhttp = new XMLHttpRequest();
            if (xmlhttp.overrideMimeType) { xmlhttp.overrideMimeType("text/xml"); }
        } catch (e) {
            xmlhttp = null;
        }
    } else {
        xmlhttp = null;
    }
    return xmlhttp;
}
//发出请求并返回字符串
ajax.prototype.Request = function(callback) {
    try {
        var oXmlhttp = this.xmlhttp();
        if (oXmlhttp == null || this.pURI == null || this.pURI == "") return;
        this.pMethod = this.pMethod.toUpperCase();
        if (this.pMethod == "GET") {
            oXmlhttp.open(this.pMethod, this.pURI + "?" + this.pDate, this.pAsyn);
            oXmlhttp.setRequestHeader("Content-Type", "text/html;charset=utf-8");
        } else {
            oXmlhttp.open(this.pMethod, this.pURI, this.pAsyn);
            oXmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        }
        oXmlhttp.onreadystatechange = function() {
            if (oXmlhttp.readyState == 4) {//alert(oXmlhttp.getallresponseheaders);
                if (oXmlhttp.status == 200) {
                    callback(oXmlhttp);
                    oXmlhttp = null;
                }
            }
        }
        oXmlhttp.send(this.pMethod == "POST" ? this.pDate : null);
        //return;
    } catch (e) {
        return;
    }
}

//用户更改题库
function cgtkvalueint(val, str) {
    if ($$("lbltiku")) {
        var oldtiku = String($$("lbltiku").innerHTML);
        if (oldtiku != str) {
            if (confirm("您选择了" + str + "，确定更改？")) {
                $$("lbltiku").innerHTML = str;
                cgtkvalueinttooo(val);
            }
            else {
                var city = document.getElementsByName("city");
                for (i = 0; i < city.length; i++) {
                    if (String(city[i].getAttribute("onclick")).indexOf(oldtiku) > 0) {
                        city[i].checked = true;
                    }
                } 
            }
        }
    }
    else {
        cgtkvalueinttooo(val);
    } 
}
//用户更改题库
function cgtkvalueinttooo(val) {
    var cxtype = document.getElementsByName("cxtype");
    var cxtypes = "";
    for (i = 0; i < cxtype.length; i++) {
        if (cxtype[i].checked == true) {
            cxtypes = cxtype[i].value;
            break;
        }
    }
    var x = new ajax();
    x.pURI = "/ajax/ClientChangeTikuAndDrivetype";
    x.pMethod = "get";
    x.pAsyn = true;
    x.pDate = "drivetype=" + cxtypes + "&tiku=" + val + "&r=" + Math.random();
    x.Request(function() {

    });
}



function cgjzvalueint(val, str) {
    if ($$("lbldrivetype")) {
        var oldtiku = String($$("lbldrivetype").innerHTML);
        if (oldtiku != str) {
            if (confirm("您选择了" + str + "，确定更改？")) {
                $$("lbldrivetype").innerHTML = str;
                cgjzvalueinttoooo(val);
            }
            else {
                var cxtype = document.getElementsByName("cxtype");
                for (i = 0; i < cxtype.length; i++) {
                    if (String(cxtype[i].getAttribute("onclick")).indexOf(oldtiku) > 0) {
                        cxtype[i].checked = true;
                    }
                }
            }
        }
    }
    else {
        cgjzvalueinttoooo(val);
    }
}

// 车型
function cgjzvalueinttoooo(val) {
    
    var city = document.getElementsByName("city");
    var citys = "";
    for (i = 0; i < city.length; i++) {
        if (city[i].checked == true) {
            citys = city[i].value;
        }
    }
    var x = new ajax();
    x.pURI = "/ajax/ClientChangeTikuAndDrivetype";
    x.pMethod = "get";
    x.pAsyn = true;
    x.pDate = "drivetype=" + val + "&tiku=" + citys + "&r=" + Math.random();
    x.Request(function() {
    });
}