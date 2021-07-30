(ns reagent-material-ui.icons.switch-left-two-tone
  "Imports @material-ui/icons/SwitchLeftTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def switch-left-two-tone (create-svg-icon [(e "path" #js {"d" "M8.5 8.62v6.76L5.12 12 8.5 8.62", "opacity" ".3"}) (e "path" #js {"d" "M8.5 8.62v6.76L5.12 12 8.5 8.62M10 5l-7 7 7 7V5zm4 0v14l7-7-7-7z"})]
                                           "SwitchLeftTwoTone"))
