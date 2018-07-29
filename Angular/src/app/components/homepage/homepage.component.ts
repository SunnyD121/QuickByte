import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import { LowerCasePipe } from '@angular/common';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomePageComponent implements OnInit {
    query: string;
    array = new Array<number>(7);
    headerTitle: string;
    headerMessage: string;
    validCriteria = ["American", "British", "Carribean", "Chinese", "French", "German", "Greek", "Indian", "Italian", "Japanese", "Korean", "Mexican", "Portuguese", "Spanish", "Thai"];
    isInitialized: boolean;
    searchedPosts: [];


    constructor(private activatedRoute: ActivatedRoute, private router: Router) {
    /* This part will only be accessable on load only. So, it will not be accessable on Reload. */
        this.activatedRoute.queryParams.subscribe(queryParams => {
        /* This part will be accessable on Reload */
        this.isInitialized = false;
        this.ngOnInit();
        }));
    }

    ngOnInit() {
        if (!this.isInitialized) {
            this.isInitialized = true;

            this.activatedRoute.queryParams.subscribe(params => {this.query = params.query;});
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
    }

    getPostsMatchingSearchCriteria(searchQuery: string):Array<Object>{
        alert("TODO: Call backend and retrieve posts matching search criteria NOT IMPLEMENTED YET");
        //Use searchQuery here to call Service layer
        //NOTE: Hardcoded to emulate functionality
        posts:Array<Object>
        if (searchQuery.toLowerCase() == "french") posts = [
            {img: "../assets/images/main_pic.jpg",
             comments: [{cid: 2, pid: 3, uid: 4, commentContent: "Hello World"}]
            }
        ];
        else posts = null;
        return posts;
    }

    reloadPage() {
        this.router.navigate([this.router.url]);
    }

    contains(word: string, container:string[]){
        word = word.toLowerCase();
        for (let s of container){
            if (s.toLowerCase() == word) return true;
        }
        return false;

    }

}
