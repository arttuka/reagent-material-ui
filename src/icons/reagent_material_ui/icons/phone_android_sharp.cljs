(ns reagent-material-ui.icons.phone-android-sharp
  "Imports @material-ui/icons/PhoneAndroidSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-android-sharp (create-svg-icon (e "path" #js {"d" "M19 1H5v22h14V1zm-5 20h-4v-1h4v1zm3-3H7V4h10v14z"})
                                          "PhoneAndroidSharp"))
