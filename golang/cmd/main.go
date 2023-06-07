package main

import (
  "github.com/gin-gonic/gin"
  "code.alipay.com/hello-linke/nytestgolang/talk"
)

func main() {
  r := gin.Default()
  r.LoadHTMLFiles("../web/index.html")
	r.GET("/", func(c *gin.Context) {
		c.HTML(200, "index.html",talk.SayHello())
	})
  r.Run("0.0.0.0:8000") // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")
}