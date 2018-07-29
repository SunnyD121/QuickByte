import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import { LowerCasePipe } from '@angular/common';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomePageComponent implements OnInit, OnDestroy {
    query: string;
    array = new Array<number>(7);
    headerTitle: string;
    headerMessage: string;
    validCriteria = ["American", "British", "Carribean", "Chinese", "French", "German", "Greek", "Indian", "Italian", "Japanese", "Korean", "Mexican", "Portuguese", "Spanish", "Thai"];

  ngOnInit() {
      this.route.queryParams.subscribe(params => {this.query = params.query;});
      if (!this.query) {    //if not arriving here via search results
          this.headerTitle = "Welcome";
          this.headerMessage = "This is some information. There are words here talking about the words that should be here instead of the words that are here,"
                + " these words. Words words words words words. Did you know that you can type virtually anything onto a webpage?"
      }
      else {
          this.headerTitle = "Search Results";
          if (!this.contains(this.query, this.validCriteria)){
              this.headerMessage = "\'" + this.query + "\' is not a valid search criteria. Valid critera are: \n" + this.validCriteria;
          }
          else {
              this.headerMessage = "Showing results for \'" + this.query + "\':";
          }
      }
  }

  constructor(private route: ActivatedRoute, private router: Router) {
      this.navigationSubscription = this.router.events.subscribe((e: any) => {
         // If it is a NavigationEnd event re-initalise the component
         if (e instanceof NavigationEnd) {
           this.initializeValues();
         }
       });
  }

  initializeValues() {}

  ngOnDestroy() {
      //For avoiding memory leaks
    if (this.navigationSubscription) {
       this.navigationSubscription.unsubscribe();
    }
    if (this.route.queryParams) this.route.queryParams.unsubscribe();
  }

  contains(word: string, container:string[]){
      word = word.toLowerCase();
      for (let s of container){
          if (s.toLowerCase() == word) return true;
      }
      return false;

  }
}
