package tech.pavlo

import com.twitter.finagle.{Http, Service, http}
import com.twitter.util.{Await, Future}
import tech.pavlo.server.PavloTechService

object Main extends App {
  Await.ready(Http.serve(":8080", new PavloTechService()))
}
