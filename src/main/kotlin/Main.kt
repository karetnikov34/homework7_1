
fun main() {
    WallService.add(Post())
    WallService.add(Post())
    WallService.add(Post())

    WallService.createComment(2, comment = Comment(text = "Hi"))
    WallService.createComment(3, comment = Comment(text = "Bye"))
    //WallService.createComment(4, comment = Comment(text = "test"))

    WallService.printAllPosts()

    WallService.printAllComments()
}