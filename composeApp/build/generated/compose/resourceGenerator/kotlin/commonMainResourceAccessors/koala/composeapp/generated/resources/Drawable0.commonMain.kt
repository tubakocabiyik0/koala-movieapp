@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package koala.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.DrawableResource

private object CommonMainDrawable0 {
  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }

  public val maltese_portrait: DrawableResource by 
      lazy { init_maltese_portrait() }
}

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/koala.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)

internal val Res.drawable.maltese_portrait: DrawableResource
  get() = CommonMainDrawable0.maltese_portrait

private fun init_maltese_portrait(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:maltese_portrait",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/koala.composeapp.generated.resources/drawable/maltese-portrait.png", -1, -1),
    )
)
