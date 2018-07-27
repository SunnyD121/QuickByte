(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error('Cannot find module "' + req + '".');
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!DOCTYPE>\r\n<html>\r\n    <head>\r\n    </head>\r\n    <body>\r\n        <router-outlet></router-outlet>\r\n    </body>\r\n</html>\r\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'app';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/nav-bar/nav-bar.component */ "./src/app/components/nav-bar/nav-bar.component.ts");
/* harmony import */ var _components_media_post_media_post_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/media-post/media-post.component */ "./src/app/components/media-post/media-post.component.ts");
/* harmony import */ var _routing__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./routing */ "./src/app/routing.ts");
/* harmony import */ var _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./components/homepage/homepage.component */ "./src/app/components/homepage/homepage.component.ts");
/* harmony import */ var _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./components/loginpage/loginpage.component */ "./src/app/components/loginpage/loginpage.component.ts");
/* harmony import */ var _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./components/signuppage/signuppage.component */ "./src/app/components/signuppage/signuppage.component.ts");
/* harmony import */ var _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/errorpage404/errorpage404.component */ "./src/app/components/errorpage404/errorpage404.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};












var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _components_nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_5__["NavBarComponent"],
                _components_media_post_media_post_component__WEBPACK_IMPORTED_MODULE_6__["MediaPostComponent"],
                _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_8__["HomePageComponent"],
                _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_9__["LoginPageComponent"],
                _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_10__["SignupPageComponent"],
                _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_11__["ErrorPage404Component"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(_routing__WEBPACK_IMPORTED_MODULE_7__["approutes"])
            ],
            providers: [],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/components/errorpage404/errorpage404.component.css":
/*!********************************************************************!*\
  !*** ./src/app/components/errorpage404/errorpage404.component.css ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/errorpage404/errorpage404.component.html":
/*!*********************************************************************!*\
  !*** ./src/app/components/errorpage404/errorpage404.component.html ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-nav-bar></app-nav-bar>\r\n<div class=\"row\">\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n    <div class=\"col-sm-1\">\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n        <p style=\"font-size:350%\">404</p>\r\n    </div>\r\n</div>\r\n"

/***/ }),

/***/ "./src/app/components/errorpage404/errorpage404.component.ts":
/*!*******************************************************************!*\
  !*** ./src/app/components/errorpage404/errorpage404.component.ts ***!
  \*******************************************************************/
/*! exports provided: ErrorPage404Component */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ErrorPage404Component", function() { return ErrorPage404Component; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ErrorPage404Component = /** @class */ (function () {
    function ErrorPage404Component() {
    }
    ErrorPage404Component.prototype.ngOnInit = function () {
    };
    ErrorPage404Component = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-errorpage404',
            template: __webpack_require__(/*! ./errorpage404.component.html */ "./src/app/components/errorpage404/errorpage404.component.html"),
            styles: [__webpack_require__(/*! ./errorpage404.component.css */ "./src/app/components/errorpage404/errorpage404.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ErrorPage404Component);
    return ErrorPage404Component;
}());



/***/ }),

/***/ "./src/app/components/homepage/homepage.component.css":
/*!************************************************************!*\
  !*** ./src/app/components/homepage/homepage.component.css ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n/* Remove the navbar's default margin-bottom and rounded borders */\r\n.navbar {\r\n  margin-bottom: 0;\r\n  border-radius: 0;\r\n}\r\n/* Set height of the grid so .sidenav can be 100% (adjust as needed) */\r\n.row.content {height: 450px}\r\n/* Set gray background color and 100% height */\r\n.sidenav {\r\n  padding-top: 20px;\r\n  background-color: #f1f1f1;\r\n  height: 100%; /* This setting sets the size of the grayish background on the sidebar */\r\n}\r\n/* Set black background color, white text and some padding */\r\nfooter {\r\n  background-color: #555;\r\n  color: white;\r\n  padding: 15px;\r\n}\r\n/* On small screens, set height to 'auto' for sidenav and grid */\r\n@media screen and (max-width: 767px) {\r\n  .sidenav {\r\n    height: auto;\r\n    padding: 15px;\r\n  }\r\n  .row.content {height:auto;}\r\n}\r\n"

/***/ }),

/***/ "./src/app/components/homepage/homepage.component.html":
/*!*************************************************************!*\
  !*** ./src/app/components/homepage/homepage.component.html ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- BUG: if the user uses the back button to return to this page, then the navbar no longer affixes. -->\r\n<app-nav-bar></app-nav-bar>\r\n\r\n<div class=\"container-fluid text-center\">\r\n  <div class=\"row content\">\r\n    <div class=\"col-sm-2 sidenav\">\r\n      <p><a href=\"#\">Link</a></p>\r\n      <p><a href=\"#\">Link</a></p>\r\n      <p><a href=\"#\">Link</a></p>\r\n    </div>\r\n    <div class=\"col-sm-8 text-left\">\r\n      <h1>Welcome</h1>\r\n      <p>This is some information. There are words here talking about the words that should be here instead of the words that are here,\r\n      these words. Words words words words words. Did you know that you can type virtually anything onto a webpage?</p>\r\n      <hr>\r\n      <app-media-post></app-media-post>\r\n    </div>\r\n    <div class=\"col-sm-2 sidenav\">\r\n      <div class=\"well\">\r\n        <p>ADS</p>\r\n      </div>\r\n      <div class=\"well\">\r\n        <p>ADS</p>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n<footer class=\"container-fluid text-center\">\r\n<p>Down here are even more words! However, the words here probably shouldn't be these words but rather links to some fancy\r\nplaces. Hopefully the links are safe, but who knows, its all just words.</p>\r\n</footer>\r\n"

/***/ }),

/***/ "./src/app/components/homepage/homepage.component.ts":
/*!***********************************************************!*\
  !*** ./src/app/components/homepage/homepage.component.ts ***!
  \***********************************************************/
/*! exports provided: HomePageComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomePageComponent", function() { return HomePageComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var HomePageComponent = /** @class */ (function () {
    function HomePageComponent() {
    }
    HomePageComponent.prototype.ngOnInit = function () {
    };
    HomePageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-homepage',
            template: __webpack_require__(/*! ./homepage.component.html */ "./src/app/components/homepage/homepage.component.html"),
            styles: [__webpack_require__(/*! ./homepage.component.css */ "./src/app/components/homepage/homepage.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], HomePageComponent);
    return HomePageComponent;
}());



/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.css":
/*!**************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".wrapper {\r\n\tmargin-top: 80px;\r\n\tmargin-bottom: 20px;\r\n}\r\n\r\n.form-signin {\r\n  max-width: 420px;\r\n  padding: 30px 38px 66px;\r\n  margin: 0 auto;\r\n  background-color: #eee;\r\n  border: 3px double rgba(255,0,0,0.1);\r\n  border-radius: 20px;\r\n  box-shadow: 10px 10px 500px grey;\r\n  }\r\n\r\n.form-signin-heading {\r\n  text-align:center;\r\n  margin-bottom: 30px;\r\n}\r\n\r\n.form-control {\r\n  position: relative;\r\n  font-size: 16px;\r\n  height: auto;\r\n  padding: 10px;\r\n}\r\n\r\ninput[type=\"text\"] {\r\n  margin-bottom: 0px;\r\n  border-bottom-left-radius: 0;\r\n  border-bottom-right-radius: 0;\r\n}\r\n\r\ninput[type=\"password\"] {\r\n  margin-bottom: 20px;\r\n  border-top-left-radius: 0;\r\n  border-top-right-radius: 0;\r\n}\r\n\r\n.colorgraph {\r\n  height: 7px;\r\n  border-top: 0;\r\n  background: #c4e17f;\r\n  border-radius: 5px;\r\n  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\r\n}\r\n"

/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.html":
/*!***************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class = \"container\">\r\n\t<div class=\"wrapper\">\r\n\t\t<form action=\"TODO_PUT_SERVLET_HERE\" method=\"post\" name=\"Login_Form\" class=\"form-signin\">\r\n\t\t    <h2 class=\"form-signin-heading\">Welcome Back!</h2>\r\n\t\t\t  <hr class=\"colorgraph\"><br>\r\n\r\n\t\t\t  <input type=\"text\" class=\"form-control\" [(ngModel)]=\"username\" name=\"Username\" placeholder=\"Username\" required=\"\" autofocus=\"\"/>\r\n\t\t\t  <input type=\"password\" class=\"form-control\" [(ngModel)]=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\"/>\r\n\r\n\t\t\t  <button class=\"btn btn-lg btn-primary btn-block\"style=\"background-color:#D31F37\" (click)=\"validateCredentials()\" name=\"Submit\" value=\"Login\" type=\"Submit\">Login</button>\r\n\t\t</form>\r\n\t</div>\r\n</div>\r\n"

/***/ }),

/***/ "./src/app/components/loginpage/loginpage.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/components/loginpage/loginpage.component.ts ***!
  \*************************************************************/
/*! exports provided: LoginPageComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginPageComponent", function() { return LoginPageComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LoginPageComponent = /** @class */ (function () {
    function LoginPageComponent(router) {
        this.router = router;
        this.username = "";
        this.password = "";
        this.usernameCheck = false;
        this.passwordCheck = false;
    }
    LoginPageComponent.prototype.ngOnInit = function () {
    };
    LoginPageComponent.prototype.checkIfValidUsername = function () {
        alert("TODO: checkIfValidUsername() NOT IMPLEMENTED YET.");
        this.usernameCheck = true;
    };
    LoginPageComponent.prototype.checkIfValidPassword = function () {
        alert("TODO: checkIfValidPassword() NOT IMPLEMENTED YET.");
        this.passwordCheck = true;
    };
    LoginPageComponent.prototype.validateCredentials = function () {
        this.checkIfValidUsername();
        this.checkIfValidPassword();
        if (this.usernameCheck && this.passwordCheck) {
            this.router.navigate(['/homepage']);
        }
        else { }
    };
    LoginPageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-loginpage',
            template: __webpack_require__(/*! ./loginpage.component.html */ "./src/app/components/loginpage/loginpage.component.html"),
            styles: [__webpack_require__(/*! ./loginpage.component.css */ "./src/app/components/loginpage/loginpage.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], LoginPageComponent);
    return LoginPageComponent;
}());



/***/ }),

/***/ "./src/app/components/media-post/media-post.component.css":
/*!****************************************************************!*\
  !*** ./src/app/components/media-post/media-post.component.css ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/media-post/media-post.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/components/media-post/media-post.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n<div class=\"container\">\r\n  <h2>Exotic Food</h2>\r\n  <a href=\"#\">[Click to see recipe]</a>\r\n  <br>\r\n  <p></p><br>\r\n  <img src={{postPic}} class=\"media-object\" style=\"width:450px\">\r\n  <br>\r\n<div class=\"well\" style=\"width:50%\">\r\n  <div class=\"media\">\r\n    <div class=\"media-left\">\r\n      <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n    </div>\r\n    <div class=\"media-body\">\r\n      <h4 class=\"media-heading\">Eric <small><i>Posted on February 19, 2016</i></small></h4>\r\n      <p>Check out this turtle!</p>\r\n\r\n      <!-- Nested media object -->\r\n      <div class=\"media\">\r\n        <div class=\"media-left\">\r\n          <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n        </div>\r\n        <div class=\"media-body\">\r\n          <h4 class=\"media-heading\">Walter <small><i>Posted on February 19, 2016</i></small></h4>\r\n          <p>I my god.</p>\r\n        </div>\r\n\r\n          <div class=\"media\">\r\n            <div class=\"media-left\">\r\n              <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n            </div>\r\n            <div class=\"media-body\">\r\n              <h4 class=\"media-heading\">Chris <small><i>Posted on February 19, 2016</i></small></h4>\r\n              <p>Stop fooling around, we have a website to make.</p>\r\n            </div>\r\n          </div>\r\n</div>\r\n        </div>\r\n      </div>\r\n\r\n  </div>\r\n</div>\r\n"

/***/ }),

/***/ "./src/app/components/media-post/media-post.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/components/media-post/media-post.component.ts ***!
  \***************************************************************/
/*! exports provided: MediaPostComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MediaPostComponent", function() { return MediaPostComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var MediaPostComponent = /** @class */ (function () {
    function MediaPostComponent() {
        this.img1Path = 'assets/images/img_avatar1.png';
        this.postPic = 'assets/images/main_pic.jpg';
    }
    MediaPostComponent.prototype.ngOnInit = function () {
    };
    MediaPostComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-media-post',
            template: __webpack_require__(/*! ./media-post.component.html */ "./src/app/components/media-post/media-post.component.html"),
            styles: [__webpack_require__(/*! ./media-post.component.css */ "./src/app/components/media-post/media-post.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], MediaPostComponent);
    return MediaPostComponent;
}());



/***/ }),

/***/ "./src/app/components/nav-bar/nav-bar.component.css":
/*!**********************************************************!*\
  !*** ./src/app/components/nav-bar/nav-bar.component.css ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".affix {\r\n      top: 0;\r\n      width: 100%;\r\n      z-index: 9999 !important;\r\n  }\r\n\r\n  .affix + .container-fluid {\r\n      padding-top: 70px;\r\n  }\r\n"

/***/ }),

/***/ "./src/app/components/nav-bar/nav-bar.component.html":
/*!***********************************************************!*\
  !*** ./src/app/components/nav-bar/nav-bar.component.html ***!
  \***********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<br><br><br>\r\n<nav class=\"navbar navbar-inverse\" data-spy=\"affix\">\r\n  <div class=\"container-fluid\">\r\n    <div class=\"navbar-header\">\r\n      <a class=\"navbar-brand\" routerLink=\"/homepage\">QuickByte</a>\r\n    </div>\r\n    <ul class=\"nav navbar-nav\">\r\n      <li class=\"active\"><a routerLink=\"/homepage\">Home</a></li>\r\n      <li><a href=\"#\">Page 1</a></li>\r\n      <li><a href=\"#\">Page 2</a></li>\r\n    </ul>\r\n    <ul class=\"nav navbar-nav navbar-right\">\r\n        <form class=\"navbar-form navbar-left\" action=\"/action_page.php\">\r\n          <div class=\"form-group\">\r\n            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n          </div>\r\n          <button type=\"submit\" class=\"btn btn-default\" style=\"background-color:red; color:white\">Submit</button>\r\n        </form>\r\n      <li><a routerLink=\"/signuppage\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n      <li><a routerLink=\"/loginpage\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n    </ul>\r\n  </div>\r\n</nav>\r\n"

/***/ }),

/***/ "./src/app/components/nav-bar/nav-bar.component.ts":
/*!*********************************************************!*\
  !*** ./src/app/components/nav-bar/nav-bar.component.ts ***!
  \*********************************************************/
/*! exports provided: NavBarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavBarComponent", function() { return NavBarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var NavBarComponent = /** @class */ (function () {
    function NavBarComponent() {
    }
    NavBarComponent.prototype.ngOnInit = function () {
    };
    NavBarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-nav-bar',
            template: __webpack_require__(/*! ./nav-bar.component.html */ "./src/app/components/nav-bar/nav-bar.component.html"),
            styles: [__webpack_require__(/*! ./nav-bar.component.css */ "./src/app/components/nav-bar/nav-bar.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], NavBarComponent);
    return NavBarComponent;
}());



/***/ }),

/***/ "./src/app/components/signuppage/signuppage.component.css":
/*!****************************************************************!*\
  !*** ./src/app/components/signuppage/signuppage.component.css ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".wrapper {\r\n\tmargin-top: 80px;\r\n\tmargin-bottom: 20px;\r\n}\r\n\r\n.form-signin {\r\n  max-width: 840px;\r\n  padding: 30px 38px 66px;\r\n  margin: 0 auto;\r\n  background-color: #eee;\r\n  border: 3px double rgba(255,0,0,0.1);\r\n  border-radius: 20px;\r\n  box-shadow: 10px 10px 500px grey;\r\n  }\r\n\r\n.form-signin-heading {\r\n  text-align:center;\r\n  margin-bottom: 30px;\r\n}\r\n\r\n.form-control {\r\n  position: relative;\r\n  font-size: 16px;\r\n  height: auto;\r\n  max-width: 700px;\r\n  padding: 10px;\r\n}\r\n\r\ninput[type=\"text\"] {\r\n  margin-bottom: 0px;\r\n  border-bottom-left-radius: 0;\r\n  border-bottom-right-radius: 0;\r\n}\r\n\r\ninput[type=\"password\"] {\r\n  margin-bottom: 20px;\r\n  border-top-left-radius: 0;\r\n  border-top-right-radius: 0;\r\n}\r\n\r\nbutton[type=\"button\"]{\r\n\tposition: relative;\r\n    font-size: 16px;\r\n    height: auto;\r\n    padding: 3px;\r\n\tborder-radius: 5px;\r\n\tbackground-color: red;\r\n\tcolor: white;\r\n}\r\n\r\nbutton[type=\"submit\"]{\r\n\tposition: relative;\r\n    font-size: 16px;\r\n    height: auto;\r\n    padding: 3px;\r\n\tborder-radius: 5px;\r\n\tbackground-color: green;\r\n\tcolor:white;\r\n}\r\n\r\n.colorgraph {\r\n  height: 7px;\r\n  border-top: 0;\r\n  background: #c4e17f;\r\n  border-radius: 5px;\r\n  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\r\n}\r\n"

/***/ }),

/***/ "./src/app/components/signuppage/signuppage.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/components/signuppage/signuppage.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<body>\r\n<div class = \"container\">\r\n    <div class=\"wrapper\">\r\n  <form class=\"form-signin\">\r\n    <div class=\"container\">\r\n      <h1>Sign Up</h1>\r\n      <p>Please fill in this form to create an account.</p>\r\n      <br>\r\n      <input type=\"text\" placeholder=\"Enter Username\" (blur)=\"checkIfUsernameTaken()\" [(ngModel)]=\"username\" class=\"form-control\" name=\"username\" required>\r\n      <br>\r\n      <input type=\"password\" placeholder=\"Enter Password\" (blur)=\"checkPasswordMatch()\" [(ngModel)]=\"password\" class=\"form-control\" name=\"password\" required>\r\n      <input type=\"password\" placeholder=\"Confirm Password\" (blur)=\"checkPasswordMatch()\" [(ngModel)]=\"passwordConfirm\" class=\"form-control\" name=\"passwordConfirm\" required>\r\n      <div class=\"alert alert-danger form-control\" [ngStyle]=displayError id=\"error-passwords\">Passwords do not match!</div>\r\n      <input type=\"number\" placeholder=\"Credit Card Number\" (blur)=\"checkValidCardNumber()\" [(ngModel)]=\"cardNum\" class=\"form-control\" name=\"cardNumber\" required>\r\n      <!-- <label>\r\n        <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\r\n      </label> -->\r\n\r\n      <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\r\n\r\n      <div class=\"clearfix\">\r\n          <button type=\"submit\" (click)=\"authenticateAndSubmit()\" class=\"signupbtn\">Sign Up</button>\r\n          <button type=\"button\" routerLink=\"/homepage\" class=\"cancelbtn\">Cancel</button>\r\n\r\n      </div>\r\n    </div>\r\n  </form>\r\n</div>\r\n</div>\r\n</body>\r\n"

/***/ }),

/***/ "./src/app/components/signuppage/signuppage.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/components/signuppage/signuppage.component.ts ***!
  \***************************************************************/
/*! exports provided: SignupPageComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SignupPageComponent", function() { return SignupPageComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SignupPageComponent = /** @class */ (function () {
    function SignupPageComponent(router) {
        this.router = router;
        this.password = "";
        this.passwordConfirm = "";
        this.username = "";
        this.displayError = {
            display: 'none',
        };
    }
    SignupPageComponent.prototype.ngOnInit = function () {
    };
    SignupPageComponent.prototype.checkPasswordMatch = function () {
        this.displayError.display = (this.password != this.passwordConfirm) ? 'block' : 'none';
        this.authenticationCheck = (this.password == this.passwordConfirm) ? true : false;
    };
    SignupPageComponent.prototype.checkIfUsernameTaken = function () {
        alert("TODO: checkIfUsernameTaken(): NOT IMPLEMENTED YET.");
        this.uniquenessCheck = true;
    };
    SignupPageComponent.prototype.checkValidCardNumber = function () {
        if (this.cardNum < 1000000000000 || this.cardNum >= 10000000000000000) {
            this.validCardCheck = false;
        }
        else
            this.validCardCheck = true;
        console.log(this.cardNum);
        console.log(this.validCardCheck);
    };
    SignupPageComponent.prototype.authenticate = function () {
        this.checkPasswordMatch();
        this.checkIfUsernameTaken();
    };
    SignupPageComponent.prototype.submit = function () {
        this.router.navigate(['/homepage']);
    };
    SignupPageComponent.prototype.authenticateAndSubmit = function () {
        this.authenticate();
        if (this.authenticationCheck && this.uniquenessCheck && this.validCardCheck) {
            this.submit();
        }
        else { }
    };
    SignupPageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-signuppage',
            template: __webpack_require__(/*! ./signuppage.component.html */ "./src/app/components/signuppage/signuppage.component.html"),
            styles: [__webpack_require__(/*! ./signuppage.component.css */ "./src/app/components/signuppage/signuppage.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], SignupPageComponent);
    return SignupPageComponent;
}());



/***/ }),

/***/ "./src/app/routing.ts":
/*!****************************!*\
  !*** ./src/app/routing.ts ***!
  \****************************/
/*! exports provided: approutes */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "approutes", function() { return approutes; });
/* harmony import */ var _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./components/homepage/homepage.component */ "./src/app/components/homepage/homepage.component.ts");
/* harmony import */ var _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./components/loginpage/loginpage.component */ "./src/app/components/loginpage/loginpage.component.ts");
/* harmony import */ var _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./components/signuppage/signuppage.component */ "./src/app/components/signuppage/signuppage.component.ts");
/* harmony import */ var _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/errorpage404/errorpage404.component */ "./src/app/components/errorpage404/errorpage404.component.ts");




var approutes = [
    {
        //The URL mapping
        path: 'homepage',
        component: _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_0__["HomePageComponent"]
    },
    {
        path: 'loginpage',
        component: _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_1__["LoginPageComponent"]
    },
    {
        //The URL mapping
        path: 'signuppage',
        component: _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_2__["SignupPageComponent"]
    },
    {
        //Home page
        path: '',
        redirectTo: '/homepage',
        pathMatch: 'full'
    },
    {
        //Any path at all should lead to interpolation
        //(Assuming the above paths are hit first)
        //This designates how a user can be taken back to this page
        //should they arrive at a 404
        path: '**',
        component: _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_3__["ErrorPage404Component"]
    }
];


/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\Swilery\Documents\workspace-sts-3.9.4.RELEASE\QuickByte\Angular\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map