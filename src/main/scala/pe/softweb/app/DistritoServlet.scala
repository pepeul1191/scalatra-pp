package pe.softweb.app

import org.scalatra._

class DistritoServlet extends ScalatraServlet {

  get("/listar") {
		contentType="text/html"

		<html>
		<head><title>Test</title></head>
		<body>futura lista de distritos</body>
		</html>
  }

}
