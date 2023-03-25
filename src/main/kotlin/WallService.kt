object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = 2 + posts.lastIndex)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, currentPost) in posts.withIndex()) {
            if (post.id == currentPost.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts){
            if (postId == post.id) {
                comments += comment.copy(id = 2 + comments.lastIndex)
                return comments.last()
            }
        }
        throw PostNotFoundException("Post with id $postId not found")
    }

    fun printAllPosts () {
        for (post in posts) {
            println(post)
        }
    }

    fun printAllComments () {
        for (comment in comments) {
            println(comment)
        }
    }

    fun clear() {
        posts = emptyArray()
    }
}