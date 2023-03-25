import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {
        val postReturn = WallService.add(Post())
        val postReturn2 = WallService.add(Post())

        assertNotEquals(0, postReturn.id)
        assertNotEquals(0, postReturn2.id)
    }

    @Test
    fun updateTrue() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.add(Post())

        val update = Post(id = 2)

        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.add(Post())

        val update = Post(id = 5)

        val result = WallService.update(update)

        assertFalse(result)
    }

    @Test
    fun createComment() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.add(Post())

        val result = WallService.createComment(2,comment = Comment(id = 0, text = "Hi"))

        assertNotEquals(0, result.id)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        WallService.add(Post())
        WallService.add(Post())
        WallService.add(Post())

        WallService.createComment(55,comment = Comment(id = 0, text = "Hi"))
    }
}