(ns reagent-material-ui.icons.maximize-outlined
  "Imports @material-ui/icons/MaximizeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def maximize-outlined (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3V3z"})
                                        "MaximizeOutlined"))
