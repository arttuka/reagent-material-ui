(ns reagent-mui.icons.keyboard-option-key-two-tone
  "Imports @mui/icons-material/KeyboardOptionKeyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-option-key-two-tone (create-svg-icon (e "path" #js {"d" "M15 5h6v2h-6zM9 5H3v2h4.85l6.92 12H21v-2h-5.07z"})
                                                   "KeyboardOptionKeyTwoTone"))
