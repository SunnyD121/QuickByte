import { Routes } from '@angular/router';


import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';
import { ErrorPage404Component } from './components/errorpage404/errorpage404.component';
import { CreatePostComponent } from './components/create-post/create-post.component';
import { AdminPageComponent } from './components/adminpage/adminpage.component';


export const approutes: Routes = [
    {
        //The URL mapping
        path: 'homepage',
        component: HomePageComponent
    },
    {
        path: 'Homepage',
        component: HomePageComponent
    },
    {
        path: 'loginpage',
        component: LoginPageComponent
    },
    {
        path: 'signuppage',
        component: SignupPageComponent
    },
    {
        path: 'searchResults',
        component: HomePageComponent
    },
    {
        path: 'create-post',
        component: CreatePostComponent
    },
    {
        path: 'adminpage',
        component: AdminPageComponent
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
        component: ErrorPage404Component
        // component: HomePageComponent
    }
]
