(ns reagent-mui.icons.keyboard-capslock-sharp
  "Imports @mui/icons-material/KeyboardCapslockSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-capslock-sharp (create-svg-icon (e "path" #js {"d" "M12 8.41 16.59 13 18 11.59l-6-6-6 6L7.41 13 12 8.41zM6 18h12v-2H6v2z"})
                                              "KeyboardCapslockSharp"))
