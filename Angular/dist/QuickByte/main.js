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
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _services_user_service_user_service_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./services/user-service/user-service.service */ "./src/app/services/user-service/user-service.service.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./components/nav-bar/nav-bar.component */ "./src/app/components/nav-bar/nav-bar.component.ts");
/* harmony import */ var _components_media_post_media_post_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./components/media-post/media-post.component */ "./src/app/components/media-post/media-post.component.ts");
/* harmony import */ var _routing__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./routing */ "./src/app/routing.ts");
/* harmony import */ var _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./components/homepage/homepage.component */ "./src/app/components/homepage/homepage.component.ts");
/* harmony import */ var _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/loginpage/loginpage.component */ "./src/app/components/loginpage/loginpage.component.ts");
/* harmony import */ var _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/signuppage/signuppage.component */ "./src/app/components/signuppage/signuppage.component.ts");
/* harmony import */ var _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./components/errorpage404/errorpage404.component */ "./src/app/components/errorpage404/errorpage404.component.ts");
/* harmony import */ var _components_expandable_pane_expandable_pane_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./components/expandable-pane/expandable-pane.component */ "./src/app/components/expandable-pane/expandable-pane.component.ts");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
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
                _app_component__WEBPACK_IMPORTED_MODULE_6__["AppComponent"],
                _components_nav_bar_nav_bar_component__WEBPACK_IMPORTED_MODULE_7__["NavBarComponent"],
                _components_media_post_media_post_component__WEBPACK_IMPORTED_MODULE_8__["MediaPostComponent"],
                _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_10__["HomePageComponent"],
                _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_11__["LoginPageComponent"],
                _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_12__["SignupPageComponent"],
                _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_13__["ErrorPage404Component"],
                _components_expandable_pane_expandable_pane_component__WEBPACK_IMPORTED_MODULE_14__["ExpandablePaneComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClientModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(_routing__WEBPACK_IMPORTED_MODULE_9__["approutes"], { onSameUrlNavigation: 'reload' })
            ],
            providers: [_services_user_service_user_service_service__WEBPACK_IMPORTED_MODULE_5__["UserService"], { provide: _angular_common__WEBPACK_IMPORTED_MODULE_15__["APP_BASE_HREF"], useValue: '' }, { provide: _angular_common__WEBPACK_IMPORTED_MODULE_15__["LocationStrategy"], useClass: _angular_common__WEBPACK_IMPORTED_MODULE_15__["HashLocationStrategy"] }],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_6__["AppComponent"]]
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
    ErrorPage404Component.prototype.ngOnInit = function () { };
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

/***/ "./src/app/components/expandable-pane/expandable-pane.component.css":
/*!**************************************************************************!*\
  !*** ./src/app/components/expandable-pane/expandable-pane.component.css ***!
  \**************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".container {\r\n     white-space: pre-wrap;\r\n     line-height: 16px;\r\n     width: 400px;\r\n     overflow: hidden;\r\n}\r\n\r\nspan {\r\n    color:grey;\r\n    font-size: 12px;\r\n}\r\n\r\nspan:hover {\r\n    cursor: pointer\r\n}\r\n\r\n*{\r\n    white-space: pre-wrap;\r\n}\r\n"

/***/ }),

/***/ "./src/app/components/expandable-pane/expandable-pane.component.html":
/*!***************************************************************************!*\
  !*** ./src/app/components/expandable-pane/expandable-pane.component.html ***!
  \***************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n<div class=\"well\" (click)=\"customClick()\" [style.width]=\"width\">\r\n    <div  [style.overflow]=\"overflow\" [style.height]=\"height\">\r\n        <ng-content></ng-content>\r\n    </div>\r\n    <span [innerHtml]=\"clickTitle\"></span>\r\n</div>\r\n"

/***/ }),

/***/ "./src/app/components/expandable-pane/expandable-pane.component.ts":
/*!*************************************************************************!*\
  !*** ./src/app/components/expandable-pane/expandable-pane.component.ts ***!
  \*************************************************************************/
/*! exports provided: ExpandablePaneComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ExpandablePaneComponent", function() { return ExpandablePaneComponent; });
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

var ExpandablePaneComponent = /** @class */ (function () {
    function ExpandablePaneComponent() {
        this.expanded = false;
        this.overflow = "hidden";
        this.clickTitle = "Click to Expand";
    }
    ExpandablePaneComponent.prototype.customClick = function () {
        if (this.expanded = !this.expanded) {
            this.overflow = "visible";
            this.height = "auto";
            this.clickTitle = "Less";
        }
        else {
            this.overflow = "hidden";
            this.height = (this.min_height) ? this.min_height : "64px";
            this.clickTitle = "Click to Expand";
        }
    };
    ExpandablePaneComponent.prototype.ngOnInit = function () {
        this.height = (this.min_height) ? this.min_height : "64px";
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], ExpandablePaneComponent.prototype, "width", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], ExpandablePaneComponent.prototype, "min_height", void 0);
    ExpandablePaneComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-expandable-pane',
            template: __webpack_require__(/*! ./expandable-pane.component.html */ "./src/app/components/expandable-pane/expandable-pane.component.html"),
            styles: [__webpack_require__(/*! ./expandable-pane.component.css */ "./src/app/components/expandable-pane/expandable-pane.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ExpandablePaneComponent);
    return ExpandablePaneComponent;
}());



/***/ }),

/***/ "./src/app/components/homepage/homepage.component.css":
/*!************************************************************!*\
  !*** ./src/app/components/homepage/homepage.component.css ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\r\n/* Remove the navbar's default margin-bottom and rounded borders */\r\n.navbar {\r\n  margin-bottom: 0;\r\n  border-radius: 0;\r\n}\r\n/* Set height of the grid so .sidenav can be 100% (adjust as needed) */\r\n.row.content {height: 450px}\r\n/* Set gray background color and 100% height */\r\n.sidenav {\r\n  padding-top: 20px;\r\n  background-color: #f1f1f1;\r\n  height: 300%; /* This setting sets the size of the grayish background on the sidebar */\r\n}\r\n/* Set black background color, white text and some padding */\r\nfooter {\r\n  background-color: #555;\r\n  color: white;\r\n  padding: 15px;\r\n}\r\n/* On small screens, set height to 'auto' for sidenav and grid */\r\n@media screen and (max-width: 767px) {\r\n  .sidenav {\r\n    height: auto;\r\n    padding: 15px;\r\n  }\r\n  .row.content {height:auto;}\r\n}\r\n.ad:hover {\r\n    cursor:pointer;\r\n}\r\n/* Uncomment this if you want the ads to be REALLY annoying */\r\n/*\r\n@keyframes blink {\r\n    0% {\r\n        opacity: 1;\r\n    }\r\n    49% {\r\n        opacity: 1;\r\n    }\r\n    50% {\r\n        opacity: 0;\r\n    }\r\n    100% {\r\n        opacity: 0;\r\n    }\r\n}\r\nimg {\r\n    animation: blink 0.5s;\r\n    animation-iteration-count: infinite;\r\n}\r\n*/\r\n"

/***/ }),

/***/ "./src/app/components/homepage/homepage.component.html":
/*!*************************************************************!*\
  !*** ./src/app/components/homepage/homepage.component.html ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-nav-bar></app-nav-bar>\r\n\r\n<div class=\"container-fluid text-center\">\r\n  <div class=\"row content\">\r\n    <div class=\"col-sm-2 sidenav\">\r\n        <h3>Helpful Links</h3>\r\n        <br>\r\n        <p><a href=\"#\">Become a Premium Member!</a></p>\r\n        <p><a href=\"#\">Subscribe to our Newsletter!</a></p>\r\n        <p><a href=\"#\">Become a Premium Member!</a></p>\r\n        <p><a href=\"#\">Become a Premium Member!</a></p>\r\n    </div>\r\n    <div class=\"col-sm-8 text-left\">\r\n      <h1>{{headerTitle}}</h1>\r\n      <p style=\"white-space:pre-wrap\">{{headerMessage}}</p>\r\n      <div *ngIf=\"searchedPosts; else elseBlock1\"> <!-- if there are posts (search results) -->\r\n          <div *ngFor=\"let post of searchedPosts\"> <!-- loop over all posts -->\r\n              <app-media-post [postPic]=\"post.img\" [postComments]=\"post.comments[0].commentContent\" [postRecipe]=\"post.recipe\"></app-media-post>\r\n          </div>\r\n      </div>  <!-- end *ngIf -->\r\n      <ng-template #elseBlock1>\r\n          <hr>\r\n      </ng-template>\r\n    </div>\r\n    <div class=\"col-sm-2 sidenav\">\r\n\r\n        <!-- loops the ad -->\r\n        <div *ngFor=\"let element of array\">\r\n            <div class=\"well\">\r\n                <a href=\"https://revature.com\" ><img class=\"ad\" src=\"../assets/images/ad_revature.png\" style=\"max-width: 100%\"></a>\r\n            </div>\r\n        </div>\r\n\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n<footer class=\"container-fluid text-center\">\r\n<p>Down here are even more words! However, the words here probably shouldn't be these words but rather links to some fancy\r\nplaces. Hopefully the links are safe, but who knows, its all just words.</p>\r\n</footer>\r\n"

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


var HomePageComponent = /** @class */ (function () {
    function HomePageComponent(activatedRoute, router) {
        var _this = this;
        this.activatedRoute = activatedRoute;
        this.router = router;
        this.array = new Array(7);
        this.validCriteria = ["American", "British", "Carribean", "Chinese", "French", "German", "Greek", "Indian", "Italian", "Japanese", "Korean", "Mexican", "Portuguese", "Spanish", "Thai"];
        //TODO: delete this, for testing purposes only
        this.testString = "Voilà! In view, a humble vaudevillian veteran, cast vicariously as both victim and villian"
            + " by the vicissitudes of Fate. This visage, no mere veneer of vanity, is a vestige of the"
            + " vox populi, now vacant, vanished. However, this valorous visitation of a by-gone vexation,"
            + " stands vivified and has vowed to vanquish these venal and virulent vermin vanguarding vice"
            + " and vouchsafing the violently vicious and voracious violation of volition. (he carves a \"V\""
            + " into a sign) The only verdict is vengence; a vendetta, held as a votive, not in vain, for"
            + " the value and veracity of such shall one day vindicate the vigilant and the virtuous."
            + " (giggles) Verily, this vichyssoise of verbiage veers most verbose, so let me simply add"
            + " that it is my very good honor to meet you and you may call me V.\n     -V for Vendetta";
        /* This part will only be accessable on load only. So, it will not be accessable on Reload. */
        this.activatedRoute.queryParams.subscribe(function (queryParams) {
            /* This part will be accessable on Reload */
            _this.isInitialized = false;
            _this.ngOnInit();
        });
    }
    HomePageComponent.prototype.ngOnInit = function () {
        var _this = this;
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.activatedRoute.queryParams.subscribe(function (params) { _this.query = params.query; });
            if (!this.query) {
                this.headerTitle = "Welcome";
                this.headerMessage = "This is some information. There are words here talking about the words that should be here instead of the words that are here,"
                    + " these words. Words words words words words. Did you know that you can type virtually anything onto a webpage?";
                this.searchedPosts = this.getPostsMatchingSearchCriteria("trending");
            }
            else {
                this.headerTitle = "Search Results";
                if (!this.contains(this.query, this.validCriteria)) {
                    this.headerMessage = "\'" + this.query + "\' is not a valid search criteria. Valid critera are: \n" + this.validCriteria;
                    this.searchedPosts = null;
                }
                else {
                    this.headerMessage = "Showing results for \'" + this.query + "\':";
                    this.searchedPosts = this.getPostsMatchingSearchCriteria("french");
                }
            }
        }
    };
    HomePageComponent.prototype.getPostsMatchingSearchCriteria = function (searchQuery) {
        alert("TODO: Call backend and retrieve posts matching search criteria NOT IMPLEMENTED YET");
        //Use searchQuery here to call Service layer
        //NOTE: Hardcoded to emulate functionality
        var posts;
        if (searchQuery.toLowerCase() == "trending")
            posts = [
                { img: "../assets/images/food1.jpg",
                    recipe: "Step 1: Take out of box \nStep 2: put in oven \nStep 3: Take out of oven \nStep 4: Eat while hot.",
                    comments: [{ cid: 1, pid: 2, uid: 3, commentContent: "Hello World" }]
                },
                { img: "../assets/images/food2.jpg",
                    recipe: this.testString,
                    comments: [{ cid: 4, pid: 5, uid: 6, commentContent: "I am saying words and you are reading words." }]
                },
                { img: "../assets/images/food4.jpg",
                    recipe: "HelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld",
                    comments: [{ cid: 7, pid: 8, uid: 9, commentContent: "This is a comment!" }]
                }
            ];
        else if (searchQuery.toLowerCase() == "french")
            posts = [
                { img: "../assets/images/food3.jpg",
                    recipe: "Eat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,",
                    comments: [{ cid: 10, pid: 11, uid: 12, commentContent: "I can't believe you." }]
                }
            ];
        else
            posts = null;
        return posts;
    };
    HomePageComponent.prototype.reloadPage = function () {
        this.router.navigate([this.router.url]);
    };
    HomePageComponent.prototype.contains = function (word, container) {
        word = word.toLowerCase();
        for (var _i = 0, container_1 = container; _i < container_1.length; _i++) {
            var s = container_1[_i];
            if (s.toLowerCase() == word)
                return true;
        }
        return false;
    };
    HomePageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-homepage',
            template: __webpack_require__(/*! ./homepage.component.html */ "./src/app/components/homepage/homepage.component.html"),
            styles: [__webpack_require__(/*! ./homepage.component.css */ "./src/app/components/homepage/homepage.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
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

module.exports = "<div class = \"container\">\r\n\t<div class=\"wrapper\">\r\n\t\t<form action=\"testFunction2()\" method=\"post\" name=\"Login_Form\" class=\"form-signin\">\r\n\t\t    <h2 class=\"form-signin-heading\">Welcome Back!</h2>\r\n\t\t\t  <hr class=\"colorgraph\"><br>\r\n\r\n\t\t\t  <input type=\"text\" class=\"form-control\" [(ngModel)]=\"username\" name=\"Username\" placeholder=\"Username\" required=\"\" autofocus=\"\"/>\r\n\t\t\t  <input type=\"password\" class=\"form-control\" [(ngModel)]=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\"/>\r\n\r\n\t\t\t  <button class=\"btn btn-lg btn-primary btn-block\"style=\"background-color:#D31F37\" (click)=\"validateCredentials()\" name=\"Submit\" value=\"Login\" type=\"Submit\">Login</button>\r\n\t\t</form>\r\n\t</div>\r\n</div>\r\n"

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
/* harmony import */ var _services_user_service_user_service_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/user-service/user-service.service */ "./src/app/services/user-service/user-service.service.ts");
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
    function LoginPageComponent(router, userService) {
        this.router = router;
        this.userService = userService;
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
        this.testFunction2();
        if (this.usernameCheck && this.passwordCheck) {
            this.router.navigate(['/homepage']);
        }
        else { }
    };
    LoginPageComponent.prototype.testFunction = function () {
        this.userService.getUser().subscribe(function (data) {
            console.log(data);
        }, function (error) {
            console.log("ERROR");
            console.log(error);
        });
        console.log("clicked!");
    };
    LoginPageComponent.prototype.testFunction2 = function () {
        //console.log("commented out.");
        console.log(this.username);
        this.userService.checkCredentials(this.username, this.password).subscribe(function (user) { return console.log(user); });
    };
    LoginPageComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-loginpage',
            template: __webpack_require__(/*! ./loginpage.component.html */ "./src/app/components/loginpage/loginpage.component.html"),
            styles: [__webpack_require__(/*! ./loginpage.component.css */ "./src/app/components/loginpage/loginpage.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"], _services_user_service_user_service_service__WEBPACK_IMPORTED_MODULE_2__["UserService"]])
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

module.exports = ".subheader {\r\n    color:grey;\r\n}\r\n\r\n.glyph-text {\r\n    font-size: 18px;\r\n    padding-left: 8px;\r\n}\r\n\r\n.glyphicon {\r\n    font-size: 12px;\r\n    border: solid;\r\n    border-style: solid;\r\n    padding: 5px;\r\n    color: black;\r\n    background-color: lightgrey;\r\n    border-color: black;\r\n}\r\n\r\n.post-badge {\r\n    padding-right: 2px\r\n}\r\n\r\n.glyphicon:hover {\r\n    cursor: pointer;\r\n    color: white;\r\n}\r\n"

/***/ }),

/***/ "./src/app/components/media-post/media-post.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/components/media-post/media-post.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<hr>\r\n<div class=\"container\">\r\n  <h2>Exotic Food</h2>\r\n  <span class=\"subheader\"><i>Posted by So-And-So</i></span>\r\n  <br>\r\n  <p></p><br>\r\n  <div class=\"container\">\r\n      <div class=\"row\">\r\n          <div class=\"col-sm-5\">\r\n                <img src={{postPic}} class=\"media-object\" style=\"width:450px\">\r\n          </div>\r\n          <div class=\"col-sm-4\">\r\n              <h3>Recipe</h3>\r\n              <app-expandable-pane>{{postRecipe}}</app-expandable-pane>\r\n          </div>\r\n\r\n      </div>\r\n  </div>\r\n\r\n  <span>\r\n      <a class=\"post-badge\" style=\"padding-left:150px\"><span class=\"glyphicon glyphicon-heart\"><span class=\"glyph-text\">Favorite</span></span></a>\r\n      <a class=\"post-badge\"><span class=\"glyphicon glyphicon-thumbs-up\"><span class=\"glyph-text\">Like</span></span></a>\r\n      <a class=\"post-badge\"><span class=\"glyphicon glyphicon-thumbs-down\"><span class=\"glyph-text\">Dislike</span></span></a>\r\n      <a class=\"post-badge\"><span class=\"glyphicon glyphicon-share-alt\"><span class=\"glyph-text\">Share</span></span></a>\r\n  </span>\r\n  <br><br>\r\n  <app-expandable-pane width=\"50%\" min_height=\"128px\">\r\n  <div class=\"media\">\r\n    <div class=\"media-left\">\r\n      <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n    </div>\r\n    <div class=\"media-body\">\r\n      <h4 class=\"media-heading\">Eric <small><i>Posted on February 19, 2016</i></small></h4>\r\n      <p>Check out this turtle!</p>\r\n\r\n      <!-- Nested media object -->\r\n      <div class=\"media\">\r\n        <div class=\"media-left\">\r\n          <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n        </div>\r\n        <div class=\"media-body\">\r\n          <h4 class=\"media-heading\">Walter <small><i>Posted on February 19, 2016</i></small></h4>\r\n          <p>{{postComments}}</p>\r\n        </div>\r\n\r\n          <div class=\"media\">\r\n            <div class=\"media-left\">\r\n              <img src={{img1Path}} class=\"media-object\" style=\"width:45px\">\r\n            </div>\r\n            <div class=\"media-body\">\r\n              <h4 class=\"media-heading\">Chris <small><i>Posted on February 19, 2016</i></small></h4>\r\n              <p>Stop fooling around, we have a website to make.</p>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n\r\n  </div>\r\n  </app-expandable-pane>\r\n</div>\r\n"

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
        //TODO: Delete, these pictures are for testing only
        this.img1Path = 'assets/images/img_avatar1.png';
        // this.testImage = 'assets/images/testImage.png';
        // this.postPic = 'assets/images/main_pic.jpg';
    }
    MediaPostComponent.prototype.ngOnInit = function () {
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], MediaPostComponent.prototype, "postPic", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], MediaPostComponent.prototype, "postComments", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], MediaPostComponent.prototype, "postRecipe", void 0);
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

module.exports = "<br><br><br>\r\n<nav class=\"navbar navbar-inverse\" data-spy=\"affix\">\r\n  <div class=\"container-fluid\">\r\n    <div class=\"navbar-header\">\r\n      <a class=\"navbar-brand\" routerLink=\"/homepage\">QuickByte</a>\r\n    </div>\r\n    <ul class=\"nav navbar-nav\">\r\n      <li class=\"active\"><a routerLink=\"/homepage\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\r\n      <li><a href=\"#\">Page 1</a></li>\r\n      <li><a href=\"#\">Page 2</a></li>\r\n    </ul>\r\n    <ul class=\"nav navbar-nav navbar-right\">\r\n        <form class=\"navbar-form navbar-left\" action=\"/action_page.php\">\r\n          <div class=\"form-group\">\r\n            <input type=\"text\" class=\"form-control\" name=\"search-bar\" [(ngModel)]=searchQuery placeholder=\"Search\">\r\n          </div>\r\n          <button type=\"submit\" (click)=\"search()\" class=\"btn btn-default\" style=\"background-color:red; color:white\">Submit</button>\r\n        </form>\r\n      <li><a routerLink=\"/signuppage\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n      <li><a routerLink=\"/loginpage\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n    </ul>\r\n  </div>\r\n</nav>\r\n"

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


var NavBarComponent = /** @class */ (function () {
    function NavBarComponent(router) {
        this.router = router;
        this.searchQuery = "";
        this.searchResults = null;
    }
    NavBarComponent.prototype.search = function () {
        //TODO: call the database with searchQuery and see if it matches a tag, return the collection of posts
        alert("search() NOT IMPLEMENTED YET.");
        if (this.searchResults == null) {
            this.router.navigate(['/searchResults'], { queryParams: { query: this.searchQuery } });
        }
    };
    NavBarComponent.prototype.ngOnInit = function () {
    };
    NavBarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-nav-bar',
            template: __webpack_require__(/*! ./nav-bar.component.html */ "./src/app/components/nav-bar/nav-bar.component.html"),
            styles: [__webpack_require__(/*! ./nav-bar.component.css */ "./src/app/components/nav-bar/nav-bar.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
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
    };
    SignupPageComponent.prototype.authenticate = function () {
        this.checkPasswordMatch();
        this.checkIfUsernameTaken();
    };
    SignupPageComponent.prototype.submit = function () {
        //   this.router.navigate(['/homepage']);
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
        path: 'Homepage',
        component: _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_0__["HomePageComponent"]
    },
    {
        path: 'loginpage',
        component: _components_loginpage_loginpage_component__WEBPACK_IMPORTED_MODULE_1__["LoginPageComponent"]
    },
    {
        path: 'signuppage',
        component: _components_signuppage_signuppage_component__WEBPACK_IMPORTED_MODULE_2__["SignupPageComponent"]
    },
    {
        path: 'searchResults',
        component: _components_homepage_homepage_component__WEBPACK_IMPORTED_MODULE_0__["HomePageComponent"]
    },
    {
        //Home page
        path: '',
        redirectTo: '/homepage',
        pathMatch: 'full'
    },
    {
        //Any path at all should lead homepage
        //(Assuming the above paths are hit first)
        //This is needed for the server.
        path: '**',
        component: _components_errorpage404_errorpage404_component__WEBPACK_IMPORTED_MODULE_3__["ErrorPage404Component"]
        // component: HomePageComponent
    }
];


/***/ }),

/***/ "./src/app/services/user-service/user-service.service.ts":
/*!***************************************************************!*\
  !*** ./src/app/services/user-service/user-service.service.ts ***!
  \***************************************************************/
/*! exports provided: UserService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UserService", function() { return UserService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var UserService = /** @class */ (function () {
    function UserService(http) {
        this.http = http;
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpHeaders"]({
                'Content-Type': 'application/json',
                'Authorization': 'my-auth-token'
            })
        };
    }
    UserService.prototype.getUser = function () {
        return this.http.get("http://localhost:8081/LoginServlet");
    };
    UserService.prototype.checkCredentials = function (username, password) {
        console.log("Posting:");
        // return this.http.post<User>("http://localhost:8081/LoginServlet", username, this.httpOptions);
        return this.http.post("http://localhost:8081/LoginServlet", username);
    };
    UserService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], UserService);
    return UserService;
}());



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

module.exports = __webpack_require__(/*! C:\Users\Chris\Documents\Repos\QuickByte\Angular\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map