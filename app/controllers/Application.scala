package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

  def photos = Action { 
    Ok(views.html.photos())
  }

  def rules = Action {
    Ok(views.html.rules())
  }

  def location = Action {
    Ok(views.html.location())
  }
}
