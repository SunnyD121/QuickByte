import { Routes } from '@angular/router';


import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';


export const approutes: Routes = [
    {
        //The URL mapping
        path: 'homepage',
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
        redirectTo: '/Homepage',
        pathMatch: 'full'
    },
    {
        //Any path at all should lead to interpolation
        //(Assuming the above paths are hit first)
        //This designates how a user can be taken back to this page
        //should they arrive at a 404
        path: '**',
        component: HomePageComponent
    }
]
