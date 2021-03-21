(ns reagent-material-ui.icons.height-outlined
  "Imports @material-ui/icons/HeightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def height-outlined (create-svg-icon (e "path" #js {"d" "M13 6.99h3L12 3 8 6.99h3v10.02H8L12 21l4-3.99h-3z"})
                                      "HeightOutlined"))
