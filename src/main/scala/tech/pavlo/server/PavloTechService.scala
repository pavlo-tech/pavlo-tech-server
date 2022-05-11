package tech.pavlo.server

import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.{Service, http}
import com.twitter.util.Future

class PavloTechService extends Service[http.Request, http.Response] {
  override def apply(request: Request): Future[Response] =
    Future(http.Response(request.version, http.Status.Ok))
}
