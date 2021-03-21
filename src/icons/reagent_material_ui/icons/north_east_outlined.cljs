(ns reagent-material-ui.icons.north-east-outlined
  "Imports @material-ui/icons/NorthEastOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def north-east-outlined (create-svg-icon (e "path" #js {"d" "M9 5v2h6.59L4 18.59 5.41 20 17 8.41V15h2V5H9z"})
                                          "NorthEastOutlined"))
