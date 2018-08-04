import { Component, OnInit, Input } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { UserPostService } from '../../services/post-service/user-post.service';
import { Comment } from '../../objects/Comment'

@Component({
  selector: 'app-media-post',
  templateUrl: './media-post.component.html',
  styleUrls: ['./media-post.component.css']
})
export class MediaPostComponent implements OnInit {
    @Input() postId: number;
    @Input() postPic: string;
    @Input() postComments: Comment[];
    @Input() postRecipe: string;

    commentBody = "";
    createCommentDisplay: boolean;
    originalComment: Comment;
    hasRated = false;

    //TODO: initialize with values from the database
    likeCounter = 0;
    dislikeCounter = 0;

    img1Path: string;

  constructor(private cookie: CookieService, private postService: UserPostService) {
      //TODO: Delete, these pictures are for testing only
      this.img1Path = 'assets/images/img_avatar1.png';
      // this.testImage = 'assets/images/testImage.png';
      // this.postPic = 'assets/images/main_pic.jpg';
  }

  public favoriteClicked(){
      alert("TODO: favoriteClicked() not implemented yet.");
  }
  public likeClicked(){
      if (!this.hasRated){
          this.likeCounter++;
          this.hasRated = true;
      }
  }
  public dislikeClicked(){
      if (!this.hasRated){
          this.dislikeCounter++;
          this.hasRated = true;
      }
  }
  public commentClicked(){
      this.createCommentDisplay = !this.createCommentDisplay;
      this.commentBody = "";

  }

  public submitComment(){
      let tempName = this.cookie.get('Username');
      if (tempName == null || tempName == "") tempName = "\<anonymous\>";
      this.postService.createComment(this.postId, tempName, this.commentBody).subscribe(
          returnValue => {
              this.postComments.push(new Comment(tempName, returnValue, this.commentBody));
              this.createCommentDisplay = false;
          }, error => {
              console.log("ERROR");
              console.log(error);}
      );
  }

  ngOnInit() {
      this.createCommentDisplay = false;
      this.originalComment = this.postComments.shift();

  }

}
