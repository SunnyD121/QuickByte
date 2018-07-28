import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
    searchQuery="";
    searchResults = null;

    public search(){
        //TODO: call the database with searchQuery and see if it matches a tag, return the collection of posts
        alert("search() NOT IMPLEMENTED YET.");
        if (this.searchResults == null){
            this.router.navigate(['/searchResults']);
        }

    }


  constructor(private router:Router) { }

  ngOnInit() {
  }

}
