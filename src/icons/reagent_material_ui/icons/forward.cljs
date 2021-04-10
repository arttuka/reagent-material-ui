(ns reagent-material-ui.icons.forward
  "Imports @material-ui/icons/Forward as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def forward (create-svg-icon (e "path" #js {"d" "M12 8V4l8 8-8 8v-4H4V8z"})
                              "Forward"))
