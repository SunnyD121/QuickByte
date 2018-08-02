import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
    searchQuery="";
    searchResults = null;
    logInOrOutText: string;
    signUpOrPostText: string;
    signUpOrPostGlyph: string;

    constructor(private router:Router, private cookie: CookieService) {
        this.getLogInOrOutText();
        this.getSignUpOrPostText();
    }

    public search(){
        //TODO: call the database with searchQuery and see if it matches a tag, return the collection of posts
        alert("search() NOT IMPLEMENTED YET.");
        if (this.searchResults == null){
            this.router.navigate(['/searchResults'], { queryParams: { query: this.searchQuery } });
        }

    }

    public logInOrOut(){
        if (!this.cookie.get("LoggedIn")) this.router.navigate(['/loginpage']);
        else if (this.cookie.get("LoggedIn") == 'true') {
            this.cookie.deleteAll();
            alert("You have been logged out.");
            this.router.navigate(['/homepage']);
        }
        else console.log("Something unexpected happened.");
    }

    public getLogInOrOutText(){
        this.logInOrOutText = (this.cookie.get('LoggedIn') == 'true') ? "Log Out" : "Log In";
    }

    public signUpOrPost(){
        if (!this.cookie.get("LoggedIn")) this.router.navigate(['/signuppage']);
        else if (this.cookie.get("LoggedIn") == 'true') {
            this.router.navigate(['/create-post']);
        }
        else console.log("Something unexpected happened.");
    }

    public getSignUpOrPostText(){
        this.signUpOrPostText = (this.cookie.get('LoggedIn') == 'true') ? "New Post" : "Sign Up";
        this.signUpOrPostGlyph = (this.cookie.get('LoggedIn') == 'true') ? "glyphicon glyphicon-plus" : "glyphicon glyphicon-user";
    }


  ngOnInit() {
  }

}
