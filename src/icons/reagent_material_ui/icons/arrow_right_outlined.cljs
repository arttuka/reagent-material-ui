(ns reagent-material-ui.icons.arrow-right-outlined
  "Imports @material-ui/icons/ArrowRightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-outlined (create-svg-icon (e "path" #js {"d" "M10 17l5-5-5-5v10z"})
                                           "ArrowRightOutlined"))
