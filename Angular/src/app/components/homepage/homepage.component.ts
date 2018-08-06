import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router, NavigationEnd } from '@angular/router';
import { LowerCasePipe } from '@angular/common';
import { CookieService } from 'ngx-cookie-service';
import { UserPostService } from '../../services/post-service/user-post.service';
import { UserPost } from '../../objects/UserPost'


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
    subheaderMessage: string;
    validCriteria = ["American", "British", "Carribean", "Chinese", "French", "German", "Greek", "Indian", "Italian", "Japanese", "Korean", "Mexican", "Portuguese", "Spanish", "Thai"];
    isInitialized: boolean;
    searchedPosts: UserPost[] = new Array;
    premium: boolean;
    favoritedPosts = [""];
    amazon_prepend = "https://s3.amazonaws.com/quickbytes3/";
    loadingText = "Loading...";

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


    constructor(private activatedRoute: ActivatedRoute, private router: Router, private cookie: CookieService, private postService: UserPostService) {
    /* This part will only be accessable on load only. So, it will not be accessable on Reload. */
        this.activatedRoute.queryParams.subscribe(queryParams => {
        /* This part will be accessable on Reload */
        this.isInitialized = false;
        this.ngOnInit();
        });
    }

    ngOnInit() {
        this.loadingText = "Loading...";
        this.premium = (this.cookie.get("LoggedIn") == 'true');

        if (!this.isInitialized) {
            this.isInitialized = true;

            this.activatedRoute.queryParams.subscribe(params => {this.query = params.query;});
            if (!this.query) {    //if not arriving here via search results
                this.headerTitle = "Welcome";
                this.headerMessage = "QuickByte aims to bring communities of people together through the power" +
                " of food. Our goal is to enable artisans of the culinary community to more easily share their artistry and offer their wisdom" +
                " to new and upcoming chefs. On QuickByte, you can post your favorite recipes*, browse other recipes, rate, and give comments on" +
                " posts that other users have uploaded*. You are also able to search for posts by cutlture.";
                this.subheaderMessage = "* You must be signed in to access this functionality";

                // this.searchedPosts = this.getPostsMatchingSearchCriteria("trending");
                this.getSearchedPosts("trending");
            }
            else {
                this.headerTitle = "Search Results";
                if (!this.contains(this.query, this.validCriteria)){
                    this.headerMessage = "\'" + this.query + "\' is not a valid search criteria. Valid critera are: \n" + this.validCriteria;
                    this.searchedPosts = null;
                    this.loadingText = "";
                }
                else {
                    this.headerMessage = "Showing results for \'" + this.query + "\':";
                    // this.searchedPosts = this.getPostsMatchingSearchCriteria("french");
                    this.getSearchedPosts(this.query);
                }
            }
        }
        else{
            this.loadingText = "";
        }
    }

    

    public getSearchedPosts(tagName){
        this.postService.getPostsByTag(tagName).subscribe(
            returnValue => {
                this.searchedPosts = new Array;
                console.log(returnValue);
                for (let i in returnValue){
                    let post = new UserPost();
                    post.id = returnValue[i].postId;
                    post.img = this.amazon_prepend + returnValue[i].postImgKey;
                    post.recipe = returnValue[i].postContent;
                    post.comments = returnValue[i].comments;
                    post.comments[0]["comDate"] = returnValue[i].postDate;
                    post.title = returnValue[i].postTitle;
                    this.searchedPosts[i] = post;

                }
                this.loadingText = "";   //remove loading text
            }, error => {console.log(error)}
        );
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
