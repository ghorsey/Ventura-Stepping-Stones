package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def photos = Action { 
    Ok("Photos")
  }

  def rules = Action {
    Ok("Rules")
  }

  def location = Action {
    Ok("location")
  }
}
