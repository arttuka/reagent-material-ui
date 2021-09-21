(ns reagent-mui.icons.phone-forwarded-sharp
  "Imports @mui/icons-material/PhoneForwardedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phone-forwarded-sharp (create-svg-icon (e "path" #js {"d" "m18 11 5-5-5-5v3h-4v4h4zm-4.79 6.37c-2.83-1.44-5.15-3.75-6.59-6.59l2.53-2.53L8.54 3H3.03C2.45 13.18 10.82 21.55 21 20.97v-5.51l-5.27-.61-2.52 2.52z"})
                                            "PhoneForwardedSharp"))
