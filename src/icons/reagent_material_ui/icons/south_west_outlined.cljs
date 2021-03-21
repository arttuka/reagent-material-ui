(ns reagent-material-ui.icons.south-west-outlined
  "Imports @material-ui/icons/SouthWestOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def south-west-outlined (create-svg-icon (e "path" #js {"d" "M15 19v-2H8.41L20 5.41 18.59 4 7 15.59V9H5v10h10z"})
                                          "SouthWestOutlined"))
