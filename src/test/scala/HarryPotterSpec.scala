import app.models._
import app.views._
import org.scalatest.{MustMatchers, WordSpec}

class HarryPotterSpec extends WordSpec with MustMatchers {

  "HarryPotter" must {

    "return 'Polyjuice Potion brewed' when given Aconite, DragonHorn, and PearlDust" in {
      Cauldron.brew(Aconite, DragonHorn, PearlDust).brewed mustEqual "Polyjuice Potion brewed"
    }

    "return 'Polyjuice Potion brewed' when given Nightshade, Moonstone, and DeathCap" in {
      Cauldron.brew(Nightshade, Moonstone, DeathCap).brewed mustEqual "Draught Of Living Death Potion brewed"
    }

    "throw a BrewingException when given EyeOfNewt, ReemBlood, NifflersFancy" in {
      intercept[BrewingException] {
        Cauldron.brew(EyeOfNewt, ReemBlood, NifflersFancy).brewed
      }
    }
  }
}