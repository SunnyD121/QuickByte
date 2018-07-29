import { Routes } from '@angular/router';


import { HomePageComponent } from './components/homepage/homepage.component';
import { LoginPageComponent } from './components/loginpage/loginpage.component';
import { SignupPageComponent } from './components/signuppage/signuppage.component';
import { ErrorPage404Component } from './components/errorpage404/errorpage404.component';


export const approutes: Routes = [
    {
        //The URL mapping
        path: 'homepage',
        component: HomePageComponent,
        runGuardsAndResolvers: 'always'

    },
    {
        path: 'Homepage',
        component: HomePageComponent,
        runGuardsAndResolvers: 'always'
    },
    {
        path: 'loginpage',
        component: LoginPageComponent,
        runGuardsAndResolvers: 'always'
    },
    {
        path: 'signuppage',
        component: SignupPageComponent,
        runGuardsAndResolvers: 'always'
    },
    {
        path: 'searchResults',
        component: HomePageComponent,
        runGuardsAndResolvers: 'always'
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
        component: ErrorPage404Component,

        // component: HomePageComponent
        runGuardsAndResolvers: 'always'
    }
]
