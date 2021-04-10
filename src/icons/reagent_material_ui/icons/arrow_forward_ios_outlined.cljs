(ns reagent-material-ui.icons.arrow-forward-ios-outlined
  "Imports @material-ui/icons/ArrowForwardIosOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-forward-ios-outlined (create-svg-icon (e "path" #js {"d" "M6.49 20.13l1.77 1.77 9.9-9.9-9.9-9.9-1.77 1.77L14.62 12l-8.13 8.13z"})
                                                 "ArrowForwardIosOutlined"))
