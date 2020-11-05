package demo.android.sidemenu.utils

import android.os.Bundle

/**
 * BundleUtil
 */

fun setTostIntoBundle(messae: CharSequence): Bundle {
    val bundle = Bundle()
    bundle.putCharSequence("toast", messae)

    return bundle
}