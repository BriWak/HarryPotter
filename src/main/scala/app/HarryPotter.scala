package app

import app.models._
import app.views.Cauldron

object HarryPotter extends App {
  println(Cauldron.brew(Aconite, DragonHorn, PearlDust).brewed)
  println(Cauldron.brew(Nightshade, Moonstone, DeathCap).brewed)
  //println(Cauldron.brew(ReemBlood, Nightshade, AddersFork))
}



