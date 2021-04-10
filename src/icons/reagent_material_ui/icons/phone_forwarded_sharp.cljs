(ns reagent-material-ui.icons.phone-forwarded-sharp
  "Imports @material-ui/icons/PhoneForwardedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def phone-forwarded-sharp (create-svg-icon (e "path" #js {"d" "M18 11l5-5-5-5v3h-4v4h4zm-4.79 6.37c-2.83-1.44-5.15-3.75-6.59-6.59l2.53-2.53L8.54 3H3.03C2.45 13.18 10.82 21.55 21 20.97v-5.51l-5.27-.61-2.52 2.52z"})
                                            "PhoneForwardedSharp"))
