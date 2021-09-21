(ns reagent-mui.icons.phone-android-sharp
  "Imports @mui/icons-material/PhoneAndroidSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def phone-android-sharp (create-svg-icon (e "path" #js {"d" "M19 1H5v22h14V1zm-5 20h-4v-1h4v1zm3-3H7V4h10v14z"})
                                          "PhoneAndroidSharp"))
