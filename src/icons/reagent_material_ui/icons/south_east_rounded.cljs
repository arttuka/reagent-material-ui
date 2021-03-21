(ns reagent-material-ui.icons.south-east-rounded
  "Imports @material-ui/icons/SouthEastRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def south-east-rounded (create-svg-icon (e "path" #js {"d" "M18 9c-.56 0-1 .45-1 1v5.59L6.12 4.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L15.59 17H10c-.55 0-1 .45-1 1s.45 1 1 1h8c.55 0 1-.45 1-1v-8c0-.55-.45-1-1-1z"})
                                         "SouthEastRounded"))
