(ns reagent-material-ui.icons.title
  "Imports @material-ui/icons/Title as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def title (create-svg-icon (e "path" #js {"d" "M5 4v3h5.5v12h3V7H19V4z"})
                            "Title"))
