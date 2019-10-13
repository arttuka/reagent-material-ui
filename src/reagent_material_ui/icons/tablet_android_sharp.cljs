(ns reagent-material-ui.icons.tablet-android-sharp
  "Imports @material-ui/icons/TabletAndroidSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-android-sharp (create-svg-icon (e "path" #js {"d" "M21 0H3v24h18V0zm-7 22h-4v-1h4v1zm5.25-3H4.75V3h14.5v16z"})
                                           "TabletAndroidSharp"))
