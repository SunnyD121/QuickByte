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

    //TODO: delete this, for testing purposes only
    testString = "Voilà! In view, a humble vaudevillian veteran, cast vicariously as both victim and villian"
    +" by the vicissitudes of Fate. This visage, no mere veneer of vanity, is a vestige of the"
    +" vox populi, now vacant, vanished. However, this valorous visitation of a by-gone vexation,"
    +" stands vivified and has vowed to vanquish these venal and virulent vermin vanguarding vice"
    +" and vouchsafing the violently vicious and voracious violation of volition. (he carves a \"V\""
    +" into a sign) The only verdict is vengence; a vendetta, held as a votive, not in vain, for"
    +" the value and veracity of such shall one day vindicate the vigilant and the virtuous."
    +" (giggles) Verily, this vichyssoise of verbiage veers most verbose, so let me simply add"
    +" that it is my very good honor to meet you and you may call me V.\n     -V for Vendetta";


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
                this.searchedPosts = this.getPostsMatchingSearchCriteria("trending");
            }
            else {
                this.headerTitle = "Search Results";
                if (!this.contains(this.query, this.validCriteria)){
                    this.headerMessage = "\'" + this.query + "\' is not a valid search criteria. Valid critera are: \n" + this.validCriteria;
                    this.searchedPosts = null;
                }
                else {
                    this.headerMessage = "Showing results for \'" + this.query + "\':";
                    this.searchedPosts = this.getPostsMatchingSearchCriteria("french");
                }
            }
        }
    }

    getPostsMatchingSearchCriteria(searchQuery: string):Array<Object>{
        alert("TODO: Call backend and retrieve posts matching search criteria NOT IMPLEMENTED YET");
        //Use searchQuery here to call Service layer
        //NOTE: Hardcoded to emulate functionality
        let posts:Array<Object>;
        if (searchQuery.toLowerCase() == "trending") posts = [
            {img: "../assets/images/food1.jpg",
             recipe: "Step 1: Take out of box \nStep 2: put in oven \nStep 3: Take out of oven \nStep 4: Eat while hot.",
             comments: [{cid: 1, pid: 2, uid: 3, commentContent: "Hello World"}]
            },
            {img: "../assets/images/food2.jpg",
             recipe: this.testString,
             comments: [{cid: 4, pid: 5, uid: 6, commentContent: "I am saying words and you are reading words."}]
            },
            {img: "../assets/images/food4.jpg",
             recipe: "HelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld\nHelloWorld",
             comments: [{cid: 7, pid: 8, uid: 9, commentContent: "This is a comment!"}]
            }
        ];
        else if (searchQuery.toLowerCase() == "french") posts = [
            {img: "../assets/images/food3.jpg",
             recipe: "Eat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,\nEat,Eat,Eat,",
             comments: [{cid: 10, pid: 11, uid: 12, commentContent: "I can't believe you."}]
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
