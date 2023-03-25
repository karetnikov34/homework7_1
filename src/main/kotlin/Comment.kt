import attachments.Attachment

data class Comment (
    val id: Int = 0,
    val fromID: Int = 0,
    val date: Int = 0,
    var text: String,
    var donut: Any? = arrayOf(false, " "),
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    var attachments: Attachment? = null,
    val parentsStack: Array<Int>? = null,
    val thread: Thread? = null,
    )

data class Thread(
    var count: Int = 0,
    var items: Array<Any>? = null,
    var canPost: Boolean = true,
    var showReplyButton: Boolean = true,
    var groups_can_post: Boolean = true
)
