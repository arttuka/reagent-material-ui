(ns reagent-material-ui.icons.forward-two-tone
  "Imports @material-ui/icons/ForwardTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def forward-two-tone (create-svg-icon [(e "path" #js {"d" "M14 14v1.17L17.17 12 14 8.83V10H6v4z", "opacity" ".3"}) (e "path" #js {"d" "m20 12-8-8v4H4v8h8v4l8-8zM6 14v-4h8V8.83L17.17 12 14 15.17V14H6z"})]
                                       "ForwardTwoTone"))
