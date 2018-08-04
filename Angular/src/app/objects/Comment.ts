export class Comment{
    public commentName:string;
    public comDate:Object;
    public commentText:string;

    constructor(un, dt, msg){
        this.commentName = un;
        this.comDate = dt;
        this.commentText = msg;
    }
}
