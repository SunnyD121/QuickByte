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

    constructor(private router:Router, private cookieService: CookieService) { this.getLogInOrOutText();}

    public search(){
        //TODO: call the database with searchQuery and see if it matches a tag, return the collection of posts
        alert("search() NOT IMPLEMENTED YET.");
        if (this.searchResults == null){
            this.router.navigate(['/searchResults'], { queryParams: { query: this.searchQuery } });
        }

    }

    public logInOrOut(){
        if (!this.cookieService.get("LoggedIn")) this.router.navigate(['/loginpage']);
        else if (this.cookieService.get("LoggedIn") == 'true') {
            this.cookieService.deleteAll();
            alert("You have been logged out.");
            this.router.navigate(['/homepage']);
        }
    }

    public getLogInOrOutText(){
        this.logInOrOutText = (this.cookieService.get('LoggedIn') == 'true') ? "Log Out" : "Log In"
    }





  ngOnInit() {
  }

}
