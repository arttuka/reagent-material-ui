(ns reagent-mui.icons.equalizer-two-tone
  "Imports @mui/icons-material/EqualizerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def equalizer-two-tone (create-svg-icon (e "path" #js {"d" "M16 9h4v11h-4zm-6-5h4v16h-4zm-6 8h4v8H4z"})
                                         "EqualizerTwoTone"))
