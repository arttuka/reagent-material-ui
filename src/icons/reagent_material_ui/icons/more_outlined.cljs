(ns reagent-material-ui.icons.more-outlined
  "Imports @material-ui/icons/MoreOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def more-outlined (create-svg-icon [(e "path" #js {"d" "M22 3H7c-.69 0-1.23.35-1.59.88L0 12l5.41 8.11c.36.53.97.89 1.66.89H22c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H7.07L2.4 12l4.66-7H22v14z"}) (e "circle" #js {"cx" "9", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "14", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "19", "cy" "12", "r" "1.5"})]
                                    "MoreOutlined"))
