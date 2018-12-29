var tsetTimeout;
var isshowbg = false;
function ShowDialog() {
    this.msgobjname = "";

    /* closegourl 关闭跳转页面  nowurl 不变
    
    autoclose 自动关闭时间 0不关闭
    //dofunction 要执行的function
    btns [{text:'',func:''}{}]
    closefunction 关闭页面执行操作
    */
    this.show = function(title, height, width, msg, iframeurl, closegourl, autoclose, dofunction, isshowbg, btns, closefunction, closebtnshow) {
        if (dofunction && dofunction != null && dofunction != "") {
            eval(dofunction);
        }
        hideallselect();



        var htmlstr = "";
        var mmmid = "append_parent";
        if (document.getElementById(mmmid) != null) { return; };
        var div = document.createElement("div");
        div.id = mmmid;
        div.style.cssText = "position: absolute;z-index:999";
        var htmlstr = "";
        htmlstr += "<table cellspacing=\"0\" cellpadding=\"0\" class=\"fwin\" canmove=\"true\" style=\"empty-cells: show;border-collapse: collapse;\">"
            + "<tbody><tr><td class=\"t_l\"  style=\"cursor: move\" canmove=\"true\"></td><td><div style=\"cursor: move\" class=\"t_c\" canmove=\"true\"></div></td><td class=\"t_r\"  style=\"cursor: move\" canmove=\"true\"></td></tr>"
            + "<tr><td style=\"cursor: move\" class=\"m_l\" canmove=\"true\">&nbsp;&nbsp;</td>"
            + "<td id=\"fwin_content_login\" class=\"m_c\" style=\"background:#fff\" fwin=\"login\">"
            + "<div id=\"main_messaqge_LLapc\" fwin=\"login\">"
            + "<div id=\"layer_lostpw_LLapc\" fwin=\"login\">";
        if (closebtnshow != "notshow") {
            htmlstr += "<h3 class=\"flb\" ><em id=\"returnmessage3_LLapc\" fwin=\"login\">" + title + "</em><span>";
            if (closefunction == null || closefunction == "") {
                htmlstr += "<a title=\"关闭\" href=\"javascript:hideshowlogindiv('append_parent','" + closegourl + "')\" class=\"flbc\" id=\"btn_cloase_div\">关闭</a></span>";
            }
            else
                htmlstr += "<a title=\"关闭\" href=\"javascript:hideshowlogindivclosefunction('append_parent','" + closegourl + "','" + closefunction + "')\" class=\"flbc\" id=\"btn_cloase_div\">关闭</a></span>";
            if (iframeurl == "/home/loginiframe") {
                htmlstr += "<span class='reglink'> &nbsp;&nbsp; 还没有账号? &nbsp; <a href='http://user.jxedt.com/register' target='_blank'>立即注册</a> &nbsp; <a href='javascript:void(0)' onClick=\"document.domain='jxedt.com';hideshowlogindiv('append_parent','nowurl');window.open('http://user.jxedt.com/home/qqlogin?v=2.1', 'TencentLogin', 'width=740,height=450,menubar=0,scrollbars=0, status=1,titlebar=0,toolbar=0,location=1');\">用QQ登录</a> &nbsp; <a href=\"http://user.jxedt.com/home/findpwd\" target='_blank'>忘记密码</a></span>";
            }
            htmlstr += "</h3>";
        }
        else { }


        htmlstr += "<div class=\"c cl\" style=\"height:" + height + "; width:" + width + "; overflow:hidden\" id=\"showdialog_maindiv\">";

        if (iframeurl == "") {
            htmlstr += "<div class=\"bw0\"><table width='100%'><tbody><tr><td align='center'>"
            + msg
            + "</td></tr></tbody></table></div>";

            if (btns != "") {
                htmlstr += "<div class=\"bw0\"><table width='100%'><tbody><tr><td align='center' height='40'>";
                if (btns == null) {
                    htmlstr += "<input type=\"button\" onclick=\"hideshowlogindiv('append_parent','" + closegourl + "')\" class=\"pn pnc\" value=\"返回\" style=\"padding: 0px 5px\" />";
                } else {
                    var btnss = eval("(" + btns + ")")
                    for (var so in btnss) {
                        if (btnss[so].func != "") {
                            htmlstr += "<input  onclick=\"" + btnss[so].func + "\" class=\"pn pnc\"  style=\"padding: 0px 5px\" type=\"button\" value=\"" + btnss[so].text + "\" >&nbsp;&nbsp;";
                        }
                        else {
                            htmlstr += "<input  onclick=\"javascript:hideshowlogindiv('append_parent','" + closegourl + "')\" class=\"pn pnc\"  style=\"padding: 0px 5px\" type=\"button\" value=\"" + btnss[so].text + "\">&nbsp;&nbsp;";
                        }
                    }
                }
                htmlstr += "</td></tr></tbody></table></div>";
            }

        } else {
            htmlstr += "<iframe id=\"showdialogframe\" scrolling=\"no\" frameborder=\"0\" width=\"" + parseInt(width) + "\" height=\"" + parseInt(height) + "\" src=\"" + iframeurl + "\"></iframe>";
        }

        htmlstr += "</div></div>";
        htmlstr += "</div></td><td style=\"cursor: move\" canmove=\"true\" class=\"m_r\"></td></tr><tr><td class=\"b_l\"  style=\"cursor: move\" canmove=\"true\" ></td><td style=\"cursor: move\" canmove=\"true\" class=\"b_c\"></td><td class=\"b_r\"  style=\"cursor: move\" canmove=\"true\"></td></tr></tbody></table>";
        htmlstr += "</div>";
        div.innerHTML = htmlstr;
        document.body.appendChild(div);
        div.style.left = String(((document.documentElement.clientWidth - div.offsetWidth) / 2)) + "px";

        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop || 0;

        div.style.top = String(scrollTop + (document.documentElement.clientHeight - div.offsetHeight) / 2) + "px";
        var md = false, mobj, ox, oy;
        document.onmousedown = function(ev) {
            var ev = ev || window.event;
            var evt = ev.srcElement || ev.target;
            if (typeof (evt.getAttribute("canmove")) == "undefined") {
                return;
            }
            if (evt.getAttribute("canmove")) {
                md = true;
                mobj = document.getElementById("append_parent");
                ox = mobj.offsetLeft - ev.clientX;
                oy = mobj.offsetTop - ev.clientY;
            }
        }
        document.onmouseup = function() {
            md = false;
        }
        document.onmousemove = function(ev) {
            var ev = ev || window.event;
            if (md) {
                mobj.style.left = (ev.clientX + ox) + "px";
                mobj.style.top = (ev.clientY + oy) + "px";
            }
        }
        if (isshowbg) createBgshowlogindiv('#000000', 'fathershowlogindiv');
        if (String(autoclose) != "0") { //自动关闭
            tsetTimeout = setTimeout("hideshowlogindiv('append_parent','" + closegourl + "')", parseInt(autoclose) * 1000);
        }
    }
    this.hide = function() {
        hideshowlogindiv('append_parent', 'nowurl');
    }
}
// 创建背景层
function createBgshowlogindiv(color, id) {

    var width = document.body.scrollWidth;
    var height = document.body.scrollHeight;
    if (document.documentElement) {
        width = Math.max(width, document.documentElement.scrollWidth);
        height = Math.max(height, document.documentElement.scrollHeight);
    }
    var div = document.createElement("div");
    div.id = id;
    div.style.position = "absolute";
    div.style.top = "0px";
    div.style.left = "0px";
    div.style.width = width + "px";
    div.style.height = height + "px";
    div.style.zIndex = "998";
    div.style.background = color;

    if (window.ActiveXObject)
        div.style.filter = "alpha(opacity=20)";
    else
        div.style.opacity = "0.2";

    document.getElementsByTagName("body")[0].appendChild(div);
}

function hideshowlogindivclosefunction(id, gourl, func) {
    showallselect();

    eval(func);

    if (gourl == "nowurl") {
        var obj1 = document.getElementById(id);
        if (obj1) obj1.parentNode.removeChild(obj1);
        var obj = document.getElementById("fathershowlogindiv");
        if (obj) obj.parentNode.removeChild(obj);
    } else {
        if (gourl == window.location.href) {
            window.location.reload();
        }
        else {
            window.location = gourl;
        }
    }
    clearTimeout(tsetTimeout);
}
function hideshowlogindiv(id, gourl) {
    showallselect();
    if (gourl == "nowurl") {
        var obj1 = document.getElementById(id);
        if (obj1) obj1.parentNode.removeChild(obj1);
        var obj = document.getElementById("fathershowlogindiv");
        if (obj) obj.parentNode.removeChild(obj);
    } else {
        if (gourl == window.location.href) {
            window.location.reload();
        }
        else {
            window.location = gourl;
        }
    }
    clearTimeout(tsetTimeout);
}
// 切换iframeurl
function goiframeurl(title, height, width, msg, iframeurl, closegourl, autoclose, dofunction) {
    var mmmid = "append_parent";
    hideshowlogindiv(mmmid, 'nowurl');
    ShowDialogo.show(title, height, width, msg, iframeurl, closegourl, autoclose, dofunction);
}

//跳转
function Redirect(url, time) {
    setTimeout("window.location = '" + url + "'", time);
}


// 隐藏全部select
function hideallselect() {
    var sels = document.getElementsByTagName("select");
    for (var i = 0; i < sels.length; i++) {
        sels[i].style.display = "none";
    }
}
// 显示全部select
function showallselect() {
    var sels = document.getElementsByTagName("select");
    for (var i = 0; i < sels.length; i++) {
        sels[i].style.display = "";
    }
}

var ShowDialogo = new ShowDialog(); //设置对象名,供内部引用 
ShowDialogo.msgobjname = "ShowDialogo"; //定义回调函数


//调用 ShowDialogo.show(title, height, width, msg, iframeurl, closegourl, autoclose, dofunction, isshowbg, btns, closefunction);