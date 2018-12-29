/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports) {

	"use strict";

	$(document).ready(function () {
	    /**
	     * 滑块验证初始化
	     */
	    var captchaIns = "";

	    var isSendCode = true;

	    initNECaptcha({
	        // config对象，参数配置
	        captchaId: "e11978dc94fe431eb2ec9c510ddf97b9",
	        element: "#captcha",
	        mode: "popup",
	        width: "380px",
	        // 用户验证码验证成功后，进行实际的提交行为
	        onVerify: function onVerify(err, data) {
	            if (data) {
	                $("#successToken").val(data.validate);
	                if ($(".pwd-login-to").css("display") != "block") {
	                    getVerificationCode($(".register-phone").val(), $(".register-code-btn"));
	                } else {
	                    loginPC();
	                }
	            }
	        }
	    }, function onload(instance) {
	        // 初始化成功后得到验证实例instance，可以调用实例的方法
	        console.log(instance);
	        captchaIns = instance;
	    }, function onerror(err) {
	        console.log("error", err);
	        // 初始化失败后触发该函数，err对象描述当前错误信息
	    });

	    //登录手机光标移出事件验证
	    $(".register-phone").keyup(function () {
	        if (flag) {
	            phoneReg();
	        } else {
	            codePhoneReg();
	        }
	    });

	    /**
	     * 获取验证码
	     * 调用滑块
	     */
	    $(".register-code-btn").click(function () {
	        // 验证手机号码
	        if (codePhoneReg() && isSendCode) {
	            captchaIns && captchaIns.refresh();
	            captchaIns && captchaIns.popUp();
	        }
	    });
	    /**
	     * 密码登陆用户名验证
	     */
	    function phoneReg() {
	        var phone = $(".register-phone").val().trim();
	        if (phone == "") {
	            $(".register-phone").next().css("visibility", "visible");
	            $(".register-phone").next().text("请输入手机号或用户名");
	            $(".register-phone").next().next().hide();
	            return false;
	        } else {
	            $(".register-phone").next().css("visibility", "hidden");
	            $(".register-phone").next().text("");
	            $(".register-phone").next().next().show();
	        }
	        return true;
	    }

	    /**
	     * 验证码登陆手机号码验证
	     */
	    function codePhoneReg() {
	        var phone = $(".register-phone").val().trim();
	        var regPhone = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
	        if (phone == "") {
	            $(".register-phone").next().css("visibility", "visible");
	            $(".register-phone").next().text("请输入手机号码");
	            $(".register-phone").next().next().hide();
	            return false;
	        } else if (!regPhone.test($(".register-phone").val())) {
	            $(".register-phone").next().css("visibility", "visible");
	            $(".register-phone").next().text("请输入正确的手机号");
	            $(".register-phone").next().next().hide();
	            return false;
	        } else {
	            $(".register-phone").next().css("visibility", "hidden");
	            $(".register-phone").next().text("");
	            $(".register-phone").next().next().show();
	        }
	        return true;
	    }

	    //验证码标移出事件验证
	    $(".register-code").keyup(function () {
	        codeReg();
	    });

	    /**
	     * 验证码验证
	     */
	    function codeReg() {
	        var code = $(".register-code").val().trim();
	        if (code == "") {
	            $(".register-code").next().next().css("visibility", "visible");
	            $(".register-code").next().next().text("请输入验证码");
	            $(".register-code").next().next().next().hide();
	            return false;
	        } else if ($(".register-code").val().length != 4) {
	            $(".register-code").next().next().css("visibility", "visible");
	            $(".register-code").next().next().text("短信验证码错误");
	            $(".register-code").next().next().next().hide();
	            return false;
	        } else {
	            $(".register-code").next().next().css("visibility", "hidden");
	            $(".register-code").next().next().text("");
	            $(".register-code").next().next().next().show();
	        }
	        return true;
	    }

	    //键盘抬起事件验证
	    $(".register-pwd").keyup(function () {
	        pwdReg();
	    });
	    /**
	     * 密码验证
	     */
	    function pwdReg() {
	        var pwd = $(".register-pwd").val().trim();
	        if (pwd == "") {
	            if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/9./i) == "9.") {
	                $(".register-pwd").next().next().css("visibility", "visible");
	                $(".register-pwd").next().next().text("请输入密码");
	                $(".register-pwd").next().next().next().hide();
	            } else {
	                $(".register-pwd").next().css("visibility", "visible");
	                $(".register-pwd").next().text("请输入密码");
	                $(".register-pwd").next().next().hide();
	            }
	            return false;
	        } else {
	            if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/9./i) == "9.") {
	                $(".register-pwd").next().next().css("visibility", "hidden");
	                $(".register-pwd").next().next().text("");
	                $(".register-pwd").next().next().next().show();
	            } else {
	                $(".register-pwd").next().css("visibility", "hidden");
	                $(".register-pwd").next().text("");
	                $(".register-pwd").next().next().show();
	            }
	        }
	        return true;
	    }

	    //验证码和密码登录切换
	    var flag = true;

	    //切换验证码以及密码登录
	    $(".code-login").click(function () {
	        flag = !flag;
	        /**
	         * 验证码登陆false
	         */
	        if (!flag) {
	            $(".code-login-to").show();
	            $(".pwd-login-to").hide();
	            $(".pwd-login-to .register-pwd").val("");
	            $(this).find("a").text("密码登录");
	            $(".register-phone").attr('placeholder', '请输入手机号');
	            $(".register-pwd").val('');
	            $(".register-phone").next().css("visibility", "hidden");
	            $(".register-phone").next().text("");
	            $(".register-code").val("");
	            $(".register-phone").val("");
	            $(".register-phone").next().next().hide();
	            $(".register-code").next().next().css("visibility", "hidden");
	            $(".register-code").next().next().text("");
	            $(".register-code").next().next().next().hide();
	            if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/9./i) == "9.") {
	                $(".register-phone").val("请输入手机号或用户名");
	            }
	            $("#captcha").next().css("visibility", "hidden");
	        } else if (flag) {
	            /**
	             * 密码登录true
	             */
	            //密码框显示
	            $(".pwd-login-to").show();
	            // 滑块显示
	            $(".slider").show();
	            // 验证码隐藏
	            $(".code-login-to").hide();
	            if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/9./i) == "9.") {
	                setTimeout(function () {
	                    $(".register-phone").val("请输入手机号或用户名");
	                    $(".login-input-ie").css("visibility", "visible");
	                }, 0);
	            }
	            $(".register-phone").val("");
	            $(".register-phone").next().next().hide();
	            $(".register-phone").attr('placeholder', '请输入手机号或用户名');
	            $(".register-phone").next().text("");
	            $(".register-phone").next().css("visibility", "hidden");
	            $(".register-code").val("");
	            $(".register-pwd").next().css("visibility", "hidden");
	            $(".register-pwd").next().text("");
	            $(".register-pwd").next().next().hide();
	            $("#captcha").next().css("visibility", "hidden");
	            $(this).find("a").text("验证码登录");
	        }
	    });

	    //登录提交
	    $(".login-submit").onclick(function () {
	    	alert(1);
	        /*if (!phoneReg() & !codeReg()) {
	            return false;
	        }else {
                loginPC();
            }*/
	    });

	    /**
	     * 登录
	     */
	    function loginPC() {
	    	var phone=$("#phone").val();
	    	var loginpwd=$("#loginpwd").val();
	    	alert(phone+"  "+loginpwd);
	        $.ajax({
	            type: 'post',
	            url: '/userinfo/login',
	            data: {phone:phone,loginpwd:loginpwd},
	            success: function success(res) {
	                alert(res);
	                if(null==res){
                        console.log("账号或密码错误!");
					}else{
                        window.location.href = "index.html";
					}
	            },
	            error: function error(res) {}
	        });
	    }

	    /**
	     * 获取验证码
	     * @param {*} phone 手机号
	     * @param {*} el 获取验证码按钮
	     */
	    function getVerificationCode(phone, el) {
	        var d = new Date();
	        var time = d.getTime();
	        isSendCode = false;
	        $.ajax({
	            dataType: 'json',
	            type: 'get',
	            url: 'http://user.jxedt.com/captcha/pcSendCode',
	            data: {
	                t: 1,
	                m: 1,
	                p: 1,
	                mobile: phone,
	                successToken: $("#successToken").val(),
	                _: time
	            },
	            success: function success(res) {
	                if (res.code == 0) {
	                    var n = 60;
	                    window.rid = res.result.rid;
	                    $(el).css({
	                        "background-color": "#F2F2F2",
	                        "color": "#00C356",
	                        "cursor": "default"
	                    });
	                    window.timer = setInterval(function () {
	                        if (n <= '1') {
	                            isSendCode = true;
	                            clearInterval(timer);
	                            $(el).css({
	                                "background-color": "#00C356",
	                                "color": "#FFFFFF",
	                                "cursor": "pointer"
	                            });
	                            $(el).text('发送验证码');
	                        } else {
	                            $(el).text(--n + ' 秒后重新获取');
	                        }
	                    }, 1000);
	                } else {
	                    $(el).text('发送验证码');
	                    $(el).css({
	                        "background-color": "#F2F2F2",
	                        "color": "#00C356",
	                        "cursor": "default"
	                    });
	                    $(".register-code").next().next().css("visibility", "visible");
	                    $(".register-code").next().next().text(res.msg);
	                    $(".register-code").next().next().next().hide();
	                }
	            }
	        });
	    }
	});

/***/ })
/******/ ]);