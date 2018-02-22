package app.views

import app.models._

object Cauldron {

  def brew(ingredient1: Ingredient, ingredient2: Ingredient, ingredient3: Ingredient): Potion = {
    if(ingredient1.name == Aconite.name && ingredient2.name == DragonHorn.name && ingredient3.name == PearlDust.name) {
      new PolyjuicePotion
    } else if(ingredient1.name == Nightshade.name && ingredient2.name == Moonstone.name && ingredient3.name == DeathCap.name) {
      new DraughtOfLivingDeath
    } else {
      throw new BrewingException()
    }
  }

}
