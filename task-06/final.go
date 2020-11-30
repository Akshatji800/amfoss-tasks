package main

import (
	"context"
	"fmt"
	"log"

	"github.com/vartanbeno/go-reddit/reddit"
)

func main() {
	if err := run(); err != nil {
		log.Fatal(err)
	}
}
var ctx = context.Background()
func run() (err error) {
	withCredentials := reddit.WithCredentials("hHK0b*******REA", "UCu***vu_Zdo8z_******DXhgQ", "Ak*****i", "Ayu******800@")
    client, _ := reddit.NewClient(withCredentials)
	sr, _, err := client.Subreddit.Get(ctx, "golang")
	if err != nil {
		return
	}

	fmt.Printf("%s was created on %s and has %d subscribers.\n", sr.NamePrefixed, sr.Created.Local(), sr.Subscribers)
	return
	// Let's get the top 200 posts of r/golang.
	// Reddit returns a maximum of 100 posts at a time,
	// so we'll need to separate this into 2 requests.
	posts, _, err := client.Subreddit.TopPosts(ctx, "golang", &reddit.ListPostOptions{
		ListOptions: reddit.ListOptions{
			Limit: 100,
		},
		Time: "before week",
	})
	if err != nil {
		return
	}

	for _, post := range posts {
		fmt.Println(post.Title)
		_, err := client.Post.Upvote(context.Background(), "t3_postid")
		if err != nil {
			return err
		}
	}


	return
}
