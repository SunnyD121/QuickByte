import { Routes } from '@angular/router';


import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';
// import { ErrorPage404Component } from './components/errorpage404/errorpage404.component';


export const approutes: Routes = [
    {
        //The URL mapping
        path: 'homepage',
        component: HomePageComponent
    },
    {
        //The URL mapping
        path: 'Homepage',
        component: HomePageComponent
    },
    {
        path: 'loginpage',
        component: LoginPageComponent
    },
    {
        //The URL mapping
        path: 'signuppage',
        component: SignupPageComponent
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
        // component: ErrorPage404Component
        component: HomePageComponent
    }
]
