package profile

import java.sql.Timestamp

package object core {
  case class Profile(username: String, bio: Option[String], image: Option[String], following: Boolean)

  case class UserFollower(userId: Long, followeeId: Long, insertedAt: Timestamp)
}