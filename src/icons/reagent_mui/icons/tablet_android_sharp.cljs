(ns reagent-mui.icons.tablet-android-sharp
  "Imports @mui/icons-material/TabletAndroidSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tablet-android-sharp (create-svg-icon (e "path" #js {"d" "M21 0H3v24h18V0zm-7 22h-4v-1h4v1zm5.25-3H4.75V3h14.5v16z"})
                                           "TabletAndroidSharp"))
