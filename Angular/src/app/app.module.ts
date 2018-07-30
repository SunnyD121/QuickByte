import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from './services/user-service/user-service.service';

import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { MediaPostComponent } from './components/media-post/media-post.component';

import { approutes } from './routing';
import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';
import { ErrorPage404Component } from './components/errorpage404/errorpage404.component';
import { ExpandablePaneComponent } from './components/expandable-pane/expandable-pane.component';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';

import { APP_BASE_HREF } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    MediaPostComponent,
    HomePageComponent,
    LoginPageComponent,
    SignupPageComponent,
    ErrorPage404Component,
    ExpandablePaneComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(approutes, {onSameUrlNavigation:'reload'})
  ],
  providers: [UserService, {provide: APP_BASE_HREF, useValue : ''}, { provide: LocationStrategy, useClass: HashLocationStrategy }],
  bootstrap: [AppComponent]
})
export class AppModule { }