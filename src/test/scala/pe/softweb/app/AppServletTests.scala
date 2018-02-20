package pe.softweb.app

import org.scalatra.test.scalatest._

class AppServletTests extends ScalatraFunSuite {

  addServlet(classOf[AppServlet], "/*")

  test("GET / on AppServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
