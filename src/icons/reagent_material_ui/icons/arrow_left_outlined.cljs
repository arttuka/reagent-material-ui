(ns reagent-material-ui.icons.arrow-left-outlined
  "Imports @material-ui/icons/ArrowLeftOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-left-outlined (create-svg-icon (e "path" #js {"d" "m14 7-5 5 5 5V7z"})
                                          "ArrowLeftOutlined"))
