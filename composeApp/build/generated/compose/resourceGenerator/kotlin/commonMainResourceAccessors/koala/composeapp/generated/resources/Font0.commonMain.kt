@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package koala.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.FontResource

private object CommonMainFont0 {
  public val Inter_28pt_ExtraBold: FontResource by 
      lazy { init_Inter_28pt_ExtraBold() }

  public val Inter_28pt_ExtraBoldItalic: FontResource by 
      lazy { init_Inter_28pt_ExtraBoldItalic() }

  public val Inter_28pt_Regular: FontResource by 
      lazy { init_Inter_28pt_Regular() }
}

internal val Res.font.Inter_28pt_ExtraBold: FontResource
  get() = CommonMainFont0.Inter_28pt_ExtraBold

private fun init_Inter_28pt_ExtraBold(): FontResource =
    org.jetbrains.compose.resources.FontResource(
  "font:Inter_28pt_ExtraBold",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/koala.composeapp.generated.resources/font/Inter_28pt-ExtraBold.ttf", -1, -1),
    )
)

internal val Res.font.Inter_28pt_ExtraBoldItalic: FontResource
  get() = CommonMainFont0.Inter_28pt_ExtraBoldItalic

private fun init_Inter_28pt_ExtraBoldItalic(): FontResource =
    org.jetbrains.compose.resources.FontResource(
  "font:Inter_28pt_ExtraBoldItalic",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/koala.composeapp.generated.resources/font/Inter_28pt-ExtraBoldItalic.ttf", -1, -1),
    )
)

internal val Res.font.Inter_28pt_Regular: FontResource
  get() = CommonMainFont0.Inter_28pt_Regular

private fun init_Inter_28pt_Regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:Inter_28pt_Regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/koala.composeapp.generated.resources/font/Inter_28pt-Regular.ttf", -1, -1),
    )
)
