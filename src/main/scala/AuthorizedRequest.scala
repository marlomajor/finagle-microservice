import com.twitter.finagle.http.{RequestProxy, Request}
import data.UserData

case class AuthorizedRequest(request: Request, userData: UserData) extends RequestProxy

case class UserData(username: String, roles: List[String])
