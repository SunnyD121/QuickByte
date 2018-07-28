import { Routes } from '@angular/router';


import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';
import { ErrorPage404Component } from './components/errorpage404/errorpage404.component';


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
        //Walter here, screwing around.
        //Home page
        path: '',
        // redirectTo: '/homepage',
        component: HomePageComponent,
        pathMatch: 'full'
    },
    {
        //Any path at all should lead to 404page
        //(Assuming the above paths are hit first)
        //This designates how a user can be taken back to this page
        //should they arrive at a 404
        path: '**',
        component: ErrorPage404Component
    }
]
